package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.LoginPageFactory;

public class LoginPageFactoryTest extends BaseTest{
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open();
        loginPage.loginToApp(username,password);
        Assert.assertTrue(loginPage.isErrorFrame());

    }
}
