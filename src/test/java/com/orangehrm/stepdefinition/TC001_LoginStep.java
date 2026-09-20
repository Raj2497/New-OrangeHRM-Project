package com.orangehrm.stepdefinition;


import com.orangehrm.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStep {
	
	PageObjectManager pageObjectManager = new PageObjectManager();
	
	@Given("User on the orange hrm login page")
	public void user_on_the_orange_hrm_login_page() {
	    
	}

	@When("User enters {string} , {string}")
	public void user_enters(String username, String password) {
		
		pageObjectManager.getLoginPage().login(username, password);
	}

	@Then("User should verify success messgae after login {string}")
	public void user_should_verify_success_messgae_after_login(String expected) {
	    
		String actual = pageObjectManager.getDashboardPage().getDashboardPagetxt();
		org.junit.Assert.assertEquals("Verify Login", expected , actual);
		
		
	}


}
