package steps;

import impl.EmployeeImpl;
import io.cucumber.java.en.Then;


public class EmployeeDataSteps {

    @Then("I verify if the following {string} exists in the table")
    public void iVerifyIfTheFollowingExistsInTheTable(String fields) {
        EmployeeImpl employeeimpl = new EmployeeImpl();
        employeeimpl.verifyfieldsexists();
    }
}

