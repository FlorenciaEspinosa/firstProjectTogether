package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import utils.ConfigReader;
import utils.CucumberAPIScreenShot;
import utils.CucumberScreenShot;
import utils.WebdriverUtils;


public class Hooks {


    @Before
    public void setUp(Scenario currentScenario) {
       WebdriverUtils.getDriver().get(ConfigReader.getProperty("url"));
       CucumberScreenShot.initScenario(currentScenario);
       // CucumberAPIScreenShot.initScenario(currentScenario);
        //RestAssured.baseURI = ConfigReader.getProperty("url");
        //RestAssured.requestSpecification = RestAssured.given();
    }

    @After
    public void tearDown() {
        WebdriverUtils.driverKiller();
    }
}
