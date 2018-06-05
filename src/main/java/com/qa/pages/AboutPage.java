package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class AboutPage extends TestBase{
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@FindBy(xpath = "//title[contains(text(),'Where Experiences are Engineered - Valtech')]")
	WebElement aboutPageTitle;

	
	public AboutPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateAboutPageTitle() {
		return driver.getTitle();
	}
	
	public void launchAboutPage() {
		driver.get("https://www.valtech.com/about/");
	}

	public void checkAboutPageHeader() {
	WebElement	aboutPageHeaderElement = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
		System.out.println(aboutPageHeaderElement.getText());
	}
		
	public void checkAboutPageHeaderText() {
		WebElement aboutPageHeaderElementText = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
		wait.until(ExpectedConditions.visibilityOf(aboutPageHeaderElementText));
	Assert.assertEquals("About",aboutPageHeaderElementText.getText() );
	}
	
}
