package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features  = "@target/failed.txt",
        //glue is used to stick step defs with scenarios
        glue = "steps",
        //when you set the value of dry run to true, it stops actual execution
        //and it quickly scans all the steps whether the step defs are implemented or not
        //if step def is missing, it will provide step def for particular step
        //this message is just to test the pipeline functionality
        plugin = {"pretty"}
)

public class FailedRunner {
}
