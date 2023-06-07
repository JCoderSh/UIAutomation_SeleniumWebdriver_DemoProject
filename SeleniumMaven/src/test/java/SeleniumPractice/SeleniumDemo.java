package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class GooglePageSearchFunc {
    public static void main(String[] args) {


         // Earlier we needed to Set the browser driver directory path at system level then we do not need to provide below line of code
        // System.setProperty("webdrivedr.chrome.driver", "path");

        String baseURL = "http://www.google.com";

        // initialize the driver
        WebDriver driver = new ChromeDriver();

        // Maximize Window
        driver.manage().window().maximize();

        // Needed below wait for driver synchronization issue.
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // This is deprecated method with selenium 4

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to url
        driver.get(baseURL);

        System.out.println(driver.getTitle());
        //Alert AlertPopup= driver.switchTo().alert();
        driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a")).click();
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]")).click();
        System.out.println(driver.getTitle());

        // Below code is for Accept the pop up for notification
         ChromeOptions options = new ChromeOptions();
        // options.addArguments("disable-notification");

        driver.quit();
        driver.close();
    }
    }
}


