package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		 System.out.println("##############################################");
	    System.out.println("Browser Launched");
	    
	}
	@When("User Enters the staging URL")
	public void user_enters_the_staging_url() {
		System.out.println("User has entered the staging URL");
	}
	@Then("Click Enter to Launch the Website")
	public void click_enter_to_launch_the_website() {
		System.out.println("User has clicked enter to launch the website");
	}
	@And("User Lands on the login page")
	public void user_lands_on_the_login_page() {
		System.out.println("User has landed on the login page");
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User Is on the Login Page");
	}
	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("User Enters the Username & Password");
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home Page is displayed");
	}	
	
	@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
	  System.out.println("User has entered the username :" +username +" & password :" +password);
	}
	
	@When("User enters the details")
	public void user_enters_the_details(List<String> data) {
	    System.out.println("User has entered the username: " +data.get(0) +" & password: " +data.get(1));
	}

	@When("^User entered the username (.+) and password (.+)$")
	public void user_entered_the_username_and_password(String username, String password) {
	  System.out.println("User has entered the username :" +username +" & password :" +password);	
	}
	
}

