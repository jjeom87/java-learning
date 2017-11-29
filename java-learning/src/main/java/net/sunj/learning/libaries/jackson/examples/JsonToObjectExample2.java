package net.sunj.learning.libaries.jackson.examples;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectExample2 {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "sunj");
		
		System.out.println(mapper.writeValueAsString(map));
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("test", mapper.writeValueAsString(map));
		
		System.out.println(mapper.writeValueAsString(map2));
		
		
		Map wMap = mapper.readValue(mapper.writeValueAsString(map2), Map.class);
		
		System.out.println(wMap.get("test"));
		
		
	}
}
