package com.qa.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.pages.AboutPage;
import com.qa.pages.ServicesPage;
import com.qa.pages.WorkPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 


 public class PageHeaderSteps extends TestBase {
	

	WorkPage workPage = new WorkPage();
	AboutPage aboutPage = new AboutPage();
	ServicesPage servicesPage = new ServicesPage();
	
	
	@Given("^user go to (.*) page$")
	public void user_go_to_About_page(String pagetype) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if (pagetype.equals("About")) {
			workPage.launchWorkPage();
		}
		else if (pagetype.equals("Work")) {
			servicesPage.launchServicesPage();
		}
			else if (pagetype.equals("Services")) {
				aboutPage.launchAboutPage();
			}
				else System.out.println("No Page matched");
	}

//	@When("^user search for page header text$")
//	public void user_search_for_page_header_text(String content) throws Throwable {
////		if (content.equals("About")) {
////			workPage.checkWorkPageHeaderText();
////		}
////		else if (content.equals("Work")) {
////			servicesPage.checkServicesPageHeader();
////		}
////			else if (content.equals("Services")) {
////				aboutPage.checkAboutPageHeaderText();
////			}
////				else System.out.println("No Page Header matched");
//		getPageHeader();
//	}
	@When("^user search for page header text$")
	public void user_search_for_page_header_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		getPageHeader();
	}

	@Then("^user verifies page header (.*) in the page$")
	public void user_verifies_page_header_About_in_the_page(String headercontent) throws Throwable {
		if (headercontent.equals("About")) {
			workPage.checkWorkPageHeader();
		}
		else if (headercontent.equals("Work")) {
			servicesPage.checkServicesPageHeader();
		}
			else if (headercontent.equals("Services")) {
				aboutPage.checkAboutPageHeader();
			}
				else System.out.println("No Page Header Content");
		//pageHeaderVerify(headercontent);
	}

	}





