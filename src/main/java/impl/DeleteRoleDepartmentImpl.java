package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.List;

public class DeleteRoleDepartmentImpl {

        HomePage homePage = new HomePage();

    public void shouldSeeWarningPopup(String message) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_WARNING_POPUP, message);
        WebElement element = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));
        element.getText();
        homePage.closePopup.click();
        CucumberScreenShot.logPass(message + " pop-up was successfully handled ", true);
    }


    public void verifyRoleIsNotDisplayed(List<String> roleList) {
        MiscUtils.sleep(10000);
        for (String eachRole : roleList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_ROLE, eachRole);


            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()){
                    CucumberScreenShot.logPass(eachRole + " Role is NOT displayed", false);
                }


            } catch (Exception e) {
                CucumberScreenShot.logFail(eachRole + " Role is displayed", false);
            }

        }
        CucumberScreenShot.logPass(roleList + "department is deleted as expected: ", true);

    }

    public void deleteFollowingRole(String iconName) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DELETE_BUTTON_ROLE, iconName);
        WebElement element = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));
        element.click();
        CucumberScreenShot.logPass(iconName + " button was successfully clicked ", true);
    }
}
