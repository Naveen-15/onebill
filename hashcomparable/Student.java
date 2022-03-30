package com.tyss.hashcomparable;



public class Student implements Comparable<Student>{
 String name;
 int id;
 String dep;
public Student(String name, int id, String dep) {
	super();
	this.name = name;
	this.id = id;
	this.dep = dep;
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
	return "Student [name=" + name + ", id=" + id + ", dep=" + dep + "]";
}
@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
