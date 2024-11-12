package StorX_Website_Prod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class login_page {
        WebDriver driver;
        int wait_time;

        public void login() throws InterruptedException {
                int wait_time = 10000;
                // Setting up selenium.
                System.setProperty("webdriver.chrome.driver",
                                "/home/crystal-harmony/chromedriver-linux64/chromedriver");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless"); // Run in headless mode
                options.addArguments("--disable-gpu");
                WebDriver driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                // Opening the website.
                driver.get("https://storx.io");
                driver.manage().window().maximize();
                Thread.sleep(wait_time);
                // Login page View.
                WebElement loginformView = driver
                                .findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div/div/div[2]/ul/li[2]/a"));
                loginformView.click();
                for (int i = 1; i <= 10; i++) {
                        System.out.println("Login into the application :-" + i);
                        Thread.sleep(wait_time);
                        filling_login(driver);
                }
                driver.quit();
        }

        public void filling_login(WebDriver driver) throws InterruptedException {
                Thread.sleep(wait_time);
                WebElement emailTextField = driver.findElement(By.id("Email Address"));
                emailTextField.sendKeys("projectrec3++1@gmail.com");
                Thread.sleep(wait_time);
                WebElement passwordTextField = driver.findElement(By.id("Password"));
                passwordTextField.sendKeys("Test@123");
                WebElement submitbutton = driver.findElement(By.className("submit-btn"));
                submitbutton.click();
                Thread.sleep(wait_time);
                dashboard(driver);
        }

        public void dashboard(WebDriver driver) throws InterruptedException {
                // System.out.println("Congratulations Login was successfully done you are in
                // dashboard");
                // PageNavigation testing in dashboard
                Thread.sleep(wait_time);
                // System.out.println("Lets get started with the dashboard");
                // Checking the Vault card functionality now.
                System.out.println(
                                "Lets check the navigation in the Dashboard using the vault card present in the dashboard page.");
                WebElement vaultCard = driver
                                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[1]/a"));
                vaultCard.click();
                Thread.sleep(wait_time);
                driver.navigate().back();
                // Access Section checking is happening now using the access card option in the
                // Dashboard.
                System.out.println("Lets check the accesscard in the Dashboard section.");
                Thread.sleep(wait_time);
                WebElement accessgrantCard = driver
                                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[2]/a"));
                accessgrantCard.click();
                // System.out.println("Navigated to the access page.");
                Thread.sleep(wait_time);
                driver.navigate().back();
                Thread.sleep(wait_time);
                // Billing section checking happening now using the Billing card option
                System.out.println("Lets check the billing card in dashboard.");
                WebElement billingCard = driver
                                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div[1]/div/div/div[3]/a"));
                billingCard.click();
                Thread.sleep(wait_time);
                driver.navigate().back();
                Thread.sleep(wait_time);
                resources(driver);

        }

        // public void vault(){
        // System.out.println("Lets get started with the vault section");
        // }
        public void resources(WebDriver driver) throws InterruptedException {
                // System.out.println("Lets get started with the resources section");
                // Resources
                WebElement Resources = driver.findElement(By.xpath("//*[@id=\"left-sidebar\"]/div/div[1]/ul/li[3]/a"));
                Resources.click();
                WebElement usageguidelines = driver
                                .findElement(By.xpath("//*[@id=\"main-content\"]/div/div/ul/li[1]/a"));
                usageguidelines.click();
                Thread.sleep(wait_time);
                driver.navigate().back();
                WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/ul/li[3]/a"));
                contactUs.click();
                Thread.sleep(wait_time);
                driver.navigate().back();
                plan(driver);
        }

        // public void access(){
        // System.out.println("Lets get started with the access");
        // }
        // public void profileSetting(){
        // System.out.println("Lets get started with the Profile settings");
        // }
        // public void billing(WebDriver driver) throws InterruptedException {

        // plan(driver);
        // }

        public void plan(WebDriver driver) throws InterruptedException {
                // Explore Plan page
                Thread.sleep(wait_time);
                WebElement upgradePlan = driver.findElement(By.xpath("//*[@id=\"left-sidebar\"]/div/div[2]/a"));
                upgradePlan.click();
                Thread.sleep(wait_time);
                logout(driver);
        }

        public void logout(WebDriver driver) {
                // Logout
                System.out.println("Loging out from storx.");
                // Clicking on the menubar
                driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div")).click();
                driver.findElement(By.xpath("//*[@id=\"dashboard-header\"]/div/div/div[2]/ul/li/div/div[2]/div[3]"))
                                .click();
                // login(driver);
        }
}
