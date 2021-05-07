package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPageFactory;

public class PlaylistTestFactory extends BaseTest{

    @Test
    public void playlistTestFactory_createPlaylist(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,playlistName));
    }
    @Test
    public void playlistTestFactory_renamePlaylist_playlistRenamed(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);

        String newName = faker.ancient().hero();
        System.out.println(newName);
        mainPageFactory.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTestFactory_createPlaylist1(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,playlistName));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTestFactory_renamePlaylist_playlistRenamed1(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);

        String newName = faker.ancient().hero();
        System.out.println(newName);
        mainPageFactory.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTestFactory_createPlaylist2(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,playlistName));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTestFactory_renamePlaylist_playlistRenamed2(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);

        String newName = faker.ancient().hero();
        System.out.println(newName);
        mainPageFactory.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,newName));
    }
    @Test
    public void playlistTestFactory_createPlaylist3(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,playlistName));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTestFactory_renamePlaylist_playlistRenamed3(){
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPageFactory = loginPage.LoginToApplication(username,password);
        String playlistId = mainPageFactory.createPlaylist(playlistName);
        System.out.println(playlistId);

        String newName = faker.ancient().hero();
        System.out.println(newName);
        mainPageFactory.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPageFactory.isPlaylistExist(playlistId,newName));
    }
}
