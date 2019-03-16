package com.gk.arrays;

/**
 * 
 * @author Kasturi's
 *
 */
public class ReverseString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * String myName = "Gangadhar"; char[] chArray = myName.toCharArray();
		 * for(int i=chArray.length-1;i>=0;i--){ System.out.println(chArray[i]);
		 * }
		 */
		String myString = "Gangadhar";
		String reversedString = "";
		for (int i = myString.length() - 1; i >= 0; i--) {
			reversedString = reversedString + myString.charAt(i);
		}
		System.out.println(reversedString);
	}
}
