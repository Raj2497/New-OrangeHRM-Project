package com.orangehrm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import com.orangehrm.utility.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {

	public static void generateJvmReport(String jsonFile) {

		//Configuration configuration = new Configuration(new Fil(getProjectPath() + "//target"),"Orange HRM page Automation");
		
		File file = new File(getProjectPath()+"//target");
		
		Configuration configuration = new Configuration(file,"Orange HRM page Automation");
		
		configuration.addClassifications("Browser" , "CHROME");
		configuration.addClassifications("Browser Version" , "123");
		configuration.addClassifications("Author" , "Raj");


		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
