package com.tyss.hashcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Studentcomp{

	public static void main(String[] args) {
		Student student = new Student("naveen",1,"it");
		Student student2 = new Student("harish",2,"it");
		Student student3 = new Student("maddy",3,"it");
		Student student4 = new Student("mohan",4,"it");
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student4);
		hashSet.add(student3);
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		Collections.sort( arrayList);
		for (Student student5 : arrayList) {
			System.out.println(student5);
		}
		}

}
