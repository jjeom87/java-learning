package net.sunj.learning.libaries.jackson.examples;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class JsonToListExample {
	public static void main(String[] args) {
		JsonToListExample obj = new JsonToListExample();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Convert JSON string to Object
			String jsonInString = "[{\"name\":\"mkyong\",\"salary\":7500}]";

			
			JsonNode node = mapper.readTree(jsonInString);
			System.out.println(node.get("type"));
			
			
			
			List<Staff> a = new ArrayList<Staff>();
			Class<? extends Object> clazz = a.getClass();
			TypeFactory tf = mapper.getTypeFactory();
			
			JavaType javaType = tf.constructType(clazz);
			
			System.out.println(javaType.getContentType());
			System.out.println(clazz.toGenericString());
			
			
			
			System.out.println(clazz.getTypeParameters()[0]);
			
			ParameterizedType t = (ParameterizedType) clazz.getGenericInterfaces()[0];
			System.out.println(t.getActualTypeArguments()[0]);
			
			
			/*ParameterizedType t = (ParameterizedType) a.getClass().getGenericSuperclass(); // OtherClass<String>
			Class<?> clazz2 = (Class<?>) t.getActualTypeArguments()[0]; // Class<String>
*/			
//			Class<?> persistentClass = (Class<?>)
//					   ((ParameterizedType)getClass().getGenericSuperclass())
//					      .getActualTypeArguments()[0];
			
			
			
			java.lang.reflect.Type[] types = clazz.getGenericInterfaces();
			System.out.println(types.length);
			System.out.println(types[0]);
			
			// 1 방법
			List<Staff> list1 = mapper.readValue(jsonInString, new TypeReference<List<Staff>>() {});
			System.out.println(((Staff) list1.get(0)).getName());
			// 2 방법
			List<Staff> list2 = mapper.readValue(jsonInString, mapper.getTypeFactory().constructCollectionType(List.class, Staff.class));
			System.out.println(((Staff) list2.get(0)).getName());
			// 3 안됨
			List<Staff> list3 = mapper.readValue(jsonInString, javaType);
			System.out.println(((Staff) list3.get(0)).getName());
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
