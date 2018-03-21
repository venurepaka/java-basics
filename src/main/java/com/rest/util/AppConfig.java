package com.rest.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {

	private static AppConfig APP_CONFIG_INSTANCE = null;
	private Properties prop = null;
	public static AppConfig getInstance() {
		if(APP_CONFIG_INSTANCE == null) {
			APP_CONFIG_INSTANCE = new AppConfig();
		}
		return APP_CONFIG_INSTANCE;
		
	}
	
	private AppConfig() {
		
	}
	
	public Properties loadProperties() throws IOException {
		prop = new Properties();
		BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/properties.txt"));
		prop.load(reader);
		return prop;
	}
	
	
}
