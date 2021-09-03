package pageObjects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;


public class MainPage extends BasePage{
    private static Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getHomeButton(){
        By homeBy = By.xpath("//*[@class='home active']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeBy));
        return driver.findElement(homeBy);
    }
    private WebElement getPlaylistById(String playlistId){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")));
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
    }
    private WebElement getPlaylistEditField(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='text']")));
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
        By plusButtonBy = By.xpath("//*[@title='Create a new playlist']");
        logger.info("By -> Created By xpath //*[@title='Create a new playlist']");
        wait.until(ExpectedConditions.elementToBeClickable(plusButtonBy));
        logger.debug("waited until element become clickable");
        for (int i=0;i<7;i++){
            try{
                logger.warn("in the try block");
                Actions actions = new Actions(driver);
                actions.click(driver.findElement(plusButtonBy)).build().perform();
//                driver.findElement(plusButtonBy).click();
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")));

        try{
          return getPlaylistById(playlistId).getText().equals(playlistName);
        } catch (NoSuchElementException ignored){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newName) {
//        wait.until(ExpectedConditions.visibilityOf(getHomeButton()));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = getPlaylistById(playlistId);
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
//        actions.doubleClick(playlist).build().perform();
        getPlaylistEditField().sendKeys(Keys.CONTROL+"a");
        getPlaylistEditField().sendKeys(newName);
        getPlaylistEditField().sendKeys(Keys.RETURN);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
    }
    private WebElement getAllSongsList(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='songs']")));
        return driver.findElement(By.xpath("//*[@class='songs']"));
    }

    private WebElement selectedSong(){
        List<WebElement> songList = driver.findElements(By.xpath("//table/tr/td[@class='title']"));
            Random rand = new Random();
            int randomNumber = rand.nextInt(songList.size());
            WebElement randomSong =songList.get(randomNumber);
        System.out.println(randomSong.getText());
      return randomSong;
    }

    private WebElement addTo(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='has-sub']")));
        return driver.findElement(By.xpath("//*[@class='has-sub']"));
    }
    private WebElement getSongInsidePlaylist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlistWrapper']/div/div/div/table/tr")));
        return driver.findElement(By.xpath("//*[@id='playlistWrapper']/div/div/div/table/tr"));
    }

    public boolean isSongExistInPlaylist() {
        try{
            return getSongInsidePlaylist().isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }


    public void addSongToPlaylist(String playlistId,String playlistName){
        getAllSongsList().click();
        selectedSong();
        WebElement randomSong = selectedSong();
        System.out.println(randomSong.getText());
        Actions actions = new Actions(driver);
        actions.contextClick(randomSong).build().perform();
        addTo().click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='playlist' and text()='" + playlistName + "']")));
        WebElement playlist = driver.findElement(By.xpath("//*[@class='playlist' and text()='" + playlistName + "']"));
        actions.click(playlist).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        WebElement createdPlaylist = getPlaylistById(playlistId);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();",createdPlaylist);
        actions.click(createdPlaylist).perform();
    }

    private WebElement getDeletePlaylistButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Delete this playlist']")));
        return driver.findElement(By.xpath("//*[@title='Delete this playlist']"));
    }

    public void deletePlaylist(String playlistId) {
        Actions actions = new Actions(driver);
        WebElement createdPlaylist = getPlaylistById(playlistId);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();",createdPlaylist);
        actions.click(createdPlaylist).perform();
        getDeletePlaylistButton().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
    }

    public boolean playlistDeleted(String playlistId, String playlistName) {
        try{
            return getPlaylistById(playlistId).isEnabled();
        } catch (NoSuchElementException ignored){
            return false;
        }
    }
}
