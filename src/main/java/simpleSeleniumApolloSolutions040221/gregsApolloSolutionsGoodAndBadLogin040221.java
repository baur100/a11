package simpleSeleniumApolloSolutions040221;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class gregsApolloSolutionsGoodAndBadLogin040221 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.apollopros.com/member/login.aspx");

        //good login below:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        emailLogin.sendKeys("klingergk@mail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement passWord = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        passWord.sendKeys("GeorgeSmith123!");
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        Submitbutton.click();

        WebElement logoutDropDown = driver.findElement(By.cssSelector("#memberProfileDropdown"));
        logoutDropDown.click();
        WebElement logoutOption = driver.findElement(By.cssSelector("#memberProfileLogout > a"));
        logoutOption.click();

        //Login Test; invalid code below:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apollopros.com/member/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLoginBad = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        emailLoginBad.sendKeys("HIThere@123.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement passWordBad = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        passWordBad.sendKeys("thisSucks");
        WebDriverWait waitTwo = new WebDriverWait(driver, 60);
        WebElement SubmitbuttonBad = driver.findElement(By.cssSelector("#btnLogin"));
        SubmitbuttonBad.click();

    }

}
