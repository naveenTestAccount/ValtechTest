package com.qa.stepdefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {

	HomePage homePage = new HomePage();

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {

		TestBase.Initialization();
	}

	@Given("^user validates homepage title$")
	public void user_validates_homepage_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String homePageTitle = homePage.validateHomePageTitle();
		Assert.assertEquals("Where Experiences are Engineered - Valtech", homePageTitle);

	}

	@Given("^user search for latest news section on homepage$")
	public void user_search_for_latest_news_section_on_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.searchLatestNews();

	}

	@Then("^user able to see latest news successfully$")
	public void user_able_to_see_latest_news_successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.verifyLatestNewsText();
	}

	@Given("^user scroll to contact us$")
	public void user_scroll_to_contact_us() throws Throwable {

		homePage.searchContactUs();
	}

	@Given("^user verify branches details$")
	public void user_verify_branches_details() throws Throwable {

		homePage.verifyContactBranches();

	}

	@Given("^user close the browser$")
	public void close_the_browser() throws Throwable {

		TestBase.close();
	}

}
