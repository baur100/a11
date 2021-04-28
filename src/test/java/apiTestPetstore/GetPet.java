package apiTestPetstore;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPet {
    @Test
    public void getPetById(){
        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/1001")
                .header("accept","application/json")
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
//        Pet pet = jsonPath.getObject("$",Pet.class);
//        System.out.println(pet.getCategory().getName());
//        Assert.assertEquals(pet.getName(),"Super Star");
        Category category = jsonPath.getObject("category",Category.class);
        System.out.println(category.getName());



    }
}
