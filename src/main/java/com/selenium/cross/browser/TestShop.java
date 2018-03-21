package com.selenium.cross.browser;

import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestShop {

	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void testGetBrowser(String browser) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/vrepaka/Downloads/drivers/geckodriver");
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
			driver = new ChromeDriver();
		}
	}
	
	@Test(enabled=true)
	public void testCrossBrowser() throws InterruptedException {
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("fidget spinner");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.cssSelector("#tvcap > div > div > div > div > h3 > a > span")).getText().contains("fidget spinner"));
		driver.quit();
		
	}


}
