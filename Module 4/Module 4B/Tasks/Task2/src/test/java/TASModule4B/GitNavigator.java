package TASModule4B;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitNavigator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task2\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
    }
}
