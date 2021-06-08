package steps;

import impl.EditAndDeleteEmployeesImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EditAndDeleteEmployeesSteps {

    @Then("I select {string} in the {string} select field")
    public void i_select_in_the_select_field(String value, String selectField) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.AddingNewUser(value,selectField);

    }

    @And("I validate the user is exist from Employee data table")
    public void iValidateTheUserIsExistFromEmployeeDataTable(List<String> list) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.validateUserExistFromTable(list);
    }


    @Then("I click  yellow {string} to update user")
    public void iClickYellowToUpdateUser(String buttonEdit) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.EditButtonUpdateUser(buttonEdit);
    }

    @Then("I enter the following values in the following fields to update user")
    public void iEnterTheFollowingValuesInTheFollowingFieldsToUpdateUser(Map<String,String> editUser) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.UpdateForUser(editUser);
    }

    @And("I validate the updated user is exist from Employee data table")
    public void iValidateTheUpdatedUserIsExistFromEmployeeDataTable(List<String> updatedUser) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.validateUpdatedUser(updatedUser);
    }

    @Then("I click  red {string} to delete user")
    public void iClickRedToDeleteUser(String deleteUser) {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.deleteUserFromTable(deleteUser);
    }

    @And("I validate the user is NOT exist from Employee data table")
    public void iValidateTheUserIsNOTExistFromEmployeeDataTable(List<String> confirm) throws IOException {
        EditAndDeleteEmployeesImpl edit = new EditAndDeleteEmployeesImpl();
        edit.validateUserNotExistFromTable(confirm);
    }
}
