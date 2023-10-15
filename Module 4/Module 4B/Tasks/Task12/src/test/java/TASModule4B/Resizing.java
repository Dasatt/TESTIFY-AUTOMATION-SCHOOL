package TASModule4B;
/*  Navigate to https://jqueryui.com/
.click on the "resize" menu from the left pane
Drag the box to be bigger.(Resize the box to be bigger).*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task12\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);

        Actions resize = new Actions(driver);
        WebElement resizingGrip = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        resize.clickAndHold(resizingGrip).moveByOffset(80, 80).release().build().perform();
    }
}
