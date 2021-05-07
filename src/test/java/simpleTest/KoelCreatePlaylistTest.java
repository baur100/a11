package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelCreatePlaylistTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver,10,200);
        driver.get("http://koelapp.testpro.io");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void createPlaylist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@type='email']"));
        WebElement passwordField =driver.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement blueButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("nsudenkov@hotmail.com");
        passwordField.sendKeys("te$t$tudent");
        blueButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".home")));
        Assert.assertTrue(driver.findElement(By.className("home")).isDisplayed());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        WebElement createControl = driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));

        createControl.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
        WebElement playlistNameField = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

        playlistNameField.sendKeys("Playlist555");

        playlistNameField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'#!/playlist')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@href,'#!/playlist')]")).isDisplayed());
    }
}
