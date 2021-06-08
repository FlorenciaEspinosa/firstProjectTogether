package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.CountRolesAndDepPage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.util.List;

public class CountRolesAndDepImpl {

    CountRolesAndDepPage countRolesAndDepPage = new CountRolesAndDepPage();


    public void validateRoleIsPresent(String role) {
        if (countRolesAndDepPage.verifyRoleIsPres.isDisplayed()) {
            CucumberScreenShot.logPass(role + "  present on the page ", true);
        } else {
            CucumberScreenShot.logFail(role + "   NOT present on the page ", true);
        }
    }

    public void validateCountUsers(String countUsers) {

        int newUsers = Integer.parseInt(countRolesAndDepPage.countUsersRolls.getText().substring(0,
                countRolesAndDepPage.countUsersRolls.getText().length() - 1));

        CucumberScreenShot.logPass(countUsers + " The count of users roles is present ", true);

        }



    public void validateRoleUsersExistsFromTable(String role, String table) {
        String convUsersRole = String.valueOf(countRolesAndDepPage.usersRoleCompare.getText()
                .substring(0, countRolesAndDepPage.usersRoleCompare.getText().length() - 4));

        if (countRolesAndDepPage.tableRoleUsers.getText().contains(convUsersRole)) {
            CucumberScreenShot.logPass(role + " Users role is exist from Employee data table ", true);
        } else {
            CucumberScreenShot.logFail(role + " Users role is NOT exist from Employee data table ", true);
        }

    }

    public void validateNumberRolesIsSameInTable(String numberUsers, String numberTable) {
        MiscUtils.sleep(3000);

        int currentUsers = Integer.parseInt(countRolesAndDepPage.countUsersRolls.getText().substring(0,
                countRolesAndDepPage.countUsersRolls.getText().length() - 1));

        String Xpath = String.format(CommonPage.XPATH_TABLE_COUNT_ROLES, numberTable);
        List<WebElement> countRolesInTable = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));

        int listSize = countRolesInTable.size();

        if (currentUsers == listSize) {
            CucumberScreenShot.logPass(numberTable + " Number of users is same number of users in the Employee data table ", true);
        } else {
            CucumberScreenShot.logFail(numberTable + " Number of users is NOT same number of users in the Employee data table ", true);
        }
    }

    public void validateDepartmentIsPresent(List<String> value) {

        String Xpath = String.format(CommonPage.XPATH_DEPARTMENT_ROLES_PRESENT, value);
        List<WebElement> departPres = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));
        for (int i = 0; i < departPres.size(); i++) {
            if (departPres.get(i).isDisplayed()) {
                CucumberScreenShot.logPass(value + "  is present ", true);
            } else {
                CucumberScreenShot.logFail(value + "  is NOT present ", true);
            }
        }
    }

    public void validateCountInDepartment(String value1, String value2) {

        int currentUsersDepartment2 = Integer.parseInt(countRolesAndDepPage.countUsersDepartment2.getText().substring(0,
                countRolesAndDepPage.countUsersDepartment2.getText().length() - 1));

        CucumberScreenShot.logPass("Number of users who is used this department is present ", true);

        }



    public void validateDepartmentUsersInTable(String value1, String value2, String table) {

        String Xpath = String.format(CommonPage.XPATH_DEPARTMENT_TABLE_VERIFY, table);
        List<WebElement> depTableVerify = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));

        String Xpath2 = String.format(CommonPage.XPATH_DEPARTMENT_TABLE_VERIFY2, table);
        List<WebElement> depTableVerify2 = WebdriverUtils.getDriver().findElements(By.xpath(Xpath2));

        for (int i = 0; i < depTableVerify.size(); i++) {
             if (depTableVerify.get(i).getText().contains(value1) && depTableVerify2.get(i).getText().contains(value2)) {
                 CucumberScreenShot.logPass(value1 + " | " + value2 + " | " + table + "  is exist from Employee data table ",true);
             } else {
                 CucumberScreenShot.logFail(value1 + " | " + value2 + " | " + table + "  is NOT exist from Employee data table ",true);
             }
        }

    }

    public void validateCountDepSameCountTableUsers(String countUsers, String countTable) {
        int currentUsersDepartment = Integer.parseInt(countRolesAndDepPage.countUsersDepartment.getText().substring(0,
                countRolesAndDepPage.countUsersDepartment.getText().length() - 1));

        int currentUsersDepartment2 = Integer.parseInt(countRolesAndDepPage.countUsersDepartment2.getText().substring(0,
                countRolesAndDepPage.countUsersDepartment2.getText().length() - 1));

        String Xpath = String.format(CommonPage.XPATH_DEPARTMENT_TABLE_WITH_DEPARTMENT_COUNT, countTable);
        List<WebElement> depTableVerify = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));

        String Xpath2 = String.format(CommonPage.XPATH_DEPARTMENT_TABLE_WITH_DEPARTMENT_COUNT2, countTable);
        List<WebElement> depTableVerify2 = WebdriverUtils.getDriver().findElements(By.xpath(Xpath2));

        int firstDep = depTableVerify.size();
        int secondDep = depTableVerify2.size();

        if (currentUsersDepartment == firstDep && currentUsersDepartment2 == secondDep) {
            CucumberScreenShot.logPass("Number of users department is equals number users from Employee data table",true);
        } else {
            CucumberScreenShot.logFail("Number of users department is NOT equals number users from Employee data table",true);
        }
    }
}
