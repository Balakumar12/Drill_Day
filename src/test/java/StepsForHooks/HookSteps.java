package StepsForHooks;

import io.cucumber.java.en.*;

public class HookSteps {
	
	@Given("This is a first step")
	public void first_step() {
		System.out.println("Hi");
	}
	
	@When("This is a second step")
	public void second_step() {
		System.out.println("I am");
	}
	
	@Then("This is a Third step")
	public void third_step() {
		System.out.println("Bala");
	}
	
}
