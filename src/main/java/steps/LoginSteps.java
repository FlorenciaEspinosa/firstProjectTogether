package steps;

import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginSteps {

    @Given("I navigate to Employee Management")
    public void i_navigate_to_Employee_Management() {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.navigateToPage();
    }

    @Then("I should see Login page")
    public void iShouldSeeLoginPage() {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.validateLoginPage();
    }

    @Given("I enter {string} in the {string} input field")
    public void iEnterInTheInputField(String name, String input) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.enterUsername(name,input);
    }

    @And("I click {string} button")
    public void iClickButton(String signInBtn) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.clickSignInBtn(signInBtn);
    }

    @And("I should see {string}")
    public void iShouldSee(String invalidUsername) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.invalidCredUsername(invalidUsername);
    }


    @And("I should see {string} page")
    public void iShouldSeePage(String homePage) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.validateHomePage(homePage);
    }

    @Then("I validate the {string} button disabled if no input was made")
    public void iValidateTheButtonDisabledIfNoInputWasMade(String BtnDis) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.validateSigninBtnDis(BtnDis);
    }


    @Then("I validate the {string} button disable if only {string} will be in {string} input field")
    public void iValidateTheButtonDisableIfOnlyWillBeInInputField(String btn, String value, String input) {
        LoginImpl loginimpl = new LoginImpl();
        loginimpl.validateSigninBtnWithOneInput(btn,value,input);
    }


}
