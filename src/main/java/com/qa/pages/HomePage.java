package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	// Page Factory - OR:

	@FindBy(xpath = "//title[contains(text(),'Where Experiences are Engineered - Valtech')]")
	WebElement homePageTitle;

	@FindBy(xpath = "//h2[contains(text(),'Latest news')]")
	WebElement searchLatestNewsText;

	@FindBy(xpath = "//span[contains(text(),'Contact us!')]")
	WebElement searchContactUsText;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public void searchLatestNews()

	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement searchLatestNewsText = driver.findElement(By.xpath("//h2[contains(text(),'Latest news')]"));
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("arguments[0].scrollIntoView(true);", searchLatestNewsText);

	}

	public boolean verifyLatestNewsText()

	{

		Assert.assertTrue("Latest News is Displayed",
				driver.findElement(By.xpath("//h2[contains(text(),'Latest news')]")).isDisplayed());
		return true;

	}

	public void searchContactUs()

	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement searchContactUsText = driver.findElement(By.xpath("//span[contains(text(),'Contact us!')]"));
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("arguments[0].scrollIntoView(true);", searchContactUsText);
		Assert.assertTrue("Contact us is Displayed",
				driver.findElement(By.xpath("//span[contains(text(),'Contact us!')]")).isDisplayed());
	}

	public void verifyContactBranches() {

		String findBranches = driver.findElement(By.xpath(".//div[@class='footer-content foot']/p[2]")).getText();
		System.out.println("Cities : " + findBranches);
		System.out.println("Total strings:" + findBranches.length());
		Assert.assertTrue("Fail for content", findBranches.contains("You'll find us in:"));
	}

}