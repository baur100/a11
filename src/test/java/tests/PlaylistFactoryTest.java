package tests;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.openqa.selenium.JavascriptExecutor;
import pages.LoginPageFactory;
import pages.MainPageFactory;

public class PlaylistFactoryTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void playlistTest_createPlaylist_playlistCreated(){
//        String playlistName = TestDataGenerator1.getRandomString(7);
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();
        LoginPageFactory loginpage = new LoginPageFactory(driver);
        loginpage.open();
        MainPageFactory mainPage = loginpage.loginToApp("testerjo168@gmail.com", "te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, playlistName));
    }

    @Test
    public void playlistTest_renamePlaylist_playlistRenamed(){
        Faker faker = new Faker();
        String playlistName = faker.funnyName().name();

        LoginPageFactory loginpage = new LoginPageFactory(driver);
        loginpage.open();
        MainPageFactory mainPage = loginpage.loginToApp("testerjo168@gmail.com", "te$t$tudent");
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.ancient().hero();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId, newName));
    }
}
