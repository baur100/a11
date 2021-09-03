package eversourceTest;

import eversoursePageObject.AccountPage;
import eversoursePageObject.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void LoginTest_LoginToAppUsingCorrectCradentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        AccountPage accountPage = loginPage.LoginToApplication("......","......");
        Assert.assertTrue(accountPage.isAccountNumber());
    }

}
