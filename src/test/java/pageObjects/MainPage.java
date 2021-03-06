package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    private static Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getHomeButton(){
        By homeBy = By.className("logout");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }
    private WebElement getPlaylistById(String playlistId){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")));
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
    }
    private WebElement getPlaylistEditField(String playlistId){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/"+playlistId+"']/following-sibling::input")));
        return driver.findElement(By.xpath("//*[@type='text']"));
    }

    public boolean isMainPage() {
        try {
            return getHomeButton().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }
    private WebElement getNewPlaylistField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='create']/input")));
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    private void clickPlusButton() {
        logger.trace("I'm in click plusButton method");
        By plusButtonBy = By.cssSelector(".fa-plus-circle");
        logger.info("By -> Created By css selector .fa-plus-circle");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        logger.debug("waited until element become clickable");
        for (int i=0;i<5;i++){
            try{
                logger.warn("in the try block");
                Actions actions = new Actions(driver);
                actions.click(driver.findElement(plusButtonBy)).build().perform();
                driver.findElement(plusButtonBy).click();
                driver.findElement(By.xpath("//*[text()='New Playlist']")).click();
                return;
            } catch (ElementClickInterceptedException ignored){
                logger.error("In the catch block");
            }
        }
    }

    public String createPlaylist(String playlistName) {
        clickPlusButton();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        try{
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
        actions.doubleClick(playlist).build().perform();
//        actions.doubleClick(playlist).build().perform();
        getPlaylistEditField(playlistId).sendKeys(Keys.CONTROL+"a");
        getPlaylistEditField(playlistId).sendKeys(newName);
        getPlaylistEditField(playlistId).sendKeys(Keys.ENTER);
    }
}

//
//    JavascriptExecutor executor = (JavascriptExecutor) driver;
//executor.executeScript("arguments[0].scrollIntoView(true);", element);
//        element.click();