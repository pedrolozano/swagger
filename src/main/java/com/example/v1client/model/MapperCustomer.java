package com.example.v1client.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperCustomer {
	  public MapperCustomer(String input) {
		// TODO Auto-generated constructor stub
	}

	public String MapperCustomer(String input){
		   
	      ObjectMapper mapper = new ObjectMapper();
	     // String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
	      String jsonString = "{\"customerId\":\"00021244\", \"originChannel\":\"BANCA SERFIN\",\"fullName\":\"ACEVES GONZALEZ ADOLFO\", \"condition\":\"CLIENTE\", \"segment\": \"PREMIER\" , \"address\":\"LOMA BONITA 1839\", \"customerCategory\":\"FISICA\"}"; 
	      //map json to student
	      try{
	        CustomerDetail customer = mapper.readValue(jsonString, CustomerDetail.class);
	        JsonNode rootNode = mapper.readTree(jsonString); 
	        
	        JsonNode customerIdNode = rootNode.path("customerId");
	         System.out.println("customerId: "+ customerIdNode.textValue());
	    	if (customerIdNode.textValue().equals(input))
	    		{
	    		System.out.println("customer:"+customer.toString());
	    		return customer.toString();
	    		}
	    	//Student student = mapper.readValue(jsonString, Student.class);
	         
	         //System.out.println(customer);
	         
	         jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);
	         
	        // System.out.println(jsonString);
	      }
	      catch (JsonParseException e) { e.printStackTrace();}
	      catch (JsonMappingException e) { e.printStackTrace(); }
	      catch (IOException e) { e.printStackTrace(); }
		return jsonString;
	   }
}
