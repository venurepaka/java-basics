package com.parse.json;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonToObject {

	public static void main(String[] args) {
		JsonToObject obj = new JsonToObject();
		obj.run();
		//obj.run1();
	}
	
	private void run1() {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("staff.json");

		ObjectNode jsonTree = (ObjectNode) mapper.readTree(inputStream);
		ObjectNode nameNode = jsonTree.put("name", "venu123");

		String writeValueAsString = mapper.writeValueAsString(jsonTree);
		System.out.println(writeValueAsString); 
		}catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			Staff staff = mapper.readValue(new File("src/main/resources/staff.json"), Staff.class);
			System.out.println(staff.getName());
			System.out.println(staff.getSkills().get(0));

			// Convert JSON string to Object
			String jsonInString = "{\"name\":\"venu\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";
			Staff staff1 = mapper.readValue(jsonInString, Staff.class);
			System.out.println(staff1);

			//Pretty print
			String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff1);
			System.out.println(prettyStaff1);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
