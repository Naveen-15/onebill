package com.tyss.hashcom;



public class Student implements Comparable<Student> {
	String name;
	int id;
	String department;
	public Student(String name, int id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student std=(Student)obj;
		return this.id==std.id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}
