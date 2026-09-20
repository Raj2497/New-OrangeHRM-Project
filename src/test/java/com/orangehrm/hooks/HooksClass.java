package com.orangehrm.hooks;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.orangehrm.utility.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

	Logger log = LogManager.getLogger(HooksClass.class);

	@Before
	public void launchingBrowser() throws FileNotFoundException, IOException {

		browserLaunch(getPropertyFileValue("browser"));
		log.info("Browser");
		enterApplicationUrl(getPropertyFileValue("url"));
		log.info("Browser");
		maximizeWindow();
		log.info("Window Maximize");
		implictlyWait();

	}

	@AfterStep
	public void afterEachStep(Scenario scenario) {

		scenario.attach(screenshot(), "images/png", "After Every Step");
		
	}

	@After
	public void afterScenario() {

		closeBrowser();
	}

}
