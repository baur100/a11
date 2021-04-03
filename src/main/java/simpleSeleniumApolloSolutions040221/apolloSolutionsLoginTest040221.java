package simpleSeleniumApolloSolutions040221;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class apolloSolutionsLoginTest040221 {
private String userName;
private String passWord;
private Boolean testResult;

    public apolloSolutionsLoginTest040221 (String userName, String thePassWord) {
        this.userName = userName;
        this.passWord = thePassWord;
        testResult = true;
        System.out.println("username is" + userName + " passWord is " + passWord + " testResult is " + testResult);

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.apollopros.com/member/login.aspx");


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName")));
        WebElement emailLogin = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUserName"));
        emailLogin.sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword")));
        WebElement passWord = driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtPassword"));
        passWord.sendKeys(thePassWord);
        WebDriverWait waitOne = new WebDriverWait(driver, 60);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        Submitbutton.click();

        Boolean isPresent = driver.findElements(By.cssSelector("#memberProfileDropdown")).size() > 0;
        if (isPresent) {
            System.out.println("Control detected");
        }



        } //end of constructor

        public String getUserName () {
            return userName;
        }

        public void setUserName (String userName){
            this.userName = userName;
        }

        public String getPassWord () {
            return passWord;
        }

        public void setPassWord (String passWord){
            this.passWord = passWord;
        }


    @Override
    public String toString() {
        return "apolloSolutionsLoginTest040221{" +
                "testResult=" + testResult +
                '}';
    } //end of toString
} //end of object


