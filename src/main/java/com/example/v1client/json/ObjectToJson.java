package com.example.v1client.json;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import com.example.v1client.model.*;



public class ObjectToJson {
	  public static void main(String[] args) throws IOException {
		  String jsonString = "{\"customers\":[{\"customerId\":\"1\", \"originChannel\":\"o\",\"fullName\":\"Pedro Lozano\", \"condition\":\"CLIENTE\", \"segment\": \"PREMIER\" , \"address\":\"LOMA BONITA 1839\", \"customerCategory\":\"FISICA\"}]}"; 
		  System.out.println(jsonString);  
			String string = "customerId,originChannel, fullname, condition, segment, address, customerCategory \n" +
					  "00021244, BANCA SERFIN, ACEVES GONZALEZ ADOLFO,CLIENTE, PREMIER, LOMA BONITA 1839, FISICA \n" +
					  "00021246, BANCA SERFIN, LOZANO CASTILLO, CLIENTE, PREMIER, AV DE LOS TANQUES, FISICA";
					 
	      GsonBuilder builder = new GsonBuilder(); 
	      builder.setPrettyPrinting(); 
	      
	      Gson gson = builder.create(); 
	      JsonObject inputCustomer = gson.fromJson(jsonString, JsonObject.class); 
	      JsonObject newObject = new JsonObject() ;
	      newObject.addProperty("customerId", "00021244");
	      newObject.addProperty("originChannel", "BANCA SERFIN");
	      newObject.addProperty("fullName", "RAMIREZ CHAVEZ ADOLFO");
	      newObject.addProperty("condition", "CLIENTE");
	      newObject.addProperty("segment", "PREMIER");
	      newObject.addProperty("address", "LOMAS ALTAS 1639");
	      newObject.addProperty("customerCategory","FISICA");
	      
	            
	      inputCustomer.get("customers").getAsJsonArray().add(newObject);
	      JsonObject newObject2 = new JsonObject() ;
	      newObject2.addProperty("customerId", "00021246");
	      newObject2.addProperty("originChannel", "BANCA SERFIN");
	      newObject2.addProperty("fullName", "ACEVES GONZALEZ ADOLFO");
	      newObject2.addProperty("condition", "CLIENTE");
	      newObject2.addProperty("segment", "PREMIER");
	      newObject2.addProperty("address", "LOMA BONITA 1839");
	      newObject2.addProperty("customerCategory","FISICA");
	      inputCustomer.get("customers").getAsJsonArray().add(newObject2);
	      System.out.println("----inputCustomer----"); 
	      System.out.println(inputCustomer); 
	      
	      
	      
	      //System.out.println(inputCustomer.get("customerId").getAsJsonArray());
	      jsonString = gson.toJson(inputCustomer); 
	      System.out.println(jsonString);  
	     // String result = inputCustomer.get("customers").getAsString();
	      System.out.println(inputCustomer.get("customers").getAsJsonArray());
	  
	      
	      
	      //gson.getJSONArray("content").getJSONObject(0).getString("article");
	  }
}
