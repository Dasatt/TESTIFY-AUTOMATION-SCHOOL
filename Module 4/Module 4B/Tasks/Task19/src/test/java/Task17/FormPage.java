package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class FormPage {
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
    public void formTile(){
        WebElement formTile = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]"));
        formTile.click();
        String currentUrl = driver.getCurrentUrl().toLowerCase();

        SoftAssert obj = new SoftAssert();
        obj.assertEquals(currentUrl, "https://demoqa.com/forms");
        System.out.println("Completed Form Page Check");
        obj.assertAll();
        driver.quit();

    }
}
