package seleniumApolloLoginTest040921;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class seleniumApolloLoginMain040921 {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.out.println("Hi There");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apollopros.com/member/login.aspx");

        //Use page Object library now
        /* seleniumPOMApolloLogin040921.lnk_math_calc(driver).click();
        seleniumPOMApolloLogin040921.lnk_percent_calc(driver).click();
        System.out.println("past first section"); */

       /* seleniumPOMApolloLogin040921.txt_num_1(driver).clear();
        seleniumPOMApolloLogin040921.txt_num_1(driver).sendKeys("10");
        System.out.println("past second section"); */

        /* seleniumPOMApolloLogin040921.txt_num_2(driver).clear();
        seleniumPOMApolloLogin040921.txt_num_2(driver).sendKeys("50"); */

        seleniumPOMApolloLogin040921.txtEmail(driver).clear();
        seleniumPOMApolloLogin040921.txtEmail(driver).sendKeys("klingergk@mail.com");

        seleniumPOMApolloLogin040921.txtPassword(driver).clear();
        seleniumPOMApolloLogin040921.txtPassword(driver).sendKeys("GeorgeSmith123");

        seleniumPOMApolloLogin040921.btn_login(driver).click();
        //String result =  seleniumPOMApolloLogin040921.web_result(driver).getText(); Not used
        //seleniumPOMApolloLogin040921.btn_login(WebDriver driver).click();

        //seleniumPOMApolloLogin040921.btn_login(driver).click();

        //seleniumPOMApolloLogin040921.btn_login(driver).click();
        /* if(result.equals("5")) {
            System.out.println(" The Result is Pass");
        } else {
            System.out.println(" The Result is Fail");
        } */

        driver.close();






    } //end of main
} //end of class
