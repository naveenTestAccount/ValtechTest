package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Users\\niksa\\eclipse-workspace\\ValtechTest\\src\\main\\java\\com\\qa\\features", 
		glue = {"stepdefinitions" }, 
		format = { "pretty", "html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
		dryRun=true,
		monochrome = true,
		tags= {"@Smoke" })
				

public class TestRunner {

}


