package TASModule4B;
/* Go to https://selenium08.blogspot.com/
 search for "Demo dropdown" form the search field.
 on the drop down page, select Nigeria from the country list and
  select january february and march from the moths list. (image; https://i.imgur.com/sIgQwwG.png)*/


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task13\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".search")).click();
        driver.findElement(By.cssSelector("input[aria-label='Search this blog']")).sendKeys("Demo dropdown");
        driver.findElement(By.cssSelector(".search-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[href='https://selenium08.blogspot.com/2019/11/dropdown.html']")).click();

        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        WebElement countryList = driver.findElement(By.cssSelector("select[name='country']"));
        scrollDown.executeScript("arguments[0].scrollIntoView();", countryList);

        Select select = new Select(countryList);
        select.selectByValue("NG");

        WebElement monthList = driver.findElement(By.cssSelector("select[name='Month']"));
        scrollDown.executeScript("arguments[0].scrollIntoView();", monthList);
        Select select2 = new Select(monthList);
        select2.selectByValue("Jan");
        select2.selectByValue("Feb");
        select2.selectByValue("Ma");

    }
}
