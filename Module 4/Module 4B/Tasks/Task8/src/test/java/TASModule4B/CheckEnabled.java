package TASModule4B;
/*  Navigate to http://demo.guru99.com/
    Click on the security Project menu.
    Input any text in the email and password field.*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task4\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        driver.manage().window().maximize();
        boolean checkEnabled = driver.findElement(By.cssSelector("button#create")).isEnabled();
        if (checkEnabled){
            System.out.println("The Create account button is enabled");
        }else {
            System.out.println("The Create account button is NOT enabled");
        }
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Oladayo");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("Akin");
        driver.findElement(By.cssSelector("input#email")).sendKeys("test@testify.com");
        driver.findElement(By.cssSelector("input#female")).click();
        driver.findElement(By.cssSelector("input#password")).sendKeys("Test123");
        driver.findElement(By.cssSelector("input#confirmPass")).sendKeys("Test123");
        driver.findElement(By.cssSelector("input#xpLevel")).sendKeys("Why do you care");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("div.col1")).click(); //just to click outside the teext boxes
        checkEnabled = driver.findElement(By.cssSelector("button#create")).isEnabled();
        if (checkEnabled){
            System.out.println("The Create account button is enabled");
        }else {
            System.out.println("The Create account button is NOT enabled");
        }
    }
}
