package com.gk.sortings;

public class BubbleSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 77, 41, 25, 88, 99, 74, 7 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = 0; k < arr.length - 1 - i; k++) {
				if (arr[k] > arr[k + 1]) {
					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}
		for (int a = 0; a <= arr.length - 1; a++) {
			System.out.println(arr[a]);
		}
	}

}
