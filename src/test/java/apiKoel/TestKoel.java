package apiKoel;

import com.github.javafaker.Faker;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.PlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestKoel {
    private int playlistId;
    private String playlistName;
    private String token;
    @BeforeMethod
    public void createPlaylist(){
        Faker faker = new Faker();
        token = Token.get();
        playlistName = faker.artist().name();
        System.out.println(playlistName);
        CreatePlaylistRequest playlistRequest = new CreatePlaylistRequest(playlistName);
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .body(playlistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        playlistId = jsonPath.getInt("id");
    }
    @AfterMethod
    public void deletePlaylistAfterTest(){
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .when()
                .delete()
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
    @Test
    public void getPlaylist(){
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        PlaylistResponse[] playlists = jsonPath.getObject("$",PlaylistResponse[].class);
        System.out.println(playlists.length);
        for (PlaylistResponse pl :playlists){
            if (pl.getId()==playlistId){
                System.out.println("We have a match");
                Assert.assertEquals(playlistName,pl.getName());
            }
        }
    }
    @Test
    public void purgeIt() throws InterruptedException {
        Response response = given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist")
                .header("Accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        PlaylistResponse[] playlists = jsonPath.getObject("$",PlaylistResponse[].class);
        System.out.println(playlists.length);
        for (PlaylistResponse pl :playlists){
            Thread.sleep(1000);
            given()
                    .baseUri("https://bbb.testpro.io/")
                    .basePath("api/playlist/"+pl.getId())
                    .header("Accept","application/json")
                    .header("Content-Type", "application/json")
                    .header("Authorization",token)
                    .when()
                    .delete()
                    .then()
                    .statusCode(200)
                    .extract()
                    .response();

        }
    }
}
