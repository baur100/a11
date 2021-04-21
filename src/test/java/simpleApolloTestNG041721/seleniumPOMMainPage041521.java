package simpleApolloTestNG041721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class seleniumPOMMainPage041521  {
    private static WebElement element = null;

    //clicking the edit profile button
    public static WebElement btnEditProfile(WebDriver driver) {
        element =
                driver.findElement(By.cssSelector("#profile-container > a"));
        return element;
    }
    //selecting account profile from the drop down
    public static WebElement selectMyAccountProfileDropDown(WebDriver driver) {
        element =
                driver.findElement(By.cssSelector("#memberProfileDropdown"));
        return element;
    }
    //selecting "member profile" from the drop down
    public static WebElement selectAccountProfile(WebDriver driver) {
        element =
                driver.findElement(By.cssSelector("#memberProfileCV > a"));
        return element;
    }


}
