package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class ServicesPage extends TestBase{
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@FindBy(xpath = "//title[contains(text(),'Where Experiences are Engineered - Valtech')]")
	WebElement servicesPageTitle;
	
	public ServicesPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateServicesPageTitle() {
		return driver.getTitle();
	}
	
	public void launchServicesPage() {
		driver.get("https://www.valtech.com/services/");
	}
	
	public void checkServicesPageHeader() {
		WebElement	servicesPageHeaderElement = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
			System.out.println(servicesPageHeaderElement.getText());
		}
			
		public void checkServicesPageHeaderText() {
			WebElement servicesPageHeaderElementText = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
			wait.until(ExpectedConditions.visibilityOf(servicesPageHeaderElementText));
		Assert.assertEquals("Services",servicesPageHeaderElementText.getText() );
		}
	
}
