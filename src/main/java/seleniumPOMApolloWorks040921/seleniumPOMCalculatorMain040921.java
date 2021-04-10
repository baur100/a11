package seleniumPOMApolloWorks040921;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.*;

public class seleniumPOMCalculatorMain040921 {

    private static WebDriver driver = null;


    public static void main(String[] args) {
        System.out.println("Hi There");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apollopros.com/member/login.aspx");

        //Use page Object library now
        //seleniumPOMCalcClass040921.lnk_math_calc(driver).click();
        seleniumPOMCalcClass040921.txtEmail(driver).clear();
        seleniumPOMCalcClass040921.txtEmail(driver).sendKeys("klingergk@mail.com");
        System.out.println("past first section");

        seleniumPOMCalcClass040921.txtPassword(driver).clear();
        seleniumPOMCalcClass040921.txtPassword(driver).sendKeys("GeorgeSmith123!");
        System.out.println("past second section");

        seleniumPOMCalcClass040921.btnSubmit(driver).click();

        /* seleniumPOMCalcClass040921.txt_num_1(driver).clear();
        seleniumPOMCalcClass040921.txt_num_1(driver).sendKeys("10");
        System.out.println("past second section");

        seleniumPOMCalcClass040921.txt_num_2(driver).clear();
        seleniumPOMCalcClass040921.txt_num_2(driver).sendKeys("50");

        seleniumPOMCalcClass040921.btn_calc(driver).click();
        String result =  seleniumPOMCalcClass040921.web_result(driver).getText();

        if(result.equals("5")) {
            System.out.println(" The Result is Pass");
        } else {
            System.out.println(" The Result is Fail");
        } */

        driver.close();
    }


    }

