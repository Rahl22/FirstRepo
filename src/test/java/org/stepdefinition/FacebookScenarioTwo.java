package org.stepdefinition;

import org.pojo.Pom;
import org.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookScenarioTwo extends BaseClass {
	
//	@Given("Lauch the chrome browser")
//	public void lauch_the_chrome_browser() {
//	    launchChrome();
//	}

//	@Given("Maximize the browser")
//	public void maximize_the_browser() {
//	   maxWindow();
//	}

	@When("launch the fb URL")
	public void launch_the_fb_URL() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("Enter the positive or negative email {string} in textbox")
	public void enter_the_positive_or_negative_email_in_textbox(String email) {
	    Pom p = new Pom();
	    fill(p.getUser(),email );
	}

	@When("Enter the posittive or negative pass {string} in textbox")
	public void enter_the_posittive_or_negative_pass_in_textbox(String pass) {
	    Pom p = new Pom();
	    fill(p.getPass(),pass);
	}
	@When("click lgn btn")
	public void click_lgn_btn() {
		Pom p = new Pom();
		click(p.getLgnBtn());
	}

//	@Then("close the browser")
//	public void close_the_browser() {
//	    close();
//	}

}
