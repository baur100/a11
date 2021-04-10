package seleniumApolloLoginTest040921;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class seleniumPOMApolloLogin040921 {

        private static WebElement element = null;

        // Math Calc Link
        /* public static WebElement lnk_math_calc(WebDriver driver) {
            element = driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a"));
            return element;
        } */

        //Percentage Calc Link
       /*  public static WebElement lnk_percent_calc(WebDriver driver) {
            element = driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a"));
            return element;
        } */

        //Number 1 Text Box
        /* public static WebElement txt_num_1(WebDriver driver) {
            element = driver.findElement(By.id("cpar1"));
            return element;
        } */

    public static WebElement txtEmail(WebDriver driver) {
        element = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        return element;
    }
        /* public static WebElement txtPassword (WebDriver driver) {
            element = driver.findElement(By.id("cpar1"));
            return element; */


        //Number 2 Text Box
        /* public static WebElement txt_num_2(WebDriver driver) {
            element = driver.findElement(By.id("cpar2"));
            return element;
        } */
         public static WebElement txtPassword (WebDriver driver) {
            element = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
            //element.sendKeys("GeorgeSmith123!");
            return element;
        }

    //Login Button
        public static WebElement btn_login(WebDriver driver) {
            element =
                    //driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr/td[2]/input"));
                    driver.findElement(By.cssSelector("#btnLogin"));
            return element;
        }

        // Result
         /*public static WebElement web_result(WebDriver driver) {
            element =
                    driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/span/font/b"));
            return element;
        } */
    } //end of class


