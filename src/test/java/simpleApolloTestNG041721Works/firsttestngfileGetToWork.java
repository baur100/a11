package simpleApolloTestNG041721Works;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class firsttestngfileGetToWork {
    //public String baseUrl = "http://demo.guru99.com/test/newtours/";
    public String baseUrl = "https://www.apollopros.com/member/login.aspx";
    public String driverPath = "C:\\Webdrivers041721\\geckodriver.exe";
    public String goodUserName = "klingergk@mail.com";
    public String goodPassword = "GeorgeSmith123!";

    public WebDriver driver ;
    //WebDriverWait wait = new WebDriverWait(driver, 10);

    @Test
    public void verifyHomepageTitle() {

        System.out.println("launching firefox browser");
        System.setProperty("webdriver.gecko.driver", driverPath);
        //System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        //String expectedTitle = "Welcome: Mercury Tours";
        String expectedTitle = "Member login page | Apollo Professional Solutions, Inc.";
        String actualTitle = driver.getTitle();
        System.out.println("Title is " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();


        } //end of verifyHomepageTitle() {

    @Test
    public void loginTestGoodLogin() {
        //WebDriverWait wait = new WebDriverWait(driver, 10); NOt working
        System.out.println("launching firefox browser");
        System.setProperty("webdriver.gecko.driver", driverPath);
        //System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        emailLogin.sendKeys(goodUserName);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement passWord = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        passWord.sendKeys(goodPassword);
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        Submitbutton.click();


        //MainPage mainPage = loginPage.loginToApp(goodUserName,goodPassword);
        //Assert.assertTrue(mainPage.isMainPage());
        //Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();



    } //end loginTestGoodLogin()


} //end of class
