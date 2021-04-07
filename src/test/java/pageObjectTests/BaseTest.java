package pageObjectTests;

import enums.BrowserType;
import helpers.BrowserFabric;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.FIREFOX);
        username = "koeluser06@testpro.io";
        password = "te$t$tudent";
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
