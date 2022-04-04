package com.tyss.studentmodule;

public class Student {

	int id;
	String name;
	int marks;
	String course;
	public Student(int id, String name, int marks, String course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}
	

}

