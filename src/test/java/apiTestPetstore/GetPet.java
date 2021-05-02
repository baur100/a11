package apiTestPetstore;

import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPet {
    private long petId;
    private Pet pet;

    @BeforeMethod
    public void createPet(){
        pet = TestDataGenerator.generateRandomPet();
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet")
                .body(pet)
                .header("accept","application/json")
                .header("Content-Type", "application/json")
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        petId = response.jsonPath().getLong("id");
    }
    @AfterMethod
    public void killPet(){
        Response response = given()
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
    public void getPetById(){
        Response response = given()
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
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
        Assert.assertEquals(pet.getName(),petResponse.getName());
        Assert.assertEquals(pet.getCategory().getName(),petResponse.getCategory().getName());
        Assert.assertEquals(pet.getCategory().getId(),petResponse.getCategory().getId());
        Assert.assertEquals(pet.getPhotoUrls()[0],petResponse.getPhotoUrls()[0]);
//        Category category = jsonPath.getObject("category",Category.class);
//        System.out.println(category.getName());



    }

    @Test
    public void updatePet(){
        Pet updatedPet = TestDataGenerator.generateRandomPet();
        updatedPet.setId(petId);
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet")
                .body(updatedPet)
                .header("accept","application/json")
                .header("Content-Type", "application/json")
                .when()
                .put()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
        Assert.assertEquals(updatedPet.getName(),petResponse.getName());
        Assert.assertEquals(updatedPet.getCategory().getName(),petResponse.getCategory().getName());
        Assert.assertEquals(updatedPet.getCategory().getId(),petResponse.getCategory().getId());
        Assert.assertEquals(updatedPet.getPhotoUrls()[0],petResponse.getPhotoUrls()[0]);
    }
}
