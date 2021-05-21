package pageObjectTests;

import enums.BrowserType1;
import helpers.BrowserFabric1;
import helpers.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;
    protected int errorCount = 0;
    @Parameters({"url","username","password", "browser"})
    @BeforeMethod
    public void startUp(String url, String username, String password, String browser){
        BrowserType1 type = browser.equals("chrome") ? BrowserType1.CHROME : BrowserType1.FIREFOX;
        driver = BrowserFabric1.getDriver(type);
        this.username = username;
        this.password = password;
        this.url = url;
        System.out.println("In Base BEFORE METHOD");
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
        System.out.println("In Base AFTER METHOD");
        if(iTestResult.getStatus()==iTestResult.FAILURE){
            ScreenShot.get(driver, iTestResult.getName());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
