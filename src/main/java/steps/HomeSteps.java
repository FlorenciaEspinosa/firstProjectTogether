package steps;

import impl.HomeImpl;
import impl.LoginImpl;
import io.cucumber.java.en.Then;


import java.util.List;

public class HomeSteps {

    @Then("I verify the following department is displayed")
    public void iVerifyTheFollowingDepartmentIsDisplayed(List<String> departmentList) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.verifyDepartmentIsDisplayed(departmentList);

    }

    @Then("I delete the following department")
    public void iDeleteTheFollowingDepartment(String iconName) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.deleteFollowingDepartment(iconName);

    }

    @Then("I verify the following department is delete")
    public void iVerifyTheFollowingDepartmentIsDelete(List<String> departmentList) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.verifyDepartmentIsDeleted(departmentList);
    }

    @Then("I click {string} button in Enter Department section")
    public void iClickButtonInEnterDepartmentSection(String secondAddBtn) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.clickButtonInEnterDepartmentSection(secondAddBtn);
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.seeMessage(message);
    }

    @Then("I verify the following department is not displayed")
    public void iVerifyTheFollowingDepartmentIsNotDisplayed(List<String> departmentList) {
        HomeImpl homeimpl = new HomeImpl();
        homeimpl.verifyDepartmentIsNotDisplayed(departmentList);
    }






}
