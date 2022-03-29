package com.tyss.set;
import java.util.HashSet;
import java.util.Iterator;
public class Test {
 public static void main(String [] args) {
	 HashSet<Integer> hashset =new HashSet<>();
	 hashset.add(10);
	 hashset.add(20);
	 hashset.add(30);
	 hashset.add(10);
	 Iterator<Integer> iterator= hashset.iterator();
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
 }
}
