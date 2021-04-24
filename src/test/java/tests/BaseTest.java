package tests;

import enums.BrowserType;
import helpers.BrowserFabric1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;

    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric1.getDriver(BrowserType.CHROME);
        username = "testerjo168@gmail.com";
        password = "te$t$tudent";

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
