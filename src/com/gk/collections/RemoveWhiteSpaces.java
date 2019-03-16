package com.gk.collections;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String myString = "abc def ghi d fe l";
		char[] chArr = myString.toCharArray();
		String result = "";
		for (int i = 0; i < chArr.length; i++) {
			if (!(chArr[i] == ' ')) {
				result = result + chArr[i];

			}
		}
		System.out.println(result);
	}

}
