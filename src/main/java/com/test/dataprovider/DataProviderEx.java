package com.test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

	@DataProvider(name="credentialsDP")
	public Object[][] getCredentials(){
		Object[][] loginDetails = new Object[][] {
			{"u1","p1"},
			{"u2","p2"}
			};
		
		return loginDetails;
		
	}
	
	
	@Test(dataProvider="credentialsDP")
	public void testCredentioals(String userName, String password) {
		System.out.println(userName+" and "+password);
	}
}
