package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Guru.feature", 
glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty",
		"json:Report.json",
		"html:Report"}
		)
public class TestRunner2 {

}
