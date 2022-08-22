package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class Hooks {
	@Before
	public void beforeScenario() {
		System.out.println("Self Into");
	}
	
	@Before
	public void beforeScenario_start() {
		System.out.println("--------- start ----------");
	}

	@After
	public void afterScenario_finish() {
		System.out.println("--------- finish ----------");
	}
}
