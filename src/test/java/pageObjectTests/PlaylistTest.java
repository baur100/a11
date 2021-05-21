package pageObjectTests;

import listeners.RetryAnalyzer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

public class PlaylistTest extends BaseTest {
    private static Logger logger = LogManager.getLogger(PlaylistTest.class);

    @Test
    public void playlistTest_createPlaylist(ITestContext test) {
        logger.debug("============================");
        logger.debug("In the test "+test.getName());
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);
        logger.info("Playlist name = "+playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        logger.debug("Login page is created");
        loginPage.open(url);
        logger.debug("Login page is opened");
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        logger.info("Logged using username "+username+" and password "+password);
        String playlistId = mainPage.createPlaylist(playlistName);
        logger.info("Created playlist id = "+playlistId);
//        System.out.println(playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
        logger.info("Assert passed");
    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed(ITestContext test) {
        logger.debug("In the test "+test.getName());
        String playlistName = faker.funnyName().name();

//        System.out.println(playlistName);
        logger.info("Playlist name = "+playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        logger.debug("Login page is created");
        loginPage.open(url);
        logger.debug("Login page is opened");
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        logger.info("Logged using username "+username+" and password "+password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);
        logger.info("Created playlist id = "+playlistId);
        String newName = faker.ancient().hero();
//        System.out.println(newName);
        mainPage.renamePlaylist(playlistId, newName);
        logger.info("New name = "+ newName);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
        logger.info("Assert passed");
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTest_createPlaylist1() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTest_renamePlaylist_playlistRenamed1() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);

        String newName = faker.ancient().hero();
//        System.out.println(newName);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }

    @Test
    public void playlistTest_createPlaylist2() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed2() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);

        String newName = faker.ancient().hero();
//        System.out.println(newName);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTest_createPlaylist3() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTest_renamePlaylist_playlistRenamed3() {
        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);

        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);
//        System.out.println(playlistId);

        String newName = faker.ancient().hero();
//        System.out.println(newName);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
}
