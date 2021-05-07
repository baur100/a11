package apiTestPetStore;

import helpers.TestDataGenerators;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPet {
    private long petId;
    private Pet pet;

    @BeforeMethod
    public void createPet(){
        pet = TestDataGenerators.generateRandomPet();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .body(pet)
                .when()
                        .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        petId = response.jsonPath().getLong("id");
        System.out.println(petId);
    }

    @AfterMethod
    public void petTest_deletePet(){
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .when()
                        .delete()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
    }
    @Test
    public void petTest_getPetById_petReturned() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                .when()
                        .get()
                .then()
                        .statusCode(200)
                        .extract()
                        .response();
//        System.out.println(response.jsonPath().prettify());
        JsonPath jsonPath =response.jsonPath();
        Pet petResponse = jsonPath.getObject("$", Pet.class);
//        System.out.println(pet.getName());
        Assert.assertEquals(pet.getName(),petResponse.getName());
        Assert.assertEquals(pet.getCategory().getName(),petResponse.getCategory().getName());
        Assert.assertEquals(pet.getCategory().getId(),petResponse.getCategory().getId());
        Assert.assertEquals(pet.getPhotoUrls()[0],petResponse.getPhotoUrls()[0]);

//        Category category = jsonPath.getObject("category", Category.class);
//        System.out.println(category.getName());
    }

    @Test
    public void petTest_updatePet(){
        Pet updatePet = TestDataGenerators.generateRandomPet();
        updatePet.setId(petId);
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .body(updatePet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        System.out.println(response.jsonPath().prettify());
        JsonPath jsonPath =response.jsonPath();
        Pet petResponse = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(updatePet.getName(),petResponse.getName());
        Assert.assertEquals(updatePet.getCategory().getName(),petResponse.getCategory().getName());
        Assert.assertEquals(updatePet.getCategory().getId(),petResponse.getCategory().getId());
        Assert.assertEquals(updatePet.getPhotoUrls()[0],petResponse.getPhotoUrls()[0]);
    }
}
