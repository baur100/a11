package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPageFactory {
    private WebDriver driver;

    @FindBy(xpath = "//*[@class='home active']")
    private WebElement home;
    @FindBy(xpath = "//*[@class='fa fa-plus-circle control create']")
    private WebElement plus;
    @FindBy(xpath = "//*[@class='create']/input")
    private WebElement input;
    @FindBy(xpath = "//*[@href='#!/playlist/+\" + playlistId +\"']")
    private WebElement playlistById;


    public MainPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(factory, this);
    }

    public boolean isMainPage() {
        try {
            return home.isDisplayed();
        } catch (TimeoutException ignored) {
            return false;
        }
    }

    private void clickCreateControlButton() {
        for (int i = 0; i < 7; i++) {
            try {
                plus.click();
                return;
            } catch (ElementClickInterceptedException xx) {
            }
        }
    }

    public String createPlaylist(String playlistName) {
        clickCreateControlButton();
        input.sendKeys(playlistName);
        input.sendKeys(Keys.ENTER);
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        try {
            return playlistById.getText().equals(playlistName);
        } catch (NoSuchElementException xx) {
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = playlistById;
        js.executeScript("arguments[0].scrollIntoView();", playlist);

        Actions act = new Actions(driver);
        act.doubleClick(playlist).perform();

        input.sendKeys(Keys.CONTROL + "a");

        input.sendKeys(newName);

        input.sendKeys(Keys.ENTER);

    }
}
