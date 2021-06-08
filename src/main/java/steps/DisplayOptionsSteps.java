package steps;

import impl.DisplayOptionsImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DisplayOptionsSteps {

    @Then("I click {string} button on display options to limit the display count")
    public void i_click_button_on_display_options_to_limit_the_display_count(String limitBtn) {
        DisplayOptionsImpl displayOptions = new DisplayOptionsImpl();
        displayOptions.clickButton10ToLimitTable(limitBtn);
    }


    @Then("I validate only {string} users exist from Employee data {string}")
    public void iValidateOnlyUsersExistFromEmployeeData(String users, String table) {
        DisplayOptionsImpl displayOptions = new DisplayOptionsImpl();
        displayOptions.validateNumbersOfUsersExistsFromTable(users,table);
    }

    @And("I click button {string} and validate all users exist from the {string}")
    public void iClickButtonAndValidateAllUsersExistFromThe(String buttonAll, String tableUsers) {
        DisplayOptionsImpl displayOptions = new DisplayOptionsImpl();
        displayOptions.validateButtonAllExsistAllUsers(buttonAll,tableUsers);
    }
}
