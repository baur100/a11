package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public class LoginTests {
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
    public void loginTest_LoginWithCorrectCredetials_mainPageOpened(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.open();
        MainPage mainPage = loginpage.loginToApp("testerjo168@gmail.com", "te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.open();
        loginpage.loginToApp("testerjo168@gmail.com", "wrongPW");
        Assert.assertTrue(loginpage.isErrorFrame());
    }
}
