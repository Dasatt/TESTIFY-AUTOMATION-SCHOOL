package TASModule4B;
/* Navigate to https://testifyltd.com/ .
Assert that the Our contact column at the footer of the homepage has the following correct details,
EMAIL: info@testifyltd.co.uk
LOCATION: Nigeria
PHONE: (+234)904-882-0971*/


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAsset {
    WebDriver driver = null;
    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task16\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void goToTestify() throws InterruptedException {
        driver.get("https://testifyltd.com/");
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Contact Us']")).click();
        Thread.sleep(2000);
        //locate parameters and save the texts
        String email = driver.findElement((By.xpath("//span[normalize-space()='info@testifyltd.com']"))).getText();
        String phoneNumber = driver.findElement(By.xpath("//span[normalize-space()='(+234)905-882-0971']")).getText();
        String country = driver.findElement(By.xpath("//span[normalize-space()='Nigeria']")).getText();

        //asset parameters
        SoftAssert assertContact = new SoftAssert();
        assertContact.assertEquals(email, "info@testifyltd.co.uk");
        assertContact.assertEquals(phoneNumber, "(+234)904-882-0971");
        assertContact.assertEquals(country, "Nigeria");
        assertContact.assertAll();

    }

}
