package com.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	WebDriver driver;
	HomePg1 homePage;
	
	@BeforeTest
	public void beforeTest() {
//		System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/vrepaka/Downloads/drivers/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void signIn() {
		homePage = new HomePg1(driver);
		homePage.login("test@gmail.com", "password");
//		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		
		assertEquals("Authentication failed.", driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText());
		
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
