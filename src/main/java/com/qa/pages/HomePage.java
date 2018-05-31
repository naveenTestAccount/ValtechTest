package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.pages.PageHeader;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	// Page Factory - OR:

	@FindBy(xpath = "//title[contains(text(),'Where Experiences are Engineered - Valtech')]")
	WebElement title;

	@FindBy(xpath = "//h2[contains(text(),'Latest ') and contains(text(),'news')]")
	WebElement textLatestNews;

	@FindBy(xpath = "//span[contains(text(),'Contact ') and contains(text(),'us!')]")
	WebElement textContactUs;

	@FindBy(xpath = ".//div[@class='footer-content foot']/p[2]")
	WebElement findBranches;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public void searchLatestNewsText()

	{
		WebElement searchWord = textLatestNews;
		Assert.assertEquals("Latest news", searchWord);

	}

	public void searchContactUs()

	{
		WebElement searchWord = textContactUs;
		Assert.assertEquals("Contact us!", searchWord);

	}

}
