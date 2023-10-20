package TASModule4B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SauceCartTest {
    WebDriver driver = null;
    String product1Name = "";
    String product2Name = "";

    @BeforeClass
    public void driverInstance(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task18\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void SauceLogin(){
        driver.get("https://www.saucedemo.com/");
        SauceLoginPage login = new SauceLoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLogin_button().click();
        System.out.println("login was successful");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(priority = 2)
    public  void SauceAddToCart(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SauceProductPage addProduct = new SauceProductPage(driver);
        addProduct.getAddProduct1().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        addProduct.getAddProduct2().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        product1Name = addProduct.getProduct1Name().getText();
        product2Name = addProduct.getProduct2Name().getText();
//        System.out.println(product1Name);
//        System.out.println(product2Name);
        System.out.println("Products added to cart");
        addProduct.getCartButton().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test(priority = 3)
    public  void AssertCartPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SauceCartPage checkCart = new SauceCartPage(driver);
        String productName1 = checkCart.getProduct1Name().getText();
        String productName2 = checkCart.getProduct2Name().getText();

        SoftAssert assertCheck = new SoftAssert();
        assertCheck.assertEquals(product1Name, productName1);
        assertCheck.assertEquals(product2Name, productName2);
        assertCheck.assertAll();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        checkCart.getCheckout().click();
    }
    @Test(priority = 4)
    public  void CheckoutPage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        SauceCheckoutPage checkout = new SauceCheckoutPage(driver);
        checkout.getFirstName().sendKeys("Oladayo");
        checkout.getLastname().sendKeys("Akin");
        checkout.getZipcode().sendKeys("12345");
        checkout.getContinueButton().click();
    }
    @Test(priority = 5)
    public  void OverviewPage(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SauceCheckoutOverviewPage checkOverview = new SauceCheckoutOverviewPage(driver);
        String productName1 = checkOverview.getProduct1Name().getText();
        String productName2 = checkOverview.getProduct2Name().getText();

        SoftAssert assertCheck = new SoftAssert();
        assertCheck.assertEquals(product1Name, productName1);
        assertCheck.assertEquals(product2Name, productName2);
        assertCheck.assertAll();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        checkOverview.getFinish().click();
    }
    @Test(priority = 6)
    public  void CheckoutComplete(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SauceCheckoutComplete checkMessage = new SauceCheckoutComplete(driver);
        String successMessage = checkMessage.getSuccessMessage().getText();
        String expectedMessage = "THANK YOU FOR YOUR ORDER!";

        SoftAssert assertCheck = new SoftAssert();
        assertCheck.assertEquals(successMessage.toLowerCase(), expectedMessage.toLowerCase());
        assertCheck.assertAll();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
}
