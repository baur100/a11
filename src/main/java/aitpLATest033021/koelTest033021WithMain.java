package aitpLATest033021;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class koelTest033021WithMain {
    public static void main(String[] args) throws InterruptedException {
        boolean stupidSelectorIsSelected;
        System.out.println("Hi There, This works, yeah");
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("http://koelapp.testpro.io");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        WebElement button = driver.findElement(By.tagName("button"));
        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        button.click();


        //select the button to open the textfield for new playlist below:


        //WebElement openPlaylistName = driver.findElement(By.cssSelector("#playlists > h1 > i")); Not working

        //WebElement openPlaylistName = driver.findElement(By.xpath("//*[@id='playlists']/h1/i")); Not working

        //WebElement openPlaylistNameTextBoxControl = driver.findElement(By.className("fa fa-plus-circle control create"));

             WebDriverWait waitOne = new WebDriverWait(driver, 10);
             waitOne.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/nav/section[2]/h1/i")));
             WebElement openPlaylistNameTextBoxControl = driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/section[2]/h1/i"));
             openPlaylistNameTextBoxControl.click();
             stupidSelectorIsSelected = openPlaylistNameTextBoxControl.isSelected();
             System.out.println("stupid selector " + stupidSelectorIsSelected);

           //WebElement playlistNametextbox = driver.findElement(By.className("#playlists > form > input[type=text]"));
          // playlistNametextbox.sendKeys("Test033121");

        /*using classname below:
        //WebElement enterEmailAddress = driver.findElement(By.className("gem-field gem-required"));
        //WebElement enterEmailAddress = driver.findElement(By.className("form-control mt-3 form-control-lg "));
        //WebElement enterEmailAddress = driver.findElement(By.className("#app > div > div > div > div > form > div:nth-child(2) > input"));
        //WebElement enterEmailAddress = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input"));
        //enterEmailAddress.sendKeys("Java@java.com");
        //driver.get("");
        //WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        //WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        //WebElement button = driver.findElement(By.tagName("button"));
        //email.sendKeys("koeluser06@testpro.io");
        //password.sendKeys("te$t$tudent");
        //button.click();

        //using relative xpath below:
        //WebElement searchField = driver.findElement(By.xpath("//*[@id=\"form_1_signup[email]\"]"));
        //searchField.sendKeys("Java@java.com");
        //using absolute xpath below:
        //WebElement searchField1 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[2]/div[2]/div/div[2]/form/p[2]/input"));
        //searchField1.sendKeys("Test");
        //searchField1.sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        //WebElement result = driver.findElement(By.tagName("signup[first_name]"));
        //WebElement result = driver.findElement(By.tagName("h1"));
        //System.out.println(result.getText());
        //Assert.assertTrue(result.getText().contains("10,000 results")); */




       // driver.quit();
    }
    } //end of class

