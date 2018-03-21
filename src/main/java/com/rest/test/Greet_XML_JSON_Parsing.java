package com.rest.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.path.xml.XmlPath;
import com.jayway.restassured.specification.ResponseSpecification;

public class Greet_XML_JSON_Parsing {

	@Test
	public void get() throws JSONException {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("WM_SVC.VERSION", "0.0.1");
		headers.put("WM_SVC.NAME", "item-setup-query-service-app");
		headers.put("WM_QOS.CORRELATION_ID", "546a5b97-dd86-4273-9008-e111455b4504");
		headers.put("WM_SVC.ENV", "stg");
		headers.put("WM_CONSUMER.ID", "9ce3f2a8-e087-46bf-8c73-54a72d99c165");
		headers.put("external", "true");
		//headers.put("Accept", "application/json");
		
		
		JsonPath jsonPath = RestAssured.given()
		.when()
			.headers(headers)
			.get("http://itemsetupquerysvc.stg.nxgensearch.catdev.qa.walmart.com/item-setup-query-service-app/services/master-item/v4/search?query=gtin:04979786864891&responseGroup=SUPPLYITEM")
		.then()
			.statusCode(206).extract().jsonPath();
		
		JSONObject jsonObject = new JSONObject(jsonPath.prettify());
		System.out.println(jsonObject.getString("status"));
		
	}
	
	@Test
	public void get_solr_json() throws JSONException {
		
		
		JsonPath jsonPath = RestAssured.given().log().all()
		.when()
			.get("http://10.247.211.145:7983/solr/flat_product_index_stg/select?indent=on&q=product_id:685032999720930060&wt=json")
		
		.then()
			.statusCode(200).extract().jsonPath();
		
		JSONObject jsonObject = new JSONObject(jsonPath.prettify());
		System.out.println(jsonObject.get("response"));
		JSONObject obj = (JSONObject)jsonObject.get("response");
		
		ProductJson pJson = new ProductJson(obj);
		System.out.println("product_id = "+pJson.getProductId());
		
	}
	
	@Test
	public void get_json_from_the_file() throws IOException, JSONException {
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/testData.json"));
		StringBuilder sb = new StringBuilder();
		String line;
		while( (line = br.readLine()) != null) {
			sb.append(line);
			sb.append("\n");
		}
		JSONObject jsonObject = new JSONObject(sb.toString());
		System.out.println(jsonObject.get("lastName"));
		
		JSONDTO jsonDTO = new JSONDTO(jsonObject);
		
		System.out.println(jsonDTO.getLastName());
		
		br.close();
	}
	
	@Test
	public void get_xml_from_the_file() throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
		File xmlFile = new File("src/main/resources/testData.xml");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true); 
		DocumentBuilder builder = domFactory.newDocumentBuilder();
		Document doc = builder.parse(xmlFile);
		XPath xpath = XPathFactory.newInstance().newXPath();
		XPathExpression expr = xpath.compile("//staff[2]");
		System.out.println(expr.evaluate(doc));
		
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
	    NodeList nodes = (NodeList) result;
	    for (int i = 0; i < nodes.getLength(); i++) {
	     System.out.println(nodes.item(i).getNodeValue()); 
	    }
		
	}
	
	@Test
	public void get_solr_xml() {
		
		
		XmlPath xmlPath = RestAssured.given()
		.when()
		.get("http://10.247.211.145:7983/solr/flat_product_index_stg/select?indent=on&q=product_id:685032999720930060&wt=xml")
		
		.then()
		.statusCode(200).extract().xmlPath();
		
		
		//ProductXML prodXML = new ProductXML(xmlPath.prettify());
		System.out.println(xmlPath.get("response")+"");
		
		
//		String prodId = xmlPath.getString("response.result.doc[0].product_id");
//		System.out.println(prodId);
		
		
		
	}
	
	@Test
	public void post() {
		String payload = "[JSTMCHA-5LBS,YsP8uRczIWGu6Zev6RFk]";
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("WM_SVC.VERSION", "0.0.1");
		headers.put("WM_SVC.NAME", "item-setup-query-service-app");
		headers.put("WM_QOS.CORRELATION_ID", "546a5b97-dd86-4273-9008-e111455b4504");
		headers.put("WM_SVC.ENV", "stg");
		headers.put("WM_CONSUMER.ID", "9ce3f2a8-e087-46bf-8c73-54a72d99c165");
		headers.put("external", "true");
		headers.put("Content-Type", "application/json");
		
		
		RestAssured.given()
		.when()
			.headers(headers)
			.body(payload).log().all()
			.post("http://itemsetupquerysvc.stg.nxgensearch.catdev.qa.walmart.com/item-setup-query-service-app/services/master-item/v3?identifierType=SELLER_OFFER&partnerId=10000000354&fields=ALL")
		
		.then()
			.statusCode(200);
	}
	
	
}
