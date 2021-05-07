//package pageObjectTests;
//
//import com.github.javafaker.Faker;
//import org.testng.annotations.Test;
//import pageObjects.MainPage;
//import pageObjects.MyLoginPage;
//
//public class AddSongsTest extends BaseTest{
//
//    @Test
//    public void addSongsTest_addSongsToPlaylist() throws InterruptedException {
//        Faker faker=new Faker();
//        String playlistName = faker.funnyName().name();
//        System.out.println(playlistName);
//
//        MyLoginPage loginPage=new MyLoginPage(driver);
//        loginPage.open(url);
//        MainPage mainPage = loginPage.LoginToApplication(username,password);
//        mainPage.createPlaylist(playlistName);
//        mainPage.addSongsToPlaylist();
//
//    }
//}
