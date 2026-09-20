package com.orangehrm.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.orangehrm.report.Reporting;
import com.orangehrm.utility.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)

	@CucumberOptions(dryRun = false, 
	                 plugin = { "pretty","json:target/output.json" }, 
	                 features = "src/test/resources", 
	                 glue = { "com.orangehrm.stepdefinition","com.orangehrm.hooks" })

	public class TestRunner extends BaseClass {
		
		@AfterClass
		public static void afterClass() {
			
			Reporting.generateJvmReport(getProjectPath() + "//target//output.json");
		}

	}


