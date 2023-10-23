package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePage {
    WebDriver Sdriver = null;

    public SauceHomePage(WebDriver driver) {
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);
        driver.get("https://www.saucedemo.com/");
    }

    public String FetchCurrentUrl(){
        String homePageUrl =Sdriver.getCurrentUrl();
        return homePageUrl;
    }
}
