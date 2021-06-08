package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.List;

public class RolesTableImpl {


    HomePage homePage = new HomePage();


    public void clickButtoninEnterRoleSection(String firstAddBtn) {
        homePage.firstAddBtn.click();
        CucumberScreenShot.logPass(firstAddBtn + " button was successfully clicked ", true);
    }

    public void verifyFollowingRoleIsDisplayed(List<String> roleList) {

        MiscUtils.sleep(7000);
        for (String eachRole : roleList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_ADD_ROLE, eachRole);


            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()) {
                    CucumberScreenShot.logPass(eachRole + " role is displayed as expected", false);
                }


            } catch (Exception e) {
                CucumberScreenShot.logFail(eachRole + " role is NOT displayed", false);
            }

        }
        CucumberScreenShot.logPass("All the roles are displayed as expected: " + roleList, true);

    }

    public void seeMessageRole(String messageRole) {
        homePage.messageRole.getText();
        CucumberScreenShot.logPass( " Role" + messageRole, true);
    }

    public void deleteFollowingRole(String iconName) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DELETE_BUTTON_ROLE, iconName);
        WebElement element = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));
        element.click();
        CucumberScreenShot.logPass(iconName + " button was successfully clicked ", true);
    }

    public void verifyFollowingRoleIsNotDisplayed(List<String> roleList) {
        MiscUtils.sleep(10000);
        for (String eachRole : roleList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_ROLE, eachRole);


            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()){
                    CucumberScreenShot.logPass(eachRole + " role is NOT displayed", false);
                }


            } catch (Exception e) {
                CucumberScreenShot.logFail(eachRole + " role is displayed", false);
            }

        }
        CucumberScreenShot.logPass(roleList + " role is deleted as expected: ", true);

    }
}
