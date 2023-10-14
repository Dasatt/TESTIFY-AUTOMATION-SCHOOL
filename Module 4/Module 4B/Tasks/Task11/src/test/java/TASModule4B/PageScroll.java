package TASModule4B;
/* Go to google. search for "testify ltd" Click on the search that result with www.testifyltd.com
sroll down the testify website and click on the LinkedIn icon.
Get the description text on the user page.(image; https://i.imgur.com/PmrWDXa.png ) .*/


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PageScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task11\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body/div[1]/div[2]")).click(); //to click around and remove suggestions
        driver.findElement(By.cssSelector("input.gNO89b[value='Google Search']")).submit();
        Thread.sleep(3000);
        //find result that's testifyltd.com
        driver.findElement(By.xpath("//a[@href='https://www.testifyltd.com/']//div[@class='notranslate TbwUpd NJjxre iUh30 ojE3Fb']//div//div[@class='byrV5b']//cite[@role='text']")).click();

        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/testifyorg']")).click();
        Thread.sleep(5000);
        //switch window to get to LinkedIn window
        Set<String> openedWindows = driver.getWindowHandles();
        for (String window: openedWindows) {
            driver.switchTo().window(window);
            Thread.sleep(3000);
            if(driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")){
                //now on LinkedIn tab, check if modal is visible and handle otherwise print text
                if(driver.findElement(By.id("organization_guest_contextual-sign-in")).isDisplayed()){
                    //modal is visible save as a web element and handle its contents
                    WebElement modalContainer = driver.findElement(By.id("organization_guest_contextual-sign-in"));
                    modalContainer.findElement(By.cssSelector("button[aria-label='Dismiss']")).click(); //find close button and close modal
                    String description = driver.findElement(By.cssSelector(".line-clamp-2")).getText();
                    System.out.println(description);
                }else {//print the description text
                    String description = driver.findElement(By.cssSelector(".line-clamp-2")).getText();
                    System.out.println(description);
                }
            }
        }
    }
}
