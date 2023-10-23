package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductPage {
    WebDriver Sdriver = null;
    public SauceProductPage(WebDriver driver){
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
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement addProduct2;
    public WebElement getAddProduct2(){
        return addProduct2;
    }

    @FindBy(css = "a.shopping_cart_link")
    private WebElement cartButton;
    public WebElement getCartButton(){
        return cartButton;
    }

}
