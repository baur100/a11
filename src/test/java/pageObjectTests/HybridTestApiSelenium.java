package pageObjectTests;

import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

import static io.restassured.RestAssured.given;


public class HybridTestApiSelenium extends BaseTest{
    private String token;
    private String playlistName;
    private int playlistId;


    @BeforeMethod
    public void startUp(){
        token = Token.getToken();
        playlistName = faker.friends().character();
        CreatePlaylistRequest playlist= new CreatePlaylistRequest (playlistName);
        System.out.println(playlistName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("accept","application/json")
                        .header("Content-Type", "application/json")
                        .header("Authorization",token)
                        .body(playlist)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath =response.jsonPath();
//        PlaylistResponse playlistResponse = jsonPath.getObject("$", PlaylistResponse.class);
        playlistId = jsonPath.getInt("id");
    }
    @AfterMethod
    public void deletePlaylist(){
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("accept","application/json")
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
    public void renamePlaylist_playlistRenamed(){
        String newPlaylistName = faker.book().title();
        System.out.println("New Playlist name - "+newPlaylistName);
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        mainPage.renamePlaylist(playlistId+"", newPlaylistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId+"",newPlaylistName));
    }

}
