package com.orangehrm.pagemanager;


import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;

public class PageObjectManager {

	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	
	
	public LoginPage getLoginPage() {
		
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}
	public DashboardPage getDashboardPage() {
		
		return (dashboardPage == null) ? dashboardPage = new DashboardPage() : dashboardPage;
	}
	
	
	
	
}
