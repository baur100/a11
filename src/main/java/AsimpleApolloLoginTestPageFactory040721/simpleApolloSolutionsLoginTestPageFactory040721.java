package AsimpleApolloLoginTestPageFactory040721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//constructor below
//public class simpleApolloSolutionsLoginTestPageFactory040721 {
public class simpleApolloSolutionsLoginTestPageFactory040721 {

    private String userName;
    private String passWord;
    private Boolean testResult;

    //creating constructor below:

   simpleApolloSolutionsLoginTestPageFactory040721(String userName1, String thePassWord1)
        {

        this.userName = userName1;
        this.passWord = thePassWord1;
        testResult = true;
        System.out.println("username is" + userName + " passWord is " + passWord + " testResult is " + testResult);
        System.out.println("username is" + userName + " passWord is " + passWord);

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
        passWord.sendKeys(thePassWord1);
        WebElement Submitbutton = driver.findElement(By.cssSelector("#btnLogin"));
        Submitbutton.click();
        testResult = true;

        try {
            System.out.println("Sleeping...");
            Thread.sleep(20000);
            System.out.println("Done sleeping, no interrupt.");
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");
            e.printStackTrace();
        }
        driver.quit();


    } //end of constructor

    //getters and setters below

    public String getUserName() {
        return userName;
    }

   public void setUserName(String userName) {
        this.userName = userName;
   }

   public String getPassWord() {
        return passWord;
   }

   public void setPassWord(String passWord) {
        this.passWord = passWord;
   }

    @Override
    public String toString() {
        return " userName=' " + userName + " passWord= " + passWord + " testResult= " + testResult + " testResult " + testResult;
    }
} //end of class
