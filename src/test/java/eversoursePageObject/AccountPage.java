package eversoursePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,2000);
    }
    private WebElement getAccountNumber(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='u-acct-card-header__number']")));
        return driver.findElement(By.xpath("//*[@class='u-acct-card-header__number']"));
    }
    public boolean isAccountNumber(){
        try{
            return getAccountNumber().isDisplayed();
        }catch (TimeoutException err){
            return false;
        }
    }
}
