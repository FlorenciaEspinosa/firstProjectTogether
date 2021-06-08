package steps;

import impl.CountRolesAndDepImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class CountRolesAndDepSteps {

    @Then("I should validate the {string} of users is present")
    public void i_should_validate_the_of_users_is_present(String role) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateRoleIsPresent(role);
    }

    @Then("I should count {string} who is used this Role")
    public void iShouldCountWhoIsUsedThisRole(String countUsers) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateCountUsers(countUsers);
    }


    @And("I validate the users {string} is exist from Employee data {string}")
    public void iValidateTheUsersIsExistFromEmployeeData(String role, String table) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateRoleUsersExistsFromTable(role,table);
    }

    @And("I should validate the count of {string} role is equals count users from Employee data {string}")
    public void iShouldValidateTheCountOfRoleIsEqualsCountUsersFromEmployeeData(String numberUsers, String numberTable) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateNumberRolesIsSameInTable(numberUsers,numberTable);
    }

    @Then("I validate the department of users is present")
    public void iValidateTheDepartmentOfUsersIsPresent(List<String> value) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateDepartmentIsPresent(value);
    }


    @Then("I should validate number of users who is used {string} and {string} Department is present")
    public void iShouldValidateNumberOfUsersWhoIsUsedAndDepartmentIsPresent(String value1, String value2) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateCountInDepartment(value1,value2);
    }

    @And("I should validate the users of {string} and {string} is exist from Employee data {string}")
    public void iShouldValidateTheUsersOfAndIsExistFromEmployeeData(String value1, String value2, String table) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateDepartmentUsersInTable(value1,value2,table);
    }

    @And("I validate the {string} of users department is equals number users from Employee data {string}")
    public void iValidateTheOfUsersDepartmentIsEqualsNumberUsersFromEmployeeData(String countUsers, String countTable) {
        CountRolesAndDepImpl count = new CountRolesAndDepImpl();
        count.validateCountDepSameCountTableUsers(countUsers,countTable);
    }
}
