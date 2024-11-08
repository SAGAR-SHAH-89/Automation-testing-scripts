package StorX_Website_Prod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login_page {
    WebDriver driver;
    int wait_time;

    public void login() throws InterruptedException {
        int wait_time = 2000;
        // Setting up selenium.
        System.setProperty("webdriver.chrome.driver", "/home/crystal-harmony/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Opening the website.
        driver.get("https://storx.io");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        filling_login();
    }

    public void filling_login() throws InterruptedException  {
        Thread.sleep(wait_time);
        System.out.println("Loginform");
        // for (int i=0;i<=1;i++){
        // Login page View.
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[2]/ul/li[2]/a")).click();
        Thread.sleep(wait_time);
        driver.findElement(By.id("Email Address")).sendKeys("projectrec3++1@gmail.com");
        // Thread.sleep(wait_time);
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        driver.findElement(By.className("submit-btn")).click();
        // Login successfull
        logout();
        System.out.println("Congratulations Login was successfully done you are in dashboard");
        // }
    }

    public void dashboard() throws Throwable {
        System.out.println("Lets get started with the dashboard");
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[1]/a")).click();
    }
    // public void vault(){
    // System.out.println("Lets get started with the vault section");

    // }
    // public void resources(){
    // System.out.println("Lets get started with the resources section");
    // }
    // public void access(){
    // System.out.println("Lets get started with the access");
    // }
    // public void profileSetting(){
    // System.out.println("Lets get started with the Profile settings");
    // }
    // public void billing(){
    // System.out.println("Lets check the billing section now.");
    // }
    public void logout() {
        System.out.println("Loging out from storx.");
        // Clicking on the menubar
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div")).click();
        // Logout
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div/div[2]/div[3]")).click();
    }
}
