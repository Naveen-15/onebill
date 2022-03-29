package com.tyss.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Long> hashMap = new HashMap<>();
		hashMap.put("naveen",9847365342l);
		hashMap.put("harish",9847365442l);
		hashMap.put("harish",123456789l);
		//Set<Entry<String, Long>> entrySet = hashMap.entrySet();
		//Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	

}

