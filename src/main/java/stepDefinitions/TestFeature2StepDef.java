package stepDefinitions;

import io.cucumber.java.en.When;

public class TestFeature2StepDef {
	
	@When("enters user name")
	public void enters_user_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is user name step execution");
		throw new RuntimeException("Sample Exception");
	}


}
