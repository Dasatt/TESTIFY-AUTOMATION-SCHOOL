package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutComplete {
    WebDriver Sdriver = null;
    public SauceCheckoutComplete(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver,this);
    }

    //get success message
    @FindBy(xpath = "//h2[contains(text(),'Thank you for your order!')]")
    private WebElement successMessage;
    public WebElement getSuccessMessage(){
        return successMessage;
    }

}
