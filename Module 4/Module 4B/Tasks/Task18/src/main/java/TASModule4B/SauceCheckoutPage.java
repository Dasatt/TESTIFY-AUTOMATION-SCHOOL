package TASModule4B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutPage {
    WebDriver Sdriver = null;
    public SauceCheckoutPage(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    //get firstname
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    // add lastname
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;
    public WebElement getLastname(){
        return lastname;
    }

    //get zipcode
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipcode;
    public WebElement getZipcode(){
        return zipcode;
    }

    // continue button
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;
    public WebElement getContinueButton(){
        return continueButton;
    }
}
