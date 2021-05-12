package pageObjectTests;

import helpers.Token;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

import static io.restassured.RestAssured.given;

public class HybridTestApiSelenium2 extends BaseTest{
    private String playlistId;

    @Test
    public void createPlaylist_PlaylistCreated(){
        String playlistName = faker.app().name();
        System.out.println(playlistName);
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @AfterMethod
    public void deletePlaylist(){
        String token = Token.getToken();
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
}
