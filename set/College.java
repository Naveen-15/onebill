package com.tyss.set;
import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("naveen",1,"it");
		Student student2 = new Student("aarish",2,"it");
		Student student3 = new Student("harish",2,"it");
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student3);
		ArrayList<Student> list = new ArrayList<>(hashSet);
		Collections.sort(list, new SortByName());
		for(Student std : hashSet) {
			System.out.println(std);
		}
	}

}
