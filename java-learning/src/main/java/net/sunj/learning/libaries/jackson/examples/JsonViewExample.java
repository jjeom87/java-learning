package net.sunj.learning.libaries.jackson.examples;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonViewExample {
	public static void main(String[] args) {
		JsonViewExample obj = new JsonViewExample();
		obj.run();
	}

	private void run() {
		ObjectMapper mapper = new ObjectMapper();

		Staff staff = createDummyObject();

		try {

			// Salary will be hidden
			System.out.println("Normal View");
			String normalView = mapper.writerWithView(Views.Normal.class).writeValueAsString(staff);
			System.out.println(normalView);

			String jsonInString = "{\"name\":\"mkyong\",\"age\":33,\"position\":\"Developer\",\"salary\":7500,\"skills\":[\"java\",\"python\"]}";
			Staff normalStaff = mapper.readerWithView(Views.Normal.class).forType(Staff.class).readValue(jsonInString);
			System.out.println(normalStaff);

			// Display everything
			System.out.println("\nManager View");
			String managerView = mapper.writerWithView(Views.Manager.class).writeValueAsString(staff);
			System.out.println(managerView);

			Staff managerStaff = mapper.readerWithView(Views.Manager.class).forType(Staff.class).readValue(jsonInString);
			System.out.println(managerStaff);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Staff createDummyObject() {

		Staff staff = new Staff();

		staff.setName("mkyong");
		staff.setAge(33);
		staff.setPosition("Developer");
		staff.setSalary(new BigDecimal("7500"));

		List<String> skills = new ArrayList<>();
		skills.add("java");
		skills.add("python");

		staff.setSkills(skills);

		return staff;

	}
}
