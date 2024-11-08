package StorX_Website_Prod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login_page {
    public void login() throws Throwable {
        int wait_time = 2000;
        // Setting up selenium.
        System.setProperty("webdriver.chrome.driver", "/home/crystal-harmony/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Opening the website.
        driver.get("https://storx.io");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Login page View.
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[2]/ul/li[2]/a")).click();
        // Thread.sleep(wait_time);
        driver.findElement(By.id("Email Address")).sendKeys("projectrec3++1@gmail.com");
        // Thread.sleep(wait_time);
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        driver.findElement(By.className("submit-btn")).click();
        //Login successfull
        System.out.println("Congratulations Login was successfully done you are in dashboard");
        // Clicking on the menubar
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div")).click();
        //Logout
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div/div[2]/div[3]")).click();
    }
}
