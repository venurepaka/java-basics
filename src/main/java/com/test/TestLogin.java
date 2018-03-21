package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

	private static WebDriver driver;

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() throws Exception {

		// The number of times data is repeated, test will be executed the same no. of
		// times

		// Here it will execute two times

		// return new Object[][] { { "iPhone", "Android" },{ "java", ".NET" }};

		Object[][] testObjArray = ExcelUtils.getTableArray("src/main/resources/Workbook1.xlsx", "Sheet1");

		return testObjArray;

	}

	@Test(enabled = true, dataProvider = "Authentication", description = "http://toolsqa.com/selenium-webdriver/testng-data-provider-excel/")
	public void test(String search1, String search2) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		Thread.sleep(2000);

		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys(search1);
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		// assertTrue(driver.findElement(By.cssSelector("#vs0p1c0")).getText().contains(search1));
		assertNotNull(driver.getTitle().toString());
		System.out.println("title = " + driver.getTitle().toString());

		driver.quit();
		Thread.sleep(2000);

		/**
		 * search2
		 */
//		System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
//		driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("lst-ib")).clear();
//		driver.findElement(By.id("lst-ib")).sendKeys(search2);
//		driver.findElement(By.name("btnK")).submit();
//		Thread.sleep(2000);
//		// assertTrue(driver.findElement(By.cssSelector("#vs0p1c0")).getText().contains(search2));
//		assertNotNull(driver.getTitle().toString());
//		System.out.println("title = " + driver.getTitle().toString());
//
//		driver.quit();

	}
}
