package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyLoginPage extends BasePage{

    public MyLoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='email']")));
        return driver.findElement(By.xpath("//*[@type='email']"));
    }

    private WebElement getPasswordField() {
        return driver.findElement(By.cssSelector("[placeholder='Password']"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.tagName("button"));
    }

    public MainPage LoginToApplication(String username, String password) {
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }

//    public void open() {
//        driver.get("https://koelapp.testpro.io/");
//    }

    public void open(String url) {
        driver.get(url);
    }

    private WebElement getError() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        return driver.findElement(By.cssSelector(".error"));
    }

    public boolean isError() {
        try {
            return getError().isDisplayed();
        } catch (TimeoutException ignored) {
            return false;
        }
    }
}
