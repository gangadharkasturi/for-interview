package com.gk.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Demo {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 7);
//		for (Integer i : values) {
//			System.out.println(i);
//		}
//
//		for (int i = 0; i < values.size(); i++) {
//			System.out.println(values.get(i));
//		}
//		Iterator<Integer> iterator = values.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		//all the above are External Iterations
		
		values.forEach(i -> System.out.println(i));
	}
}
