package org.stepdefinition;

import org.pojo.Pom;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FaceBookpage extends BaseClass {
//	@Given("To launch the chrome")
//	public void to_launch_the_chrome() {
//	    launchChrome();
//	}
//
//	@Given("To maximize the window")
//	public void to_maximize_the_window() {
//	  maxWindow();
//	}

	@When("To launch the facebok url")
	public void to_launch_the_facebok_url() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To enter the email to email box")
	public void to_enter_the_email_to_email_box() {
		Pom p = new Pom();
	   fill(p.getUser(),"Rahul");
	}

	@When("To enter the password to password textbox")
	public void to_enter_the_password_to_password_textbox() {
		Pom p = new Pom();
		fill(p.getPass(),"Rahul@123");
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		Pom p = new Pom();
		click(p.getLgnBtn());
	}

//	@Then("Close the window")
//	public void close_the_window() {
//		close();
//	}

	

}
