package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static WebElement element;
	

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"\\Users\\niksa\\eclipse-workspace\\ValtechTest\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void Initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}
	
	public void getPageHeader(){
		element = driver.findElement(By.xpath("//header[@class='page-header']/h1"));
		if(!element.isDisplayed()){
			element = driver.findElement(By.xpath("//div[@class='page-header']/h1"));
		}
		System.out.println(element.getText());	
	}
    
    public void pageHeaderVerify(String header){
    	element = driver.findElement(By.xpath("//header[@class='page-header']/h1"));//header[@class='page-header']/h1
    	if(!element.isDisplayed()){
			element = driver.findElement(By.xpath("//div[@class='page-header']/h1"));//div[@class='page-header']/h1
		}
    	Assert.assertEquals(element.getText().contentEquals(header), "Fail with page header content");
    }

		
	public static void close() {
		driver.quit();
	}

}
