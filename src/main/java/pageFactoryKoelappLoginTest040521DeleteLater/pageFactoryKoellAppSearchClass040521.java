package pageFactoryKoelappLoginTest040521DeleteLater;
import org.openqa.selenium.WebElement;

public class pageFactoryKoellAppSearchClass040521 {

        // Here's the element
        private WebElement email;
        private WebElement submit;


        public void searchFor(String text) {
            // And here we use it. Note that it looks like we've
            // not properly instantiated it yet....
            email.sendKeys(text);
            submit.submit();

        }
    }
