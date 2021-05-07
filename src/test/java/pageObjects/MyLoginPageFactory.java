package pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyLoginPageFactory {
    private WebDriver driver;
// tagName, partialLinkText, name, LinkText, id, css, className, xpath
    @FindBy(css="[type='email']")
    private WebElement email;
    @FindBy(xpath = "//*[@type='password']")
    private WebElement password;
    @FindBy(tagName = "button")
    private WebElement button;
    @FindBy(className="error")
    private WebElement error;

    public MyLoginPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,this);
    }

//    public void open() {
//        driver.get("https://koelapp.testpro.io/");
//    }

    public void open(String url) {
        driver.get(url);
    }

    public MainPage LoginToApplication(String username, String password) {
        email.sendKeys(username);
        this.password.sendKeys(password);
        button.click();
        return new MainPage(driver);
    }


    public boolean isError() {
        try {
            return error.isDisplayed();
        } catch (TimeoutException ignored) {
            return false;
        }
    }
}
