package simpleSeleniumApolloTest040321;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class pageLoginTest040321 {
    private String webURL;
    String userName;
    String passWord;
    String testDeletelater;
    boolean loginTestResult;
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public pageLoginTest040321(String webURL) {
        this.webURL = webURL;
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //driver.get("https://www.apollopros.com/member/login.aspx");
        driver.get(webURL);
    }

    //public String loginTesting (String userName, String passWord) {

    public void loginTesting(String userName, String passWord) {
        //good login below:
        System.out.println("userName " + userName + "passWord " + passWord );
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        //emailLogin.sendKeys("klingergk@mail.com");
        emailLogin.sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement thePassWord = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        thePassWord.sendKeys(passWord);
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        System.out.println("Clicking Submit button");
        Submitbutton.click();


        //if we were able to login successfully, then the memberprofiledropdown control will display, check if
        //control exists, if so, then logout.
        Boolean isPresent = driver.findElements(By.cssSelector("#memberProfileDropdown")).size() > 0;
        if (isPresent) {
            System.out.println("Control detected");
            WebElement logoutDropDown = driver.findElement(By.cssSelector("#memberProfileDropdown"));
            logoutDropDown.click();
            WebElement logoutOption = driver.findElement(By.cssSelector("#memberProfileLogout > a"));
            logoutOption.click();
            //driver.close();
            driver.quit();
        }
         else {
            WebElement logoutDropDown = driver.findElement(By.cssSelector("#memberProfileDropdown"));
            logoutDropDown.click();
            WebElement logoutOption = driver.findElement(By.cssSelector("#memberProfileLogout > a"));
            logoutOption.click();
        } //end of elses
        } //end of login test
         //driver.quit();

         //}
        //control not present, need to quit test

       /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        emailLogin.sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement passWord = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        passWord.sendKeys(thePassWord);
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        Submitbutton.click(); */

        /*
        } */
    //}


        public String executeLoginTest (String userName, String passWord){

            return userName;
        }

        public String getwebURL () {
            return webURL;
        }

        public void setwebURL (String webURL){
            this.webURL = webURL;
        }
    }





