package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePg1 {
	WebDriver driver;

	@FindBy(xpath ="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signInLink;
	
	@FindBy(xpath ="//*[@id=\"email\"]")
	WebElement userName;
	
	@FindBy(xpath ="//*[@id=\"passwd\"]")
	WebElement password;
	
//	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
//	WebElement submitBtn;
	
	
	
	public HomePg1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String pwd){
		signInLink.click();
		userName.sendKeys(email);
		password.sendKeys(pwd);
		//submitBtn.submit();
		
	}
	
}
