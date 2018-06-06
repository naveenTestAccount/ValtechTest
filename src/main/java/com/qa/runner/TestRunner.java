package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\naveen.kumar\\git\\ValtechTest\\src\\main\\java\\com\\qa\\features", 
		glue = {"com.qa.stepdefinitions" }, 
		format = { "pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
		dryRun=false,
		monochrome = true)
		
				

public class TestRunner {

}


