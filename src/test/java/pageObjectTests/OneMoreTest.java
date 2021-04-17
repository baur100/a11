package pageObjectTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class OneMoreTest extends BaseTest {
    @Test
    public void oh_iRenamedTheTest(){
        var faker = new Faker();
        var playlistName = faker.funnyName().name();

        var loginPage = new LoginPage(driver);
        loginPage.open(url);
        var mainPage = loginPage.loginToApp(username,password);
        var playlistId = mainPage.createPlaylist(playlistName);

        var newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
}
