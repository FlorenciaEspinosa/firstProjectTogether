package steps;

import impl.ConnectInputTableImpl;
import impl.HomeImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class ConnectInputTableSteps {

    @Then("I enter the following values in the following fields")
    public void iEnterTheFollowingValuesInTheFollowingFields(Map<String, String> newUserInfo) {
        ConnectInputTableImpl impl = new ConnectInputTableImpl();
        impl.passingInfo(newUserInfo);

    }

    @And("I choose {string} from dropdown {string}")
    public void iChooseFromDropdown(String select, String dropdown) {
        ConnectInputTableImpl impl = new ConnectInputTableImpl();
        impl.selectDropdown(select,dropdown);

    }

    @Then("verify if the following user exists in the table")
    public void verifyIfTheFollowingUserExistsInTheTable(Map<String, String> userDetails) {
        ConnectInputTableImpl impl = new ConnectInputTableImpl();
        impl.validateUserExists(userDetails);
    }

}
