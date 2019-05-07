package com.example.v1client.model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonTester {
   public static void main(String args[]){
   
     // ObjectMapper mapper = new ObjectMapper();
      //String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
      
      JacksonTester tester = new JacksonTester();
      try {
    	 ObjectMapper mapper = new ObjectMapper();
    	 String jsonString = "{\"name\":\"Mahesh Kumar\",  \"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
         JsonNode rootNode = mapper.readTree(jsonString);
         
         JsonNode nameNode = rootNode.path("name");
         System.out.println("Name: "+ nameNode.textValue());
         
         
    	 
    	 Map<String,Object> studentDataMap = new HashMap<String,Object>();
    	 int[] marks = {1,2,3};
    	 
    	  
         Student student = new Student();
         student.setAge(10);
         student.setName("Mahesh");
         tester.writeJSON(student);

         //java Object
         studentDataMap.put("student", student);
         //Java String
         studentDataMap.put("name", "Mahesh Kumar");
         //JAVA BOOLEAN
         studentDataMap.put("verified", Boolean.FALSE);
         //Array
         studentDataMap.put("marks", marks);
         
         mapper.writeValue(new File("student.json"), studentDataMap);
         studentDataMap = mapper.readValue(new File("student.json"), Map.class);

         System.out.println(studentDataMap.get("student"));
         System.out.println(studentDataMap.get("name"));
         System.out.println(studentDataMap.get("verified"));
         System.out.println(studentDataMap.get("marks"));
         
        // Student student1 = tester.readJSON();
        // System.out.println(student1);
         
         

      } catch (JsonParseException e) {
         e.printStackTrace();
      } catch (JsonMappingException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
      
      //map json to customer
      /*try{
         Student student = mapper.readValue(jsonString, Student.class);
         
         System.out.println(student);
         
         jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
         
         System.out.println(jsonString);
      }
      catch (JsonParseException e) { e.printStackTrace();}
      catch (JsonMappingException e) { e.printStackTrace(); }
      catch (IOException e) { e.printStackTrace(); }
      */
   }

  private void writeJSON(Student student) throws JsonGenerationException, JsonMappingException, IOException{
      ObjectMapper mapper = new ObjectMapper();	
      mapper.writeValue(new File("student.json"), student);
   }

   private Student readJSON() throws JsonParseException, JsonMappingException, IOException{
      ObjectMapper mapper = new ObjectMapper();
      Student student = mapper.readValue(new File("student.json"), Student.class);
      return student;
   }
}
   
class Student {
   private String name;
   private int age;
   public Student(){}
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public String toString(){
      return "Student [ name: "+name+", age: "+ age+ " ]";
   }
}
