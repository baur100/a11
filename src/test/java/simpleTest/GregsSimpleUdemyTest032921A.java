package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GregsSimpleUdemyTest032921A {
    @Test
    public void searchInUdemy() throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     System.setProperty("webdriver.chrome.driver","chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.udemy.com");
            //locating by xpath
            WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
            //searchField.sendKeys("Java");
             searchField.sendKeys("SQL");
            searchField.sendKeys(Keys.RETURN);
            Thread.sleep(3000);
            //locate by tagname
            //WebElement result = driver.findElement(By.tagName("h1"));

        //WebElement result = driver.findElement(By.tagName("span"));



        /*locate by selector
            Thread.sleep(5000);

            System.out.println(result.getText());
            //Assert.assertTrue(result.getText().contains("10,000 results")); //for Java
            //only 7071 results displayd for SQL
            Assert.assertFalse(result.getText().contains("10,000 results")); //7071 if searching for SQL

        WebElement result = driver.findElement(By.id("Log in"));
            Thread.sleep(5000);
            driver.quit();  */



        }

   }
