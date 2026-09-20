package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utility.BaseClass;

public class DashboardPage extends BaseClass {

	public DashboardPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement txtDashboardPage;
	
	public String getDashboardPagetxt() {

		String textElement = getTextElement(txtDashboardPage);
		return textElement;
	}
	
	
}
