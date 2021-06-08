package steps;

import impl.DeleteRoleDepartmentImpl;
import io.cucumber.java.en.Then;

import java.util.List;

public class DeleteRoleDepartmentSteps {


    @Then("I delete the following Role")
    public void iDeleteTheFollowingRole(String iconName) {
        DeleteRoleDepartmentImpl impl = new DeleteRoleDepartmentImpl();
        impl.deleteFollowingRole(iconName);
    }

    @Then("I verify the following Role is not displayed")
    public void iVerifyTheFollowingRoleIsNotDisplayed(List<String> roleList) {
        DeleteRoleDepartmentImpl impl = new DeleteRoleDepartmentImpl();
        impl.verifyRoleIsNotDisplayed(roleList);
    }



    @Then("I should see {string} pop-up")
    public void iShouldSeePopUp(String message) {
        DeleteRoleDepartmentImpl impl = new DeleteRoleDepartmentImpl();
        impl.shouldSeeWarningPopup(message);
    }

}
