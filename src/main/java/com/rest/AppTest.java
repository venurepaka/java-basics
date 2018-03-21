package com.rest;

import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

import com.rest.util.AppConfig;

@SpringBootApplication
public class AppTest {

	public static void main(String[] args) throws IOException {
		//new AppTest().testAppConfig();
		
		if(args.length == 1) {
			System.out.println("welcome");
		}else {
			System.out.println("too many args");
		}
		//SpringApplication.run(AppTest.class, args);
	}
	
	public void testAppConfig() throws IOException {
		AppConfig appConfig = AppConfig.getInstance();
		Properties prop = appConfig.loadProperties();
		System.out.println(prop.getProperty("current_year"));
		
	}
	
	
	
}
