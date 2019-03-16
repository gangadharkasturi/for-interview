package com.gk.arrays;

/**
 * 
 * @author Kasturi's
 *
 */
public class MaxAndMinElementOfArray {
	public static void main(String[] args) {
		int arr[] = { 10, 44, 21, 223, 12, 22, 1 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {// we are comparing from second
												// position of the array as the
												// first positioni is already
												// loaded into max.
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Number of Array:" + max);

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Number of Array:" + min);
	}
}
