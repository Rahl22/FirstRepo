package org.stepdefinition;

import org.pojo.Amazon;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLogin extends BaseClass{
	Amazon a;

//	@Given("To launch the browser and maximize the browser")
//	public void to_launch_the_browser_and_maximize_the_browser() {
//	   launchChrome();
//	   maxWindow();
//	}

	@When("Launch the Amazon URL")
	public void launch_the_Amazon_URL() {
	    driver.get("https://www.amazon.in/");
	}

	@When("Hover the mouse to sign button")
	public void hover_the_mouse_to_sign_button() {
		a = new Amazon();
		move_cursor(a.getMovecursor());
	}

	@When("To click on signIn button")
	public void to_click_on_signIn_button() {
		a = new Amazon();
		click(a.getSigninBtn());
	}

	@When("Put the registered email\\/Phoneno to the usertext box")
	public void put_the_registered_email_Phoneno_to_the_usertext_box() {
		a = new Amazon();
		fill(a.getUserTxt(),"+919513557140");
	}

	@When("Click the continue button")
	public void click_the_continue_button() {
		a = new Amazon();
		click(a.getContinueBtn());
	}

	@When("Insert the password to passwordtext box")
	public void insert_the_password_to_passwordtext_box() {
		a = new Amazon();
		fill(a.getUserPass(),"Rahul@123");
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		a = new Amazon();
		click(a.getSignInBtn());
	}

//	@Then("To close the browser")
//	public void to_close_the_browser() {
//	   close();
//	}
}
