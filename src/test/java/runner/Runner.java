package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",  "html:target/Runner",  //this is going to create the report under the orange folder Target
                "rerun:target/Rerun_Failed/Runner.txt"} //If one scenario failed, this is going to create a text.file with the scenario's line number, so you can go there and see easier which scenario you have to rerun
        ,glue = {"steps","hooks"} //let Cucumber knows where steps definition files are.

        //,features = {"src/main/resources/features/Retrievetoken.feature"}
        //,features = {"@target/Rerun_Failed/Runner.txt"}
        //,tags = "@Positive1"

        ,features = {"src/main/resources/features/login.feature"} //specify which feature.file I want to run. /login.feature:9 this means the scenario that starts in line 9 is going to run (if i do this, I dont need tag)
        //,features = {"@target/Rerun_Failed/Runner.txt"}

        ,tags = "@Positive1" //specify which scenario I want to run, more than one scenario can share the same tag, so they are going to run one after the other

       //,tags = "@test3"


        ,dryRun = false
        ,stepNotifications = true
)

public class Runner {

}
