package com.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortStudents {

	public static void main(String[] args) {
		Student1 st4 = new Student1(10, "Ravi", 2);
		Student1 st5 = new Student1(10, "Ravi", 2);
		
		System.out.println("comparing = "+st4.equals(st5));
		
		
	}
	
	public static void main1(String[] args) {
		Student1 st1 = new Student1(10, "Ravi", 2);
		Student1 st2 = new Student1(12, "	Michael", 3);
		Student1 st3 = new Student1(11, "	Joseph", 4);
		
		
		
		List<Student1> students = new ArrayList<Student1>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		//Collections.sort(students, Collections.reverseOrder());
		Collections.sort(students);
		
		for(Student1 st : students) {
			System.out.println(st.getAge()+", "+st.getRollNum()+", "+st.getName());
		}
		
		
	}
}

class Student1 implements Comparable<Student1> {

	private int age;
	private String name;
	private int rollNum;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNum != other.rollNum)
			return false;
		return true;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	

	public Student1(int age, String name, int rollNum) {
		super();
		this.age = age;
		this.name = name;
		this.rollNum = rollNum;
	}

	public int compareTo(Student1 st) {

		if (rollNum > st.rollNum) {
			return 1;
		} else if (rollNum < st.rollNum) {
			return -1;
		} else
			return 0;
	}

}