package helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;

import static io.restassured.RestAssured.given;

public class Token {
    public static String get(){
        Credentials body = new Credentials("koeluser06@testpro.io","te$t$tudent");
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/me")
                .header("accept","application/json")
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }
}
