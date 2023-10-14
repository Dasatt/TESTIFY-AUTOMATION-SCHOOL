package TASModule4B;
/*  Navigate to http://demo.guru99.com/
    Click on the security Project menu.
    Input any text in the email and password field.*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDetails {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\YEMISI\\OneDrive\\Documents\\Software Testing\\Testify Academy\\Testify Automation School Repo\\Module 4\\Module 4B\\Tasks\\Task4\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#q_search")).sendKeys("Lagos");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input.top_searchbox_submit")).click();
        Thread.sleep(5000);
        String weatherData = driver.findElement(By.cssSelector("div.city_container")).getText();
        //load data as array for manipulation
        String [] arrayOfWeatherData = weatherData.split("\n");
        //format setup for result printing
        System.out.printf("%-14s | %-12s | %12s |%n", "DATE", "TEMP(°C)", "Description");
        System.out.printf("--------------------------------------------------%n");
        for (int i =0; i<arrayOfWeatherData.length; i+=4){
            System.out.printf("%-12s | %-12s | %12s |%n", arrayOfWeatherData[i]+" "+arrayOfWeatherData[i+1], arrayOfWeatherData[i+2], arrayOfWeatherData[i+3]);
        }
    }
}
