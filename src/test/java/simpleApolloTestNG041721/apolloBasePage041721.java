package simpleApolloTestNG041721;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.ScreenShot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class apolloBasePage041721 {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public apolloBasePage041721(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
}
