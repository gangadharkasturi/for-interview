package com.gk.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCountOfString {

	public static void main(String[] args) {
		String name = "gangadhar";
		/*Map<Character, Integer> countMap = new HashMap<>();
		
		Set<Character> ch = new HashSet<>();
		
		for (int i = 0; i < name.length(); i++) {
			if (ch.add(name.charAt(i))) {
				countMap.put(name.charAt(i), 1);

			} else {
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1);
			}

		}

		Set<Entry<Character, Integer>> myNewSet = countMap.entrySet();
		for (Entry<Character, Integer> es : myNewSet) {
			System.out.println("Char:" + es.getKey() + "\t" + "Count" + es.getValue());
		}*/
		
		Map<Character, Integer> countMap = new HashMap<>();
		
		
		for (int i = 0; i < name.length(); i++) {
			if (!countMap.containsKey(name.charAt(i))) {
				countMap.put(name.charAt(i), 1);

			} else {
				countMap.put(name.charAt(i), countMap.get(name.charAt(i)) + 1);
			}

		}

		Set<Entry<Character, Integer>> myNewSet = countMap.entrySet();
		for (Entry<Character, Integer> es : myNewSet) {
			System.out.println("Char:" + es.getKey() + "\t" + "Count" + es.getValue());
		}
		
		
		
	}
}
