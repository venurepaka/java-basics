package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ComboBoxEx {

	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/vrepaka/Downloads/drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testComboBox() throws InterruptedException {
		//driver.get("https://www.homedepot.com/p/BEHR-Premium-Plus-5-gal-White-Flat-Ceiling-Interior-Paint-55805/100192072");
		
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//2 start
//		WebElement webElementDropDown = driver.findElement(By.xpath("//*[@id=\"productinfo_ctn\"]/div[2]/div[2]/div[2]/div[4]/div/div[1]/a"));
//		
//		webElementDropDown.click();
//		List<WebElement> dropDownElements = driver.findElements(By.xpath("//*[@id=\"productinfo_ctn\"]/div[2]/div[2]/div[2]/div[4]/div/div[1]/div[2]//li"));
//		
//		System.out.println("size = "+dropDownElements.size());
//		for(int i=1; i<=dropDownElements.size(); i++) {
//			WebElement element = driver.findElement(By.xpath("//*[@id=\"labellistOption1\"]/li["+i+"]/span/a"));
//			System.out.println("*** = "+element.getText());
//		}
		//2 end
		
		
		
		//1 start
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"productinfo_ctn\"]/div[2]/div[2]/div[2]/div[4]/h2"));
//		boolean b = element.isDisplayed();
//		System.out.println(element.getText()+" displayed = true");
		//1 end
		
		//3 start
//		driver.get("https://www.homedepot.com/b/Paint-Paint-Colors/N-5yc1vZcaw8/Ntk-all/Ntt-paint?NCNI-5&browsestoreoption=2");
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"inStoreAndStoreDetails\"]/div/ul[1]/li/a/div"));
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		element.click();
		//3 end
		
		//4 start
//		driver.get("https://www.homedepot.com/b/Paint-Paint-Colors/N-5yc1vZcaw8/Ntk-all/Ntt-paint?NCNI-5&browsestoreoption=2");
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[1]/div/div[3]/div[1]/a"));
//		element.click();
		//4 end
		
		//5 start
		driver.get("http://demo.guru99.com/test/guru99home/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame("a077aa5e"); 

		System.out.println("********We are switch to the iframe*******");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.findElement(By.xpath("html/body/a/img")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		System.out.println("text on sub frame = "+driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/div[1]/h1")).getText());
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.switchTo().defaultContent();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		System.out.println("switched back main frame = "+driver.findElement(By.xpath("//*[@id=\"rt-mainbody\"]/div/article/h3[1]")).getText());
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
		//5 end
		
		driver.quit();
		
		
	}
	
}
