package com.rest.test;

import org.json.JSONObject;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class JSONDTO {
	
	private JSONObject jsonObject;
	private Object document;
	
	public JSONDTO(JSONObject jsonObject) {
		super();
		this.jsonObject = jsonObject;
		document = Configuration.defaultConfiguration().addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL).jsonProvider().parse(jsonObject.toString());
	}
	
	public String getLastName() {
		String lastname = JsonPath.read(document, "$.lastName");
		return lastname;
	}

}
