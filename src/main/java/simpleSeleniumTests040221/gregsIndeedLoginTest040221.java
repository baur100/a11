package simpleSeleniumTests040221;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class gregsIndeedLoginTest040221 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://secure.indeed.com/account/login");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#login-email-input"));
        emailLogin.sendKeys("HiThere@this.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-password-input")));
        WebElement passWord = driver.findElement(By.cssSelector("#login-password-input"));
        passWord.sendKeys("23542342342343");
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#login-submit-button"));
        Submitbutton.click();

    }
}

