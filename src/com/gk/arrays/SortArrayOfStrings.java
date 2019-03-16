package com.gk.arrays;

import java.util.Arrays;

public class SortArrayOfStrings {
	public static void main(String[] args) {
		String namesArr[] = { "nanis", "mahesh", "suresh", "manish", "manesh", "mahish" };
		// Arrays.sort(namesArr);
		for (int i = 0; i < namesArr.length; i++) {
			for (int j = i + 1; j < namesArr.length; j++) {

				if (namesArr[i].compareTo(namesArr[j]) > 0) {
					String temp = namesArr[i];
					namesArr[i] = namesArr[j];
					namesArr[j] = temp;
				} else {

				}
			}
		}

		for (String s : namesArr) {
			System.out.println(s);
		}
	}
}
