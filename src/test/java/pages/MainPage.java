package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 200);
    }

    private WebElement getHomeButton(){
        By homeby = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeby));
        return driver.findElement(homeby);
    }

    private void clickPlusButton(){
        By plusButtonBy = By.cssSelector(".fa-plus-circle");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        for (int i = 0; i < 5 ; i++){
            try {
                driver.findElement(plusButtonBy).click();
                return;
            } catch (ElementClickInterceptedException xx){

            }
        }
    }

    private WebElement getNewPlaylist(){
        By newPlaylistBy = By.xpath("//*[text()='New Playlist']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(newPlaylistBy));
        return driver.findElement(newPlaylistBy);
    }

    private WebElement getNewPlaylistTextbox(){
        By newPlaylistTextboxBy = By.xpath("//*[@class='create']/input");
        return driver.findElement(newPlaylistTextboxBy);
    }

    private WebElement getCreatePlaylistSuccess(){
        By createPlaylistSuccessBy = By.xpath("//*[@class='success show']");
        return driver.findElement(createPlaylistSuccessBy);
    }

    private WebElement getPlaylistById(String playlistId){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+ playlistId +"']"));
    }

    private WebElement getPlaylistEditField(){
        By playlistEditFieldBy = By.xpath("//*[@class='playlist playlist editing']/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(playlistEditFieldBy));
        return driver.findElement(playlistEditFieldBy);
    }


    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

    public String createPlaylist(String playlistName) {
        clickPlusButton();
        getNewPlaylist().click();
        getNewPlaylistTextbox().sendKeys(playlistName);
        getNewPlaylistTextbox().sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        try {
            return getPlaylistById(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException xx){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = getPlaylistById(playlistId);
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        getPlaylistEditField().sendKeys(Keys.CONTROL + "A");
//        getPlaylistEditField().sendKeys(Keys.BACK_SPACE);
        getPlaylistEditField().sendKeys(newName);
        getPlaylistEditField().sendKeys(Keys.ENTER);
    }
}
