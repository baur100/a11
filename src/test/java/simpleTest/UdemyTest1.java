package simpleTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UdemyTest1 {
    @Test
    public void searchInUdemy() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.udemy.com");

        WebElement searchField=driver.findElement(By.xpath("//*[text()='Excel']"));
        Thread.sleep(3000);
        searchField.click();
//        searchField.sendKeys("Java");
//        Thread.sleep(3000);
//        searchField.sendKeys(Keys.RETURN);
//        Thread.sleep(3000);
//        WebElement result=driver.findElement(By.tagName("h1"));
//        System.out.println(result.getText());
//        Assert.assertTrue(result.getText().contains("10,000 result"));
        Thread.sleep(5000);
        driver.quit();
    }
}
