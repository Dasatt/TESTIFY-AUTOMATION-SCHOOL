package TASModule4B;
/*  Navigate to http://demo.guru99.com/
    Click on the security Project menu.
    Input any text in the email and password field.*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task4\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();
        driver.navigate().back();
        String loginAttrValue = driver.findElement(By.cssSelector("input#login-button")).getAttribute("value");
        if (loginAttrValue == "Login"){
            System.out.println("Back navigation succesfully");
        }
        Thread.sleep(3000);
        driver.navigate().forward();
        String sampleProduct = driver.findElement((By.cssSelector("a[id=item_0_title_link]"))).getText();
        System.out.println("Product name: "+ sampleProduct);
    }
}
