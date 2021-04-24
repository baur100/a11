package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPageFactory;
import pages.MainPageFactory;

public class LoginPageFactoryTest extends BaseTest{
    @Test
    public void loginTest_LoginWithCorrectCredetials_mainPageOpened(){
        LoginPageFactory loginpage = new pages.LoginPageFactory(driver);
        loginpage.open();
        MainPageFactory mainPage = loginpage.loginToApp(username, password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginTest_loginWithIncorrectCredentials_errorFrame(){
        LoginPageFactory loginpage = new LoginPageFactory(driver);
        loginpage.open();
        loginpage.loginToApp(username, "wrongPW");
        Assert.assertTrue(loginpage.isErrorFrame());
    }
}
