package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class ConnectInputTablePage {
    private WebDriver driver;

    public ConnectInputTablePage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

}

