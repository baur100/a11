package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GregsSimpleUdemyTest032921B {
    private WebDriverWait wait;
    @Test
    public void searchInUdemy() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("https://www.udemy.com");
       //locating searchbox by CSS selector

       driver.findElement(By.cssSelector("#u25-search-form-autocomplete--3"));

    }

}//end lf class
