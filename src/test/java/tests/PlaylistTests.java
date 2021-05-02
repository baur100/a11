package tests;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator1;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTest_createPlaylist_playlistCreated(){
//        String playlistName = TestDataGenerator1.getRandomString(7);
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.open(url);
        MainPage mainPage = loginpage.loginToApp(username, password);
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
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
