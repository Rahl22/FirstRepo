package org.stepdefinition;

import org.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before
	public void PreCondtitions() {
		launchChrome();
		maxWindow();
		
	}
	
	@After	
	public void postConditions() throws InterruptedException {
		Thread.sleep(3000);
		close();
	}
}
