package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}

	@When("user enter wrong {string} and {string}")
	public void user_enter_wrong_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user not able to login")
	public void user_not_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter correct {string} and {string}")
	public void user_enter_correct_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify user able to login")
	public void verify_user_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
