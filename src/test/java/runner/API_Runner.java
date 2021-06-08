package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/API_Runner",
                "rerun:target/Rerun_Failed/API_Runner.txt",
                "json:target/cucumberTestReport.json"}
        ,glue = {"steps","hooks"}
        ,features = {"src/main/resources/API_features/CreateNewEmployees.feature"}
        //,features = {"@target/Rerun_Failed/API_Runner.txt"}
        ,tags = "@POST"
        ,dryRun = false
        ,stepNotifications = true
)



public class API_Runner {

}
