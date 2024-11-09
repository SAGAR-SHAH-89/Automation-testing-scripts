package StorX_Website_Prod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Opening the website.
        driver.get("https://storx.io");
        driver.manage().window().maximize();

        // Login page View.
        WebElement loginformView = driver
                .findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[2]/ul/li[2]/a"));
        loginformView.click();
        System.out.println("Loginform");
        // Thread.sleep(wait_time);
        WebElement emailTextField = driver.findElement(By.id("Email Address"));
        emailTextField.sendKeys("projectrec3++1@gmail.com");
        // Thread.sleep(wait_time);
        WebElement passwordTextField = driver.findElement(By.id("Password"));
        passwordTextField.sendKeys("Test@123");
        WebElement submitbutton = driver.findElement(By.className("submit-btn"));
        submitbutton.click();
        // Login successfull
        // logout();
        System.out.println("Congratulations Login was successfully done you are in dashboard");
        // PageNavigation testing in dashboard
        Thread.sleep(wait_time);
        System.out.println("Lets get started with the dashboard");
        Thread.sleep(wait_time);
        WebElement vaultCard = driver
                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[1]/a"));
        vaultCard.click();
        Thread.sleep(wait_time);
        System.out.println("Navigated to the vault page.");
        Thread.sleep(wait_time);
        driver.navigate().back();
        System.out.println("Vault page navigation is passed.");

        Thread.sleep(10000);
        
        WebElement accessgrantCard = driver
                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[2]/a"));
        accessgrantCard.click();
        System.out.println("Navigated to the access page.");
        Thread.sleep(wait_time);
        driver.navigate().back();
        System.out.println("access grant page navigation passed.");
        
        Thread.sleep(10000);
        WebElement billingCard = driver
                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[3]/a"));
        billingCard.click();
        System.out.println("Navigated to the billing page");
        Thread.sleep(wait_time);
        driver.navigate().back();
        System.out.println("Billing page navigation successful");
        Thread.sleep(wait_time);

        //Resources
        WebElement Resources=driver.findElement(By.xpath("//*[@id=\"left-sidebar\"]/div/div[1]/ul/li[3]/a"));
        Resources.click();
        WebElement usageguidelines=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/ul/li[1]/a"));
        usageguidelines.click();
        Thread.sleep(wait_time);
        driver.navigate().back();
        WebElement contactUs=driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/ul/li[3]/a"));
        contactUs.click();
        Thread.sleep(wait_time);
        driver.navigate().back();

        //Explore Plan page
        WebElement upgradePlan=driver.findElement(By.xpath("//*[@id=\"left-sidebar\"]/div/div[2]/a"));
        upgradePlan.click();
        Thread.sleep(wait_time);
        System.out.println("Loging out from storx.");
        // Clicking on the menubar
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div")).click();
        // Logout
        driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div/div[2]/div[3]")).click();
        driver.quit();
    }

    // public void filling_login() throws InterruptedException {
    // // Thread.sleep(wait_time);
    // // for (int i=0;i<=1;i++){

    // // }
    // }

    // public void dashboard() throws Throwable {

    // }
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
    // public void logout() {
        
    // }
}
