package tests;

import enums.BrowserType1;
import helpers.BrowserFabric1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;

    @Parameters({"url", "username", "password", "browser"})
    @BeforeMethod
    public void startUp(String url, String username, String password, String browser){
        BrowserType1 type = browser.equals("chrome") ? BrowserType1.CHROME : BrowserType1.FIREFOX;
        driver = BrowserFabric1.getDriver(BrowserType1.FIREFOX);
        driver.manage().window().maximize();
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
