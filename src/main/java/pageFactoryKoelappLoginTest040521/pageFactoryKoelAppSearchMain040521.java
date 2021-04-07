package pageFactoryKoelappLoginTest040521;
//example of using pageFactory
//From: https://github.com/SeleniumHQ/selenium/wiki/PageFactory

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageFactoryGoogleSearchTest040521.pageFactoryGoogleSearchClass040521;


public class pageFactoryKoelAppSearchMain040521 {

    public static void main(String[] args) {

        // Create a new instance of a driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the right place
        driver.get("http://www.google.com/");

        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        pageFactoryGoogleSearchTest040521.pageFactoryGoogleSearchClass040521 page = PageFactory.initElements(driver, pageFactoryGoogleSearchClass040521.class);

        // And now do the search.
        page.searchFor("Cheese");

    } //end of main

} //end of class