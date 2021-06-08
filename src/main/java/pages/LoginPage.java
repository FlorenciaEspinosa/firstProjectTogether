package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

import java.util.List;

public class LoginPage {

    private static WebDriver driver;


    public LoginPage() {

        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement loginPage;

    @FindBy(xpath = "//a[@class='navbar-brand']//h5[text()='Welcome ']")
    public WebElement homePage;

    @FindBy(xpath = "//button[@disabled]")
    public WebElement disableBtn;



}



