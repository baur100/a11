package simpleApolloTestNG041721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seleniumPOMLoginPage040921 {

    private static WebElement element = null;

    // Math Calc Link
   /* public static WebElement lnk_math_calc(WebDriver driver) {
        element = driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a"));
        return element;
        }*/

   //Typing
    public static WebElement txtEmail (WebDriver driver) {
        element = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        return element;
    }

    public static WebElement txtPassword (WebDriver driver) {
        element = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        return element;
    }

    public static WebElement btnSubmit(WebDriver driver) {
        element =
                driver.findElement(By.cssSelector("#btnLogin"));
        return element;
    }

    //Percentage Calc Link
    /* public static WebElement lnk_percent_calc(WebDriver driver) {
        element = driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a"));
        return element;
    }

    //Number 1 Text Box
    public static WebElement txt_num_1(WebDriver driver) {
        element = driver.findElement(By.id("cpar1"));
        return element;
    }

    //Number 2 Text Box
    public static WebElement txt_num_2(WebDriver driver) {
        element = driver.findElement(By.id("cpar2"));
        return element;
    }

    //Calculate Button
    public static WebElement btn_calc(WebDriver driver) {
        element =
                driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input"));
        return element;
    }

    // Result
    public static WebElement web_result(WebDriver driver) {
        element =
                driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/span/font/b"));
        return element;
    } */
} //end of class
