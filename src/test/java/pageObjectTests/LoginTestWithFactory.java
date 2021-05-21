package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.MyLoginPageFactory;

public class LoginTestWithFactory extends BaseTest{

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingCorrectCredentials(){
        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingIncorrectCredentials(){
        MyLoginPageFactory loginPage = new MyLoginPageFactory(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingCorrectCredentials1(){
        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingIncorrectCredentials1(){
        MyLoginPageFactory loginPage = new MyLoginPageFactory(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingCorrectCredentials2(){
        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingIncorrectCredentials2(){
        MyLoginPageFactory loginPage = new MyLoginPageFactory(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingCorrectCredentials3(){
        MyLoginPageFactory loginPage= new MyLoginPageFactory(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.LoginToApplication(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTestFactory_LoginToAppUsingIncorrectCredentials3(){
        MyLoginPageFactory loginPage = new MyLoginPageFactory(driver);
        loginPage.open(url);
        loginPage.LoginToApplication(username,"WrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
