package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//button[text()='Add'])[2]")
    public WebElement secondAddBtn;

    @FindBy(xpath = "(//div[@class='id_error'])[2]")
    public WebElement message;

    @FindBy(xpath = "//button[@id='submit-btn']")
    public WebElement closePopup;

    @FindBy(xpath = "(//button[text()='Add'])[1]")
    public WebElement firstAddBtn;

    @FindBy(xpath = "(//div[@class='id_error'])[1]")
    public WebElement messageRole;


}

