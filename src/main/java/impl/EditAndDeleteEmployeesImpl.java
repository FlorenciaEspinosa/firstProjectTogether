package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.EditAndDeleteEmployeesPage;
import utils.CucumberScreenShot;
import utils.MiscUtils;
import utils.WebdriverUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EditAndDeleteEmployeesImpl {

    EditAndDeleteEmployeesPage edit = new EditAndDeleteEmployeesPage();

    public void AddingNewUser(String value, String selectField) {
        String Xpath = String.format(CommonPage.XPATH_TEMPLATE_SELECT, selectField);
        Select role = new Select(WebdriverUtils.getDriver().findElement(By.xpath(Xpath)));
        role.selectByVisibleText(value);
        CucumberScreenShot.logPass(value + " is present ", true);


    }

    public void validateUserExistFromTable(List<String> list) {

        String Xpath = String.format(CommonPage.XPATH_LIST_USERS_TABLE, list);
        List<WebElement> userList = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getText().contains("7") && userList.get(i).getText().contains("John")
                    && userList.get(i).getText().contains("Doe") && userList.get(i).getText().contains("sdet")
                    && userList.get(i).getText().contains("Security")) {
                CucumberScreenShot.logPass(list + " User is exist from Employee data table ", true);
            } else {
                CucumberScreenShot.logFail(list + " User is NOT exist from Employee data table ", true);
            }
        }
    }

    public void EditButtonUpdateUser(String buttonEdit) {
        MiscUtils.sleep(3000);
        String Xpath = String.format(CommonPage.XPATH_UPDATE_USERS_BUTTON, buttonEdit);
        WebElement EditButton = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        EditButton.click();
        CucumberScreenShot.logPass(buttonEdit + " click button is successfully ", true);

    }

    public void UpdateForUser(Map<String, String> editUser) {
        MiscUtils.sleep(3000);
        for (String NewValue : editUser.keySet()) {
            String Xpath = String.format(CommonPage.XPATH_TEMPLATE_EDIT_USERS_INPUTFIELD, NewValue);
            WebElement addUpdates = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
            if (NewValue.contains("firstName") && NewValue.contains("lastName")
                    && NewValue.contains("role") && NewValue.contains("department")) {

            }
            addUpdates.clear();

            addUpdates.sendKeys(editUser.get(NewValue));


        }
    }

    public void validateUpdatedUser(List<String> updatedUser) {
        String Xpath = String.format(CommonPage.XPATH_LIST_USERS_TABLE, updatedUser);
        List<WebElement> userList = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getText().contains("7") && userList.get(i).getText().contains("TLA")
                    && userList.get(i).getText().contains("Academy") && userList.get(i).getText().contains("sdet")
                    && userList.get(i).getText().contains("Security")) {
                CucumberScreenShot.logPass(updatedUser + " User is exist from Employee data table ", true);
            } else {
                CucumberScreenShot.logFail(updatedUser + " User is NOT exist from Employee data table ", true);
            }
        }

    }

    public void deleteUserFromTable(String deleteUser) {
        String Xpath = String.format(CommonPage.XPATH_DELETE_USERS_BUTTON, deleteUser);
        WebElement delete = WebdriverUtils.getDriver().findElement(By.xpath(Xpath));
        delete.click();
        CucumberScreenShot.logPass(deleteUser + " Click delete button to delete user ", true);
    }

    public void validateUserNotExistFromTable(List<String> confirm) throws IOException {
        MiscUtils.sleep(3000);
        String Xpath = String.format(CommonPage.XPATH_LIST_USERS_TABLE, confirm);
        List<WebElement> userList = WebdriverUtils.getDriver().findElements(By.xpath(Xpath));
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).isDisplayed()) {
                CucumberScreenShot.logPass(confirm + " User is NOT exist from Employee data table ", true);
            } else {
                CucumberScreenShot.logFail(confirm + " User is exist from Employee data table ", true);
            }
        }

    }
}
