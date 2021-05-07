package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Koellogin {
    private WebDriver driver;
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;

    @BeforeMethod
    public void startUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10,200);
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
        driver.get("https://koelapp.testpro.io/");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void koelLoginToAppUsingCorrectCredentials_SuccessfulLogin() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement bluebutton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("nsudenkov@hotmail.com");
        passwordField.sendKeys("te$t$tudent");
        bluebutton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='home active']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='home active']"));
        Assert.assertTrue(homeIcon.isDisplayed());
    }

    @Test
    public void koelLoginToAppUsingWrongCredentials_ErrorFrame() throws InterruptedException {
        fluentWait.until(x->x.findElement(By.xpath("//*[@type='email']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement bluebutton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("nsudenkov@hotmail.com");
        passwordField.sendKeys("IncorrectPassword");
        bluebutton.click();

        fluentWait.until(x->x.findElement(By.xpath("//*[@class='error']")));
        WebElement homeIcon = driver.findElement(By.xpath("//*[@class='error']"));
        Assert.assertTrue(homeIcon.isDisplayed());
    }
}
