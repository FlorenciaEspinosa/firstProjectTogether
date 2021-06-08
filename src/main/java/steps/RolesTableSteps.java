package steps;

import impl.RolesTableImpl;
import impl.RolesTableImpl;
import io.cucumber.java.en.Then;

import java.util.List;

public class RolesTableSteps {


    @Then("I click {string} button in Enter Role section")
    public void iClickButtonInEnterRoleSection(String firstAddBtn) {
        RolesTableImpl impl = new RolesTableImpl();
        impl.clickButtoninEnterRoleSection(firstAddBtn);

    }


    @Then("I verify the following role is displayed")
    public void iVerifyTheFollowingRoleIsDisplayed(List<String> departmentList) {
        RolesTableImpl impl = new RolesTableImpl();
        impl.verifyFollowingRoleIsDisplayed(departmentList);
    }

    @Then("I should see {string} message in Role section")
    public void iShouldSeeMessageInRoleSection(String messageRole) {
        RolesTableImpl impl = new RolesTableImpl();
        impl.seeMessageRole(messageRole);
    }

    @Then("I delete the following role")
    public void iDeleteTheFollowingRole(String iconName) {
        RolesTableImpl impl = new RolesTableImpl();
        impl.deleteFollowingRole(iconName);
    }

    @Then("I verify the following role is not displayed")
    public void iVerifyTheFollowingRoleIsNotDisplayed(List<String> roleList) {
        RolesTableImpl impl = new RolesTableImpl();
        impl.verifyFollowingRoleIsNotDisplayed(roleList);

    }
}
