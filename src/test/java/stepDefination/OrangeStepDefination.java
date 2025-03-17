package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;
import org.junit.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pageObject.LoginPage;
import utilities.ReadConfig;

public class OrangeStepDefination {

public WebDriver driver;
public LoginPage loginpg;

@Before
public void setup() {
	
	ReadConfig readConfig = new ReadConfig();
	  // Write code here that turns the phrase above into concrete actions
	String browser = readConfig.getBrowser();
	
	//launch browser
	switch(browser.toLowerCase())
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;

	case "msedge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;

	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	default:
		driver = null;
		break;

	}

	
}
@Given("the user is on the orangeHRM login page")
public void the_user_is_on_the_orange_hrm_login_page() {
    // Write code here that turns the phrase above into concrete actions
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.manage().window().maximize();
   
}
@When("the user enters username {string} and passowrd {string}")
public void the_user_enters_username_and_passowrd(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
    loginpg.enterUserName(username);
    loginpg.enterPassword(password);
}

@When("clicks the login button")
public void clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    loginpg.ClickOnLogin();
}

@Then("the user should be redirecteed to the dashboard page")
public void the_user_should_be_redirecteed_to_the_dashboard_page() {
    // Write code here that turns the phrase above into concrete actions
   String title=driver.getTitle();
   String Expected="OrangeHRM";
   
  Assert.assertEquals(title, Expected);
}

@When("the user enters username {string} and password {string}")
public void the_user_enters_username_and_password(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	loginpg.enterUserName(username);
	loginpg.enterPassword(password);
}

@Then("an error message {string} should be displayed")
public void an_error_message_should_be_displayed(String errormsg) {
    // Write code here that turns the phrase above into concrete actions
    String error=driver.switchTo().alert().getText();
    System.out.println(error);
    SoftAssert asert=new SoftAssert();
    asert.assertEquals(error, errormsg);
}

@Given ("the user is logged in")
public void the_user_is_logged_in() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks on the {string} tab")
public void the_user_clicks_on_the_tab(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("selects {string}")
public void selects(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the {string} form should be displayed")
public void the_form_should_be_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is on the {string} page")
public void the_user_is_on_the_page(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user enters first name {string}, last name {string}, and employee ID {string}")
public void the_user_enters_first_name_last_name_and_employee_id(String string, String string2, String string3) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks the save button")
public void clicks_the_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the new employee {string} should be added successfully")
public void the_new_employee_should_be_added_successfully(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user enters employee name {string} in the search field")
public void the_user_enters_employee_name_in_the_search_field(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks the search button")
public void clicks_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the employee {string} should be displayed in the search results")
public void the_employee_should_be_displayed_in_the_search_results(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user navigates to the {string} section")
public void the_user_navigates_to_the_section(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("chooses leave type {string}")
public void chooses_leave_type(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("selects from date {string} and to date {string}")
public void selects_from_date_and_to_date(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("adds a comment {string}")
public void adds_a_comment(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks the apply button")
public void clicks_the_apply_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("a confirmation message {string} should be displayed")
public void a_confirmation_message_should_be_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is logged in as an admin")
public void the_user_is_logged_in_as_an_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user navigates to the {string}")
public void the_user_navigates_to_the(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("searches for leave requests from {string} to {string}")
public void searches_for_leave_requests_from_to(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("selects the pending leave request for {string}")
public void selects_the_pending_leave_request_for(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks the approve button")
public void clicks_the_approve_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the leave status for {string} should be updated to {string}")
public void the_leave_status_for_should_be_updated_to(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user navigates to {string}")
public void the_user_navigates_to(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("clicks the {string} button")
public void clicks_the_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("updates the address to {string}")
public void updates_the_address_to(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the address should be updated to {string}")
public void the_address_should_be_updated_to(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("enters current password {string}")
public void enters_current_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("enters new password {string}")
public void enters_new_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("confirms new password {string}")
public void confirms_new_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the user should be redirected to the login page")
public void the_user_should_be_redirected_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
