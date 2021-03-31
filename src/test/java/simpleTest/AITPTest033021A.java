package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AITPTest033021A {
    @Test
    public void AITPLATest033021A() throws InterruptedException {
        Thread.sleep(3000);
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aitp-la.org/");
        //using classname below:
        //WebElement enterEmailAddress = driver.findElement(By.className("gem-field.gem-required"));
        //enterEmailAddress.sendKeys("Java@java.com");

        //using relative xpath below:
        //WebElement searchField = driver.findElement(By.xpath("//*[@id=\"form_1_signup[email]\"]"));
        //searchField.sendKeys("Java@java.com");
        //using absolute xpath below:
        //WebElement searchField1 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[2]/div[2]/div/div[2]/form/p[2]/input"));
        //searchField1.sendKeys("Test");
        //searchField1.sendKeys(Keys.RETURN);



        //Thread.sleep(3000);
        //WebElement result = driver.findElement(By.tagName("signup[first_name]"));
        //WebElement result = driver.findElement(By.tagName("h1"));
        //System.out.println(result.getText());
        //Assert.assertTrue(result.getText().contains("10,000 results"));

        Thread.sleep(5000);
        driver.quit();
    }

}//end of class