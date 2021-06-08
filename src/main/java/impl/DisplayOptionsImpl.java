package impl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.DisplayOptionsPage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.List;

public class DisplayOptionsImpl {

    private static WebDriver driver;

    DisplayOptionsPage displayOptionsPage = new DisplayOptionsPage();


    public void clickButton10ToLimitTable(String limitBtn) {

        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, limitBtn);
        WebElement limit10 = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        limit10.click();
        if (limit10.isEnabled()) {
            CucumberScreenShot.logPass("Display Options: Button " + limitBtn + " to limit Employee data table was Clicked ",true);
        }else {
            CucumberScreenShot.logFail("Display Options: Button" + limitBtn +  " to limit Employee data table is NOT Enabled ",true);
        }

    }


    public void validateNumbersOfUsersExistsFromTable(String users, String table) {
        MiscUtils.sleep(2000);
        int convertUsers = Integer.parseInt(users);
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_NUMBERS_OF_USERS_IN_TABLE, table);
        List<WebElement> usersTable = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));
        if (convertUsers == usersTable.size()) {
            CucumberScreenShot.logPass(users + " Users is existing from Employee data table ",true);
        } else {
            CucumberScreenShot.logFail(users + " Users is NOT existing from Employee data table ",true);
        }

    }

    public void validateButtonAllExsistAllUsers(String buttonAll, String tableUsers) {
        String AllButton = String.format(CommonPage.XPATH_TEMPLATE_BUTTON, buttonAll);
        WebElement buttonall = WebdriverUtils.getDriver().findElement(By.xpath(AllButton));
        buttonall.click();

        MiscUtils.sleep(2000);

        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_NUMBERS_OF_USERS_IN_TABLE, tableUsers);
        List<WebElement> tableCountAll = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));

        if (tableCountAll.size() > 50) {
           CucumberScreenShot.logPass(tableUsers + " Users is existing from Employee data table ",true);
        } else {
            CucumberScreenShot.logFail(tableUsers + " Users is NOT existing from Employee data table ",true);
        }

   }
}
