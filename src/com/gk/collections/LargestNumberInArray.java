package com.gk.collections;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int num[] = { 4, 6, 2, 1, 3, 7, 3, 11, 33, 22, 4, 55, 66, 8, 76, 1, 222, 1, 222, 3, 345, 65, 7 };
		int max = num[0];// assuming
		for (int i = 1; i < num.length; i++) {// we are comparing from second
			// position of the array as the
			// first positioni is already
			// loaded into max.
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("Max Number:" + max);
	}
}
