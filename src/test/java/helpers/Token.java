package helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Cradentials;

import static io.restassured.RestAssured.given;

public class Token {
    public static String getToken(){
        Cradentials cred=new Cradentials("nsudenkov@hotmail.com","te$t$tudent");
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/me")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .body(cred)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
//        System.out.println(response.jsonPath().prettify());
        JsonPath jsonPath =response.jsonPath();
        String token = jsonPath.getString("token");
        return "Bearer"+token;
    }
}
