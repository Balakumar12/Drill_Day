package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {"StepDefinitions"},
plugin = {"html:target/cucumber-html-report"})
public class TestRunner {

}
