package com.tyss.hashcom;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.ArrayList;

import com.tyss.treeset.Student;

public class Hashcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Student a=new Student("harish", 1, "IT");
			Student b=new Student("mohan", 2, "IT");
			Student c=new Student("naveen", 3, "IT");
			Student d=new Student("maddy", 4, "IT");
			Student e=new Student("mukilan", 5, "IT");
			
			LinkedHashSet<Student> hashSet = new LinedHashSet<>();
			hashSet.add(a);
			hashSet.add(b);
			hashSet.add(c);
			hashSet.add(d);
			hashSet.add(e);
			System.out.println(hashSet);
			ArrayList<Student> arrayList = new ArrayList<Student>(hashSet);
			
			
			System.out.println("after sorting");
			Collections.sort(arrayList);
			
			
			      
			SortByName sortbyname=new SortByName();
		    Collections.sort(arrayList,sortbyname);
		            
			       
			
			Collections.sort(arrayList);
			System.out.println("after using comprable to sort by id,the set is:");
			Iterator<Student> iterator = arrayList.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		
	}

	}
