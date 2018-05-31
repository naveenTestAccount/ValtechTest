package com.qa.stepdefinitions;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import org.junit.Assert;

public class HomePageSteps extends TestBase{
	
	HomePage homepage = new HomePage();
	
	 
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	    
	   TestBase.Initialization();
	}

	@Given("^user validates homepage title$")
	public void user_validates_homepage_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals("Where Experiences are Engineered - Valtech", title);
		
	}
	
	@Given("^user search for latest news section on homepage$")
	public void user_search_for_latest_news_section_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		homepage.searchLatestNewsText();
	}
	
	
	@Given("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
		TestBase.close();
	}



}
