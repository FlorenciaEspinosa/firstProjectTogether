package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebdriverUtils;

import java.util.List;

public class WelcomePage {

    private WebDriver driver;

    public WelcomePage() {
        PageFactory.initElements(WebdriverUtils.getDriver(), this);
    }

    public List<WebElement> EmployeeDataTable() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='container']//tr"));
        return list;

    }

    @FindBy(xpath = "//div[@class='container']//tr")
    public WebElement employeeDataTable;

}

