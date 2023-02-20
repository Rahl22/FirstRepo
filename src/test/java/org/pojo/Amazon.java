package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Amazon extends BaseClass{
	public Amazon() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="(//span[text()='Sign in'])[2]")    //(//a[@data-nav-role='signin'])[2]//span")
private WebElement signinBtn;

@FindBy (id="ap_email")
private WebElement userTxt;

@FindBy (id="continue")
private WebElement continueBtn;

@FindBy (id="ap_password")
private WebElement userPass;

@FindBy (id="signInSubmit")
private WebElement signInBtn;

@FindBy(xpath="//a[@data-nav-ref='nav_ya_signin']")
private WebElement movecursor;

public WebElement getSigninBtn() {
	return signinBtn;
}

public WebElement getUserTxt() {
	return userTxt;
}

public WebElement getContinueBtn() {
	return continueBtn;
}

public WebElement getUserPass() {
	return userPass;
}

public WebElement getSignInBtn() {
	return signInBtn;
}

public WebElement getMovecursor() {
	return movecursor;
}



}
