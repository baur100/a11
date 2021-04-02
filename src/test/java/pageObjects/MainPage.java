package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10,200);
    }
    private WebElement getHomeButton(){
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }

    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    public String createPlaylist(String playlistName) {
        String playlistId="11";
        //lines added by Greg Below
        return playlistId;
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        return true;
    }
}
