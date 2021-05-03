package tests;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class PlaylistTests extends BaseTest{
    private static Logger logger = LogManager.getLogger(PlaylistTests.class);
    @Test
    public void playlistTest_createPlaylist_playlistCreated(ITestContext test){
        logger.debug("==========================================");
        logger.debug("In the test " + test.getName());
//        String playlistName = TestDataGenerator1.getRandomString(7);
        Faker faker = new Faker();
        logger.debug("Faker created");
        String playlistName = faker.funnyName().name();
        logger.info("Playlist name = " + playlistName);
        LoginPage loginpage = new LoginPage(driver);
        logger.debug("Login page created");
        loginpage.open(url);
        logger.debug("Login page opened");
        MainPage mainPage = loginpage.loginToApp(username, password);
        logger.info("Logged using username " + username + " and password " + password);
        String playlistId = mainPage.createPlaylist(playlistName);
        logger.info("Created playlist id = " + playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
        logger.info("Assert passed");
    }

    @Test
    public void playlistTest_createSmartPlaylist_playlistCreate(){
        Faker faker = new Faker();

        String smartPlaylistName = faker.funnyName().name();
        int songLengthGreaterThan = TestDataGenerator1.getRandomNumber();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username, password);
        String playlistId = mainPage.createSmartPlaylist(smartPlaylistName, songLengthGreaterThan);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, smartPlaylistName));
    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.open(url);
        MainPage mainPage = loginpage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
}
