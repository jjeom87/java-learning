package org.sunj.tutorials.jackson.examples;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringToJsonExample {
  
  ObjectMapper mapper = new ObjectMapper();
  
  public static void main(String[] args) {
    StringToJsonExample obj = new StringToJsonExample();
    obj.run();
  }

  public void run() {
    Map<String, Object> map = new HashMap<>();
    map.put("name", "John");
    
    String str1 = null;
    try {
      str1 = mapper.writeValueAsString(map);
    } catch (JsonProcessingException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    Object obj = null;
    try {
      obj = stringToJson(str1);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    try {
      Map<String, Object> result = new HashMap<>();
      result.put("jsonString", str1);
      result.put("jsonString2", obj);
      System.out.println(mapper.writeValueAsString(result));
    } catch (JsonProcessingException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

  private Object stringToJson(String str) throws Exception {
    return mapper.readValue(str, Object.class);
  }

}
