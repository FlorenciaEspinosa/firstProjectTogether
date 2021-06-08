package impl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.List;

public class HomeImpl {

    HomePage homePage = new HomePage();

    public void verifyDepartmentIsDisplayed(List<String> departmentList) {
        MiscUtils.sleep(7000);
        for (String eachDepartment : departmentList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DEPARTMENT, eachDepartment);
            MiscUtils.sleep(7000);

            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()) {
                    CucumberScreenShot.logFail(eachDepartment + " department is NOT displayed as expected", false);
                }


            } catch (Exception e) {
                CucumberScreenShot.logPass(eachDepartment + " department is displayed", false);
            }

        }
        CucumberScreenShot.logPass("All the departments are displayed as expected: " + departmentList, true);

    }

    public void deleteFollowingDepartment(String buttonName) {
        String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DELETE_BUTTON_DEPARTMENT, buttonName);
        WebElement element = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));
        element.click();
        CucumberScreenShot.logPass(buttonName + " button was successfully clicked ", true);

    }

    public void verifyDepartmentIsDeleted(List<String> departmentList) {


        for (String eachDepartment : departmentList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DEPARTMENT, eachDepartment);

            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()) {
                    CucumberScreenShot.logFail(eachDepartment + " department is displayed", true);
                }


            } catch (Exception e) {
                CucumberScreenShot.logPass(eachDepartment + " dashboard is NOT displayed as expected", false);
            }

        }
        CucumberScreenShot.logPass("The Department is deleted as expected: " + departmentList, true);

    }


    public void clickButtonInEnterDepartmentSection(String secondAddBtn) {
        homePage.secondAddBtn.click();
        CucumberScreenShot.logPass(secondAddBtn + " button was successfully clicked ", true);
    }

    public void seeMessage(String message) {
        homePage.message.getText();
        CucumberScreenShot.logPass( "Department " + message, true);
    }

    public void verifyDepartmentIsNotDisplayed(List<String> departmentList) {
        MiscUtils.sleep(10000);
        for (String eachDepartment : departmentList) {
            String elementXpath = String.format(CommonPage.XPATH_TEMPLATE_DEPARTMENT, eachDepartment);


            try {
                WebElement webElement = WebdriverUtils.getDriver().findElement(By.xpath(elementXpath));

                if (webElement.isDisplayed()){
                    CucumberScreenShot.logFail(eachDepartment + " department is displayed", false);
                }


            } catch (Exception e) {
                CucumberScreenShot.logPass(eachDepartment + " department is NOT displayed", false);
            }

        }
        CucumberScreenShot.logPass(departmentList + " department is deleted as expected: ", true);


    }







}


