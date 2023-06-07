package SeleniumPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame_ActionClass {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver(); //navigates to the Browser
            driver.get("https://demo.guru99.com/test/guru99home/");
            // navigates to the page consisting an iframe

            driver.manage().window().maximize();
         //   WebDriverWait wait = new WebDriverWait(driver,10);
         //   WebElement element= wait.until(ExpectedCondition.visibilityOfElementLocated(By.partialLinkText("Software testing - Wikipedia")));
            driver.switchTo().frame("a077aa5e"); //switching the frame by ID
            //driver.switchTo().defaultContent();
            System.out.println("********We are switch to the iframe*******");
            driver.findElement(By.xpath("html/body/a/img")).click();
            String title = driver.getTitle();
            Assert.assertEquals(title, "Demo Guru99 Page");
            //Clicks the iframe

            System.out.println("*********We are done***************");

            driver.quit();
        }
    }

