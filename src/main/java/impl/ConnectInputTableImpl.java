package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.DisplayOptionsPage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConnectInputTableImpl {

    private static WebDriver driver;

  //  ConnectInputTableImpl connectInputTableImpl = new ConnectInputTableImpl();


    public void passingInfo(Map<String, String> newUserInfo) {
        for (Map.Entry<String, String> mapCredentials : newUserInfo.entrySet()) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_INPUTFIELD, mapCredentials.getKey());
            WebElement element = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));
            element.sendKeys(mapCredentials.getValue());

        }
        CucumberScreenShot.logPass(newUserInfo.keySet() + " button was successfully clicked ", false);
    }


    public void selectDropdown(String select, String dropdown) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_SELECT,dropdown);
        Select element = new Select(WebdriverUtils.getDriver().findElement(By.xpath(elementXpath)));
        MiscUtils.sleep(3000);
        element.selectByVisibleText(select);
        MiscUtils.sleep(3000);

        CucumberScreenShot.logPass(select + " button was successfully clicked ", false);

    }

    private boolean ifUserExists(List<String> userDetailList) {
        MiscUtils.sleep(5000);
        List<WebElement> webElementsList = WebdriverUtils.getDriver().findElements(By.xpath(CommonPage.XPATH_TABLE3_ROWS));
        int rowCount = webElementsList.size();
        //Row loop
        for (int i = 1; i <= rowCount; i++) {
            List<String> eachRowData = new ArrayList<>();
            //Cell loop
            for (int j = 1; j <= 4; j++) {
                String cellXpath = String.format(CommonPage.XPATH_TEMPLATE_TABLE_CELL, i, j);
                String cellText = WebdriverUtils.getDriver().findElement(By.xpath(cellXpath)).getText();
                eachRowData.add(cellText);
            }
            boolean exists = userDetailList.equals(eachRowData);
            if (exists) {
                CucumberScreenShot.logPass("The user exists in row " + i, false);
                return true;
            }
        }
        return false;
    }


    public void validateUserExists(Map<String, String> userDetails) {
        List<String> userDetailList = new ArrayList<>(userDetails.values());
        boolean exists = ifUserExists(userDetailList);
        if (exists) {
            CucumberScreenShot.logPass("The user exists", true);
        } else {
            CucumberScreenShot.logFail("The user does NOT exist", false);
        }
    }

}
