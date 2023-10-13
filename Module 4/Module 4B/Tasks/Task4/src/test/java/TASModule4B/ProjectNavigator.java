package TASModule4B;
/*  Navigate to http://demo.guru99.com/
    Click on the security Project menu.
    Input any text in the email and password field.*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectNavigator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task4\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.name("uid")).sendKeys("Oladayo");
        driver.findElement(By.name("password")).sendKeys("Testing1234");



        /*observed there is an advertisement iframe in class ns,  id="dismiss-button" yofpg-e-16
        on multiple attempts unable to access this elememnt, noticed page has two sets of <html> opening and closing tags
          there's need to iterate though this and no successful researh online */
    }
}
