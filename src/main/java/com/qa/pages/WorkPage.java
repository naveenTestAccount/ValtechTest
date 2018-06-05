package com.qa.pages;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.TestBase;

public class WorkPage extends TestBase{
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@FindBy(xpath = "//title[contains(text(),'Where Experiences are Engineered - Valtech')]")
	WebElement workPageTitle;
	
	public WorkPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateWorkPageTitle() {
		return driver.getTitle();
	}
	
	public void launchWorkPage() {
		driver.get("https://www.valtech.com/work/");
	}
	
	public void checkWorkPageHeader() {
		WebElement	workPageHeaderElement = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
			System.out.println(workPageHeaderElement.getText());
		}
			
		public void checkWorkPageHeaderText() {
			
//		String sampleText = driver.findElement(By.xpath("//div[@class='page-header']/h1")).getText();
//		System.out.println(sampleText);
//		//wait.until(ExpectedConditions.visibilityOf(sampleText));
//		Assert.assertEquals("Work",sampleText );
			
			WebElement workPageHeaderElementText = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
			wait.until(ExpectedConditions.visibilityOf(workPageHeaderElementText));
		Assert.assertEquals("Services",workPageHeaderElementText.getText() );
		}
}
