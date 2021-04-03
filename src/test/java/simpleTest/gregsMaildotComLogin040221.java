package simpleTest;

import helpers.TestDataGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;


@Test
public class gregsMaildotComLogin040221 {


    public void simpleTest() throws InterruptedException {
        //testing selecting a page with a textbox, entering text, then clearing the text;
        //url used: https://www.mail.com/
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.mail.com/int");
        //going to http://formy-project.herokuapp.com/keypress, entering text in the textbox
        Thread.sleep(3000);

        // store window handles in Set
        Set<String> wnd = driver.getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        String prntw = i.next();
        String popwnd = i.next();
        // switching pop up window handle id
        driver.switchTo().window(popwnd);
        System.out.println("Page title of popup: "+ driver.getTitle());
        // closes pop up window
        driver.close();
        // switching parent window handle id
        driver.switchTo().window(prntw);
        System.out.println("Page title of parent window: "+ driver.getTitle());
        driver.quit();


        //driver.switchTo().frame("//*[@id=\"onetrust-policy\"]");


        //driver.switchTo().frame("/html/body");
        /* driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[2]/div/div/button"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#onetrust-accept-btn-handler")));
        WebElement popupButtonClick = driver.findElement(By.cssSelector("#onetrust-accept-btn-handler"));
        driver.switchTo().defaultContent(); */


        //popupButtonClick.click();
        /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-button")));
        WebElement emailLoginButton = driver.findElement(By.cssSelector("#login-button"));
        emailLoginButton.click();
        //wait until textbox appears, then add text to the textbox.
        WebDriverWait waitOne = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        WebElement textBox = driver.findElement(By.cssSelector("#name"));
        //calling helperclass TestDataGenerator, see test/java/helpers/TestDataGenerator class
        textBox.sendKeys(TestDataGenerator.getRandomString(4)); */
        //entering text
        //textBox.sendKeys("This is a Test");
        //textBox
        //WebDriverWait waitTwo = new WebDriverWait(driver, 20);
        //Thread.sleep(3000);
        //textBox.clear();

            } //end of public void simpleTest() throws InterruptedException
        } //public class gregsherokuappEnterTextThenClear040221




