package c0504_4;

import java.util.ArrayList;

public class Team {

	String name;
	ArrayList<Employee> staffs;

	Team(String name) {
		this.name = name;
		staffs = new ArrayList<Employee>();
	}
}
