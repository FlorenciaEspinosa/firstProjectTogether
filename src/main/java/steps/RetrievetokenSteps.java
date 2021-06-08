package steps;

import impl.RetrievetokenImpl;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RetrievetokenSteps {

    @Then("I validate {string} button is present on the page")
    public void i_validate_button_is_present_on_the_page(String tokenBtn) {
        RetrievetokenImpl retrievetoken = new RetrievetokenImpl();
        retrievetoken.vlidatrCopyTokenBtnIsPresent(tokenBtn);

    }


    @Then("I should validate the existing token {string} has changed to a new token {string}")
    public void iShouldValidateTheExistingTokenHasChangedToANewToken(String oldToken, String newToken) {
        Assert.assertNotEquals(oldToken,newToken);
    }
}
