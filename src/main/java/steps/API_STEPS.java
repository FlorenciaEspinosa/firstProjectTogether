package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utils.CucumberAPIScreenShot;

import java.util.Map;

public class API_STEPS {

    RequestSpecification requestSpecification = RestAssured.requestSpecification;
    Response response;


    @Given("I send GET request to resource {string}")
    public void i_send_GET_request_to_resource(String resource) {
        requestSpecification.basePath(resource);
        response = requestSpecification.get();
        CucumberAPIScreenShot.logPass("Send GET request to: " + resource);

    }


    @Then("Response has status code {int}")
    public void responseHasStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
        CucumberAPIScreenShot.logPass("Expected code " + statusCode + " Actual code " + response.getStatusCode());
    }
    @Given("Request header {string} is set as {string}")
    public void request_header_is_set_as(String property, String value) {
        requestSpecification.header(property,value);
        CucumberAPIScreenShot.logPass("Request header " + property);
    }

    @Then("I set request body with following parameters")
    public void iSetRequestBodyWithFollowingParameters(Map<String,String> map) {
        requestSpecification.body(map);
        CucumberAPIScreenShot.logPass(map + " New user was created");
    }

    @Then("I send POST Request to the resource {string}")
    public void iSendPOSTRequestToTheResource(String resource) {
        requestSpecification.basePath(resource);
        response = requestSpecification.post();
        CucumberAPIScreenShot.logPass("Send POST Request to: " + resource);
    }

    @Then("I send query parameter to {string} as {string}")
    public void iSendQueryParameterToAs(String name, String value) {
        requestSpecification.queryParam(name,value);
    }

    @Then("I set  Update request body with following parameters")
    public void iSetUpdateRequestBodyWithFollowingParameters(Map<String,String> map) {
        requestSpecification.body(map);
    }

    @Then("I send PUT Request to the resource {string}")
    public void iSendPUTRequestToTheResource(String resource) {
        requestSpecification.basePath(resource);
        response = requestSpecification.put();

    }


    @Given("I use token to Update Employee {string}")
    public void iUseTokenToUpdateEmployee(String token) {
        requestSpecification.auth().oauth2(token);
    }
}
