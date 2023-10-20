package TASModule4B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class ElementPage {
    WebDriver driver = null;
    @BeforeClass
    public void openDemoPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task17\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void elementTile(){
        WebElement elementTile = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        elementTile.click();
        String currentUrl = driver.getCurrentUrl().toLowerCase();

        SoftAssert obj = new SoftAssert();
        obj.assertEquals(currentUrl, "https://demoqa.com/elements");
        System.out.println("Completed Element Page Check");
        obj.assertAll();
        driver.quit();

    }
}
