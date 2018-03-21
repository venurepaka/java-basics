package com.selenium;


import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class TestPage {

	@Test(enabled=true)
	public void testShop() throws InterruptedException {
		System.out.println("home page");
		//String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lst-ib")).sendKeys("fidget spinner");
		
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String searchTitle = driver.findElement(By.cssSelector("#tvcap > div > div > div > div > h3 > a > span")).getText();
		
		
		
//		WebElement searchTitleWithRetry = (new WebDriverWait(driver, 120))
//		  .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#tvcap > div > div > div > div > h3 > a > span1")));
//		
	
		
		
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//			    .withTimeout(120, TimeUnit.SECONDS)
//			    .pollingEvery(5, TimeUnit.SECONDS)
//			    .ignoring(NoSuchElementException.class);
//
//		WebElement searchTitleWithRetry = wait1.until(new Function<WebDriver, WebElement>() { 
//			 
//            public WebElement apply(WebDriver driver) { 
//                return driver.findElement(By.cssSelector("#tvcap > div > div > div > div > h3 > a > span1")); 
//            } 
//        }); 

		assertTrue(searchTitle.contains("fidget spinner"));
		System.out.println("searchTitle = "+searchTitle);
		
		driver.quit();
	}
	
	@Test(enabled=false)
	public void testShoppingPage_firefox() throws InterruptedException {
		
		System.out.println("home page");
		System.setProperty("webdriver.gecko.driver", "/Users/vrepaka/Downloads/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lst-ib")).sendKeys("fidget spinner");
		
		
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		
		
		assertTrue(driver.findElement(By.cssSelector("#tvcap > div > div > div > div > h3 > a > span")).getText().contains("fidget spinner"));
		
		
		
		
	//	driver.close();
		driver.quit();
		
		
		
		
	}
}
