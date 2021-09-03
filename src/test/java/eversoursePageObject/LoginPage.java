package eversoursePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,2000);
    }
    private WebElement getUserIdField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='User ID']")));
        return driver.findElement(By.xpath("//*[@placeholder='User ID']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@placeholder='Password']"));
    }
    private WebElement getLoginbutton(){
        return driver.findElement(By.xpath("//*[@value='Log In']"));
    }
    private WebElement getSelectRegion(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-region='EasternMass']")));
        return driver.findElement(By.xpath("//*[@data-region='EasternMass']"));
    }
//    private WebElement getEasternRegion(){
//        return driver.findElement(By.xpath("(//*[@data-original-index='2'])[1]"));
//    }
    private WebElement getGetStartedButton(){
        return driver.findElement(By.xpath("(//*[@class='btn btn-darkgreen'])[1]"));
    }
    public void open(){
        driver.get("https://www.eversource.com");
    }
    public AccountPage LoginToApplication(String username, String password){
        getSelectRegion().click();
//        getEasternRegion().click();
//        getGetStartedButton().click();
        getUserIdField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginbutton().click();
        return new AccountPage(driver);
    }
}
