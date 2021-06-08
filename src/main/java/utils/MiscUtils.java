package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiscUtils {

    private static WebDriver driver;

    public static void sleep (long millisecond){

        try {
            Thread.sleep(millisecond);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void explicitlyWait() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }

}
