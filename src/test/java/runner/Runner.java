package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",  "html:target/Runner",
                "rerun:target/Rerun_Failed/Runner.txt"}
        ,glue = {"steps","hooks"}

        //,features = {"src/main/resources/features/Retrievetoken.feature"}
        //,features = {"@target/Rerun_Failed/Runner.txt"}
        ,tags = "@token"

        ,features = {"src/main/resources/features/Retrievetoken.feature"}
        //,features = {"@target/Rerun_Failed/Runner.txt"}

        //,tags = "@test1"

       //,tags = "@test3"


        ,dryRun = false
        ,stepNotifications = true
)

public class Runner {

}
