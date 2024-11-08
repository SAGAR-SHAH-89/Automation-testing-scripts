package StorX_Website_Prod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Main class 
public class Test {

    public static void main(String[] args) throws Throwable {
        login_page user_login_page = new login_page();
        for (int i = 0; i <= 10; i++) {
            user_login_page.login();
        }
        // driver.quit();
    }
}
