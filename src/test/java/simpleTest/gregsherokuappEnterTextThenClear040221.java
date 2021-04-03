package simpleTest;

import helpers.TestDataGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class gregsherokuappEnterTextThenClear040221 {


    public void simpleTest() throws InterruptedException {
        //testing selecting a page with a textbox, entering text, then clearing the text;
        //url used: http://formy-project.herokuapp.com/keypress
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://formy-project.herokuapp.com");
        //going to http://formy-project.herokuapp.com/keypress, entering text in the textbox
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > div > li:nth-child(13) > a")));
        WebElement link = driver.findElement(By.cssSelector("body > div > div > li:nth-child(13) > a"));
        link.click();
        //wait until textbox appears, then add text to the textbox.
        WebDriverWait waitOne = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        WebElement textBox = driver.findElement(By.cssSelector("#name"));
        //calling helperclass TestDataGenerator, see test/java/helpers/TestDataGenerator class
        textBox.sendKeys(TestDataGenerator.getRandomString(4));
        //entering text
        //textBox.sendKeys("This is a Test");
        //textBox
        WebDriverWait waitTwo = new WebDriverWait(driver, 20);
        Thread.sleep(3000);
        textBox.clear();

            } //end of public void simpleTest() throws InterruptedException
        } //public class gregsherokuappEnterTextThenClear040221




