package TASModule4B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutOverviewPage {
    WebDriver Sdriver = null;
    public SauceCheckoutOverviewPage(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    //get name of first product
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement product1Name;
    public WebElement getProduct1Name(){
        return product1Name;
    }

    //get name of second product
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement product2Name;
    public WebElement getProduct2Name(){
        return product2Name;
    }
    // click finish
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;
    public WebElement getFinish(){
        return finish;
    }
}
