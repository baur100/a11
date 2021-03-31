package aitpLATest033021;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aitpLATestwithMain033021 {
    public static void main(String[] args) {

            System.out.println("Hi There, This works, yeah");
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.get("https://aitp-la.org");

            //waiting for email textbox to load on the page..evidently need wait until to get css selector to work.
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form_1_signup\\[email\\]")));
            //locating email textbox by css selector. See notes
            WebElement email = driver.findElement(By.cssSelector("#form_1_signup\\[email\\]"));
            email.sendKeys("klingergk@yahoo.com");

           //waiting for firstname textbox to load on the page..evidently need wait until to get css selector to work.
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form_1_signup\\[first_name\\]")));
           //locating email textbox by css selector. See notes
           WebElement firstName = driver.findElement(By.cssSelector("#form_1_signup\\[first_name\\]"));
           firstName.sendKeys("Greg");

          //waiting for lastname textbox to load on the page..evidently need wait until to get css selector to work.
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#form_1_signup\\[last_name\\]")));
          //locating email textbox by css selector. See notes
          WebElement lastName = driver.findElement(By.cssSelector("#form_1_signup\\[last_name\\]"));
          lastName.sendKeys("Klinger");



        //waiting for firstname textbox to load on the page

            //button.click();
    }

}
