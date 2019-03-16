package com.gk.collections;

public class ReverseOfString {
	public static void main(String[] args) {
		String name = "gangadhar";
		String result = "";
		char[] nameArr = name.toCharArray();
		for (int i = 0; i < nameArr.length; i++) {
			result = result + nameArr[i];

		}
		System.out.println(result);
	}
}
