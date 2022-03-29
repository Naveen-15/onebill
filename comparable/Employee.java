package com.tyss.comparable;

public class Employee {
	int id;
	String name;
	String designation;
	double salary;
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee o)
	{
		return o.id-this.id;
	}
	
	
	

}

