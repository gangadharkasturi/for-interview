package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfDuplicateChars {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String name = "BUTTERBETTER";
		for (int i = 0; i < name.length() - 1; i++) {
			if (map.containsKey(name.charAt(i))) {
				map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
			} else {
				map.put(name.charAt(i), 1);
			}
		}
		Set<Entry<Character, Integer>> entrySetOfMyMap = map.entrySet();
		for (Entry<Character, Integer> entry : entrySetOfMyMap) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}

	}
}
