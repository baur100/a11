package pageObjectTests;

import com.github.javafaker.Faker;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

public class AddSongsTest extends BaseTest{

    @Test
    public void addSongsTest_addSongsToPlaylist(){
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }

    @Test
    public void addSongsTest_addSongsToPlaylist1(){
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }

    @Test
    public void addSongsTest_addSongsToPlaylist2(){
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void addSongsTest_addSongsToPlaylist3(){
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }
    @Test
    public void addSongsTest_addSongsToPlaylist4(){
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }
}
