package TASModule4B;
/* Navigate to https://www.toolsqa.com/
close the dialogue box that pops up after a few seconds
Click on the tutorial button on the top left corner of the page*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Synchronisation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task14\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/ ");
        driver.manage().window().maximize();

        WebDriverWait closeDialog = new WebDriverWait(driver, Duration.ofSeconds(3));
        closeDialog.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#accept-cookie-policy")));
        driver.findElement(By.cssSelector("button#accept-cookie-policy")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='navbar__tutorial-menu']")).click();
    }
}
