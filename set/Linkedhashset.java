package com.tyss.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(5);
		linkedHashSet.add(70);
		linkedHashSet.add(10);
		Iterator<Integer> iterator = linkedHashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
}
