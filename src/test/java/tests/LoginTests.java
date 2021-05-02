package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

import java.time.Duration;

public class LoginTests extends BaseTest{

    @Test
    public void loginTest_LoginWithCorrectCredetials_mainPageOpened(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.open(url);
        MainPage mainPage = loginpage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.open(url);
        loginpage.loginToApp(username, "WrongPW");
        Assert.assertTrue(loginpage.isErrorFrame());
    }
}
