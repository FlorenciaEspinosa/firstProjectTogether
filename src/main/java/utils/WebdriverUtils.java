package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebdriverUtils {

    private static WebDriver driver;

    public static WebDriver getDriver() {
       if (driver == null) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }

        return driver;

    }




    public static void driverKiller() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
