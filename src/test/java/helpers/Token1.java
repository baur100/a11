package helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials1;

import static io.restassured.RestAssured.given;

public class Token1 {
    public static String getToken(){
        Credentials1 body = new Credentials1("testerjo168@gmail.com", "te$t$tudent");
        Response response =  given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/me")
                .header("accept", "application/json")
                .header("Content-type", "application/json")
                .body(body)
                .when()
                .post()// can change here to POST, PUT, DELETE, or PATCH
                .then()
                .statusCode(200) // We assert status code is 200
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer " + jsonPath.getString("token");
    }
}
