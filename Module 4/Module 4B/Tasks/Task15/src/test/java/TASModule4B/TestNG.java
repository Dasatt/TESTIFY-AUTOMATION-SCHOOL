package TASModule4B;
/* Navigate to https://www.toolsqa.com/
close the dialogue box that pops up after a few seconds
Click on the tutorial button on the top left corner of the page*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG {
    WebDriver driver = null;
    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task14\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass
    public void closeBrowser(){
//        driver.quit();
    }

    @Test
    public void goToGoogle(){
        driver.get("https://www.google.com/ ");
        driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("testify");
        driver.findElement(By.xpath("//body/div[1]/div[2]")).click(); //to click around and remove suggestions
        driver.findElement(By.cssSelector("input.gNO89b[value='Google Search']")).submit();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        System.out.println("Executed google");
    }

    @Test
    public void goToMcDonalds(){
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        WebElement orderButton = driver.findElement(By.xpath("//a[@id='button-ordernow']"));
        String orderColour = orderButton.getCssValue("background-color");
        System.out.println("Order now button colour is: " + orderColour);
        System.out.println("Executed go to McDonald");
    }

}
