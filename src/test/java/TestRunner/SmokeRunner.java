package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features" ,
        glue = "StepDefinitions", // the name of the package where my stepDefinitions are
        dryRun=false,
        tags="@testcase2",
       plugin={"pretty","html:target/Cucumber.html", "json:target/Cucumber.json"})

public class SmokeRunner {

}

//target folder is mostly used for storing the test case execution reports generated using Cucumber