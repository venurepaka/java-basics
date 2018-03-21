package com.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentsUsingComparator {

	public static void main(String[] args) {
		Student st1 = new Student(10, "Ravi", 2);
		Student st2 = new Student(12, "	Michael", 3);
		Student st3 = new Student(11, "	Joseph", 4);
		
		List<Student> students = new ArrayList<Student>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		
		
		Collections.sort(students, new AgeComparator());
		
		for(Student st : students) {
			System.out.println(st.getAge()+", "+st.getRollNum()+", "+st.getName());
		}
		
		
	}
}

class Student  {

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

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public Student(int age, String name, int rollNum) {
		super();
		this.age = age;
		this.name = name;
		this.rollNum = rollNum;
	}


}

class AgeComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
			//return o2.getName().compareTo(o1.getName());
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}
		else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
		}
	}
	
