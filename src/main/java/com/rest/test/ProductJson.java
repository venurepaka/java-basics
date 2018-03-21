package com.rest.test;

import org.json.JSONObject;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ProductJson {
	private Object document;
	private JSONObject jsonObject;
	
	public ProductJson(JSONObject json) {
		jsonObject = json ; 
		setDocument();
		
	}
	
	private void setDocument() {
		String jsonString = jsonObject.toString();
		//document = Configuration.defaultConfiguration().jsonProvider().parse(jsonString);
		document = Configuration.defaultConfiguration().addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL).jsonProvider().parse(jsonString);
	}
	
	public String getProductId() {
		return JsonPath.read(document, "$.docs[0].product_id");
//		return this.getValue("$.docs[0].product_id");
	}
	
}
