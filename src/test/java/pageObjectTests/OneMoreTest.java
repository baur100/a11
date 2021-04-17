package pageObjectTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class OneMoreTest extends BaseTest {
    @Test
    public void playlistTest_renamePlaylist_playlistRenamedxx(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,newName));
    }
}
