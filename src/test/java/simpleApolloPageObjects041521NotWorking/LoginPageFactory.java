package simpleApolloPageObjects041521NotWorking;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class  LoginPageFactory {
    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this);
    }

    private WebDriver driver;

   //@FindBy(css = "[type='email']")
   // private WebElement email;

   @FindBy(css = "#ctl00_ContentPlaceHolder1_txtUserName")
    private WebElement email;

    //@FindBy(xpath = "//*[@type='password']")
    //private WebElement password;

    @FindBy(xpath = "#ctl00_ContentPlaceHolder1_txtPassword")
    private WebElement password;


    @FindBy(tagName = "#btnLogin")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement error;

    public void open(String url) {
        driver.get(url);
    }

    public boolean isErrorFrame() {
        try {
            return error.isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    public MainPage loginToApp(String username, String password){
        email.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }




}
