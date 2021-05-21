package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPage;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest_LoginToAppUsingCorrectCredentials(){
        MyLoginPage loginPage= new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_LoginToAppUsingIncorrectCredentials(){
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_LoginToAppUsingCorrectCredentials1(){
        MyLoginPage loginPage= new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_LoginToAppUsingIncorrectCredentials1(){
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_LoginToAppUsingCorrectCredentials2(){
        MyLoginPage loginPage= new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_LoginToAppUsingIncorrectCredentials2(){
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_LoginToAppUsingCorrectCredentials3(){
        MyLoginPage loginPage= new MyLoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_LoginToAppUsingIncorrectCredentials3(){
        MyLoginPage loginPage = new MyLoginPage(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
