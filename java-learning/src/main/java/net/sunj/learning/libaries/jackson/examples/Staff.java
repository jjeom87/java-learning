package net.sunj.learning.libaries.jackson.examples;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff {
	@JsonView(Views.Normal.class)
	private String name;

	@JsonView(Views.Normal.class)
	private int age;

	@JsonView(Views.Normal.class)
	private String position;

	@JsonView(Views.Manager.class)
	private BigDecimal salary;

	@JsonView(Views.Normal.class)
	private List<String> skills;
}
