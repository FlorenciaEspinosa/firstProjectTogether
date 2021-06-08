package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

import java.util.List;

public class DisplayOptionsPage {

    private WebDriver driver;

    public DisplayOptionsPage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

}
