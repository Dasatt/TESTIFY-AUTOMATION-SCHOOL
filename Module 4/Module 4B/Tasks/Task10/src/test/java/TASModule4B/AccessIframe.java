package TASModule4B;
/*  Navigate to http://demo.guru99.com/
    Click on the security Project menu.
    Input any text in the email and password field.*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessIframe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task10\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//body/div[1]/div[1]/button[1]")).click();
    }
}
