package SeleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumDemo {
    public static void main(String[] args) {


        // 44Set the browser driver directory path at system level then we do not need to provide below line of code
        // System.setProperty("webdrivedr.chrome.driver", "C:\\Users\\15155\\chromedriver.exe");

        String baseURL= "http://www.facebook.com";
       // initialize the webdriver
        WebDriver driver = new ChromeDriver();
        // Maximize Window
        driver.manage().window().maximize();

        // Needed below wait for driver syncronization issue.
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // This is deprecated method with selenium 4 - Duration needed to be used
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Navigate to url
        driver.get(baseURL);
        System.out.println(driver.getTitle());
        List<WebElement> b= driver.findElements(By.tagName("a"))
        System.out.println(b);
        driver.getTitle();
        // Accept the pop up for notification
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notification");

        driver.quit();
        driver.close();
    }
}

/* System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           Jyoti.get("https://www.google.com");1

           List<WebElement> b= driver.findElements(By.tagName("a"));*/
