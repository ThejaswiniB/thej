package runner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",glue = "steps",
        tags = {"@TC1,@TC2"},
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"})
public class TestRunner {
}
