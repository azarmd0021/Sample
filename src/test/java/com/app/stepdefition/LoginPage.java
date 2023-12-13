package com.app.stepdefition;

import com.app.pageexe.LoginPage_Exe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage extends LoginPage_Exe {
	@Given("Launch the URL")
	public void launch_the_url() {
	  browserlaunch();
	  driver.get("https://adactinhotelapp.com/");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		username(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
	 password(pass);
	}

	@When("Click the login button")
	public void click_the_login_button() {
	  login_button();
	}

	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	  System.out.println("HomePage");
	}

	// scenario outline 
	@When("Enter the user {string}")
	public void enter_the_user(String data) {
		username(data);
	}
	@When("Enter the pass {string}")
	public void enter_the_pass(String data) {
		password(data);
	}
	

}
