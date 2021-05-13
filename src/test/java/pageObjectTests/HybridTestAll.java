package pageObjectTests;

import com.github.javafaker.Faker;
import helpers.DbAdapter;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.Playlist;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class HybridTestAll extends BaseTest {
    private String token;
    private String playlistName;
    private int playlistId;
    Faker faker;
    @BeforeMethod
    public void startUp(){
        System.out.println("in the test BEFORE METHOD");
        faker = new Faker();
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
    public void cleanUp(){
        System.out.println("In the test AFTER METHOD");
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Accept","application/json")
                .header("Content-Type", "application/json")
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void renamePlaylist_playlistRenamed(){
        String newName = faker.dragonBall().character();
        System.out.println(newName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        mainPage.renamePlaylist(playlistId+"",newName);
        Playlist playlistFromDb = DbAdapter.getPlaylistById(playlistId);
        Assert.assertEquals(newName,playlistFromDb.getName());
    }
}
