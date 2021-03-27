package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AITPTest032721 {
    @Test
    public void AITPLATest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aitp-la.org/");

         //WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"form_1_signup[email]\"]"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.RETURN);
        //Thread.sleep(3000);
        //WebElement result = driver.findElement(By.tagName("signup[first_name]"));
        WebElement result = driver.findElement(By.tagName("h1"));
        //System.out.println(result.getText());
        //Assert.assertTrue(result.getText().contains("10,000 results"));

        Thread.sleep(5000);
        driver.quit();
    }
}
