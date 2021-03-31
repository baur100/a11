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

public class gregsKoelLoginTest032921 {
    private WebDriverWait wait;
    @Test
    public void AITPLATest() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("http://koelapp.testpro.io");
        //using cssSelector below to locate login box:
        //driver.findElement(By.cssSelector("[type='email']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        email.sendKeys("koeluser06@testpro.io");
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("te$t$tudent");
        WebElement button = driver.findElement(By.tagName("button"));

        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        Assert.assertTrue(driver.findElement(By.className("home")).isDisplayed());


        //clicking in second page

        //need to click on the "allow notifications" pop up.
       //driver.switchTo().alert().dismiss();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"playlists\"]/h1/i")));
        driver.switchTo().alert().accept();
        WebElement playerButton = driver.findElement(By.xpath("//*[@id=\"playlists\"]/h1/i"));
        playerButton.click();





    }


} //end of class
