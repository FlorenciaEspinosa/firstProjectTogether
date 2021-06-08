package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class CountRolesAndDepPage {

    public CountRolesAndDepPage() {
        PageFactory.initElements(WebdriverUtils.getDriver(),this);
    }



    @FindBy(xpath = "(//table[@class='table']//td[starts-with(text(), 'sdet')])[1]")
    public WebElement verifyRoleIsPres;

    @FindBy(xpath = "(//table[@class='table']//td//span)[1]")
    public WebElement countUsersRolls;

    @FindBy(xpath = "(//table[@class='table']//td[1])[1]")
    public WebElement usersRoleCompare;

    @FindBy(xpath = "//table[@class='table']//td[text()='sdet']")
    public WebElement tableRoleUsers;

    @FindBy(xpath = "(//table[@class='table']//td//span)[2]")
    public WebElement countUsersDepartment;

    @FindBy(xpath = "(//table[@class='table']//td//span)[3]")
    public WebElement countUsersDepartment2;



}
