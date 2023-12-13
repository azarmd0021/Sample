package com.app.stepdefition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FailedTest {
	@Given("Launch the URL")
	public void launch_the_URL() {
	    System.out.println("Launch");
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		System.out.println(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		System.out.println(pass);
		Assert.assertEquals(pass, "12344");
	}

	@When("Click the login button")
	public void click_the_login_button() {
	   System.out.println("login button");
	}

	@Then("Validate the HomePage")
	public void validate_the_HomePage() {
	   System.out.println("Home page");
	}


}
