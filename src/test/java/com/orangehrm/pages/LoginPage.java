package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utility.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUserName;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[contains(text(),'')]")
	private WebElement btnLogin;

	public void login(String username, String password) {

		sendKeysElement(txtUserName, username);
		sendKeysElement(txtPassword, password);
		clickElement(btnLogin);
	}
}
