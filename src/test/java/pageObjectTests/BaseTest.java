package pageObjectTests;


import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String url;
    protected Faker faker;

    @Parameters({"url","username","password","browser"})

    @BeforeMethod
    public void startUp(String url,String username,String password,String browser) {
        BrowserType type = browser.equals("chrome") ? BrowserType.CHROME:BrowserType.FIREFOX;
        driver = BrowserFabric.getDriver(type);
        this.username =username;
        this.password =password;
        this.url = url;
        faker = new Faker();
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if (iTestResult.getStatus()==iTestResult.FAILURE){
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("=MM-dd-yyyy--HH-mm-ss");
            String filename = iTestResult.getName()+formatter.format(date);
            ScreenShot.get(driver,filename);
//            ScreenShot.get(driver, iTestResult.getName());
        }
//        Thread.sleep(3000);
        driver.quit();
    }
}
