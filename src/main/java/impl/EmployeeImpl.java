package impl;


import pages.WelcomePage;
import utils.CucumberScreenShot;


public class EmployeeImpl {

    WelcomePage welcomePage = new WelcomePage();

    public void verifyfieldsexists() {

        if (welcomePage.employeeDataTable.isDisplayed()) {
            CucumberScreenShot.logPass("Table fields are displayed", true);
        } else {
            CucumberScreenShot.logFail("Table fields are NOT displayed", true);
        }

    }
}

