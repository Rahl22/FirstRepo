package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Pom extends BaseClass{	
	public Pom(){
	
		PageFactory.initElements(driver, this);
	}

@FindBy (id="email")
private WebElement user;

@FindBy (id="pass")
private WebElement pass;

@FindBy(name="login")
private WebElement lgnBtn;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLgnBtn() {
	return lgnBtn;
}

}
