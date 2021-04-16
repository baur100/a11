package simpleApollopageObjectsTests041521NotWorking;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPageFactory;
import pageObjects.MainPage;

public class LoginPageFactoryTest extends BaseTest {
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,password);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame1(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,password);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame2(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,password);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
    @Test
    public void loginTest_loginWithCorrectCredentials_mainPageOpened3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame3(){
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.open(url);
        loginPage.loginToApp(username,password);
        Assert.assertTrue(loginPage.isErrorFrame());
    }
}
