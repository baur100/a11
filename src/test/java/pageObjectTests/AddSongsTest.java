package pageObjectTests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

public class AddSongsTest extends BaseTest{

    @Test
    public void addSongsTest_addSongsToPlaylist() throws InterruptedException {
        Faker faker=new Faker();
        String playlistName = faker.funnyName().name();
        System.out.println(playlistName);

        MyLoginPage loginPage=new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        String playlistId=mainPage.createPlaylist(playlistName);
        Thread.sleep(2000);
        mainPage.addSongToPlaylist(playlistId,playlistName);
        Thread.sleep(3000);
        Assert.assertTrue(mainPage.isSongExistInPlaylist());

    }
}
