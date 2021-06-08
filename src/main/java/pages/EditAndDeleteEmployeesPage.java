package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

public class EditAndDeleteEmployeesPage {

    public EditAndDeleteEmployeesPage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//table[@class='table'])[3]")
    public WebElement listOfUsers;
}
