package simpleApollopageObjectsTests041521NotWorking;

import com.github.javafaker.Faker;
import listeners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest {
    private static Logger logger = LogManager.getLogger(PlaylistTests.class);

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTest_createPlaylist_playlistCreated() {
        logger.debug("==============================");
        logger.debug("In the test ");
        Faker faker = new Faker();
        logger.debug("Faker created");
        String playlistName = faker.funnyName().name();
        logger.info("Playlist name = "+playlistName);

        LoginPage loginPage = new LoginPage(driver);
        logger.debug("Login page created");
        loginPage.open(url);
        logger.debug("Login page opened");
        MainPage mainPage = loginPage.loginToApp(username,password);
        logger.info("Logged using username = "+username+ " and password = "+password);
        String playlistId = mainPage.createPlaylist(playlistName);
        logger.info("Created playlist id = "+playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
        boolean pass = false;
        if(errorCount == 2){
            pass=true;
        }
        errorCount++;
        Assert.assertTrue(pass);
        logger.info("Assert passed");
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed(){
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
    @Test
    public void playlistTest_createPlaylist_playlistCreated1() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed1(){
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
    @Test
    public void playlistTest_createPlaylist_playlistCreated2() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed2(){
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
    @Test
    public void playlistTest_createPlaylist_playlistCreated3() {
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId,playlistName));
    }
    @Test(enabled = false)
    public void playlistTest_renamePlaylist_playlistRenamed3(){
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
