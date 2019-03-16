package com.gk.arrays;

/**
 * 
 * @author Kasturi's
 *
 */
public class ReverseOfNumber {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 123;
		int temp = 0;
		int result = 0;
		while (number != 0) {
			temp = number % 10;
			result = result * 10 + temp;
			number = number / 10;
		}
		System.out.println(result);
	}
}
