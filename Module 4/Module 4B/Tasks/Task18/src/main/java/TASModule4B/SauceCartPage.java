package TASModule4B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCartPage {
    WebDriver Sdriver = null;
    public SauceCartPage(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    //get name of first product
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    private WebElement product1Name;
    public WebElement getProduct1Name(){
        return product1Name;
    }
    // add first product to cart
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addProduct1;
    public WebElement getAddProduct1(){
        return addProduct1;
    }
    //get name of second product
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement product2Name;
    public WebElement getProduct2Name(){
        return product2Name;
    }
    // add second product to cart
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public WebElement getCheckout(){
        return checkout;
    }

}
