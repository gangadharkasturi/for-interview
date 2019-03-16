package com.tricky;

import java.util.Scanner;

public class CheckBinaryNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter num");

		int n = sc.nextInt();

		while (n != 0) { 
			int intermNum = n % 10;
			if (!(intermNum == 0 || intermNum == 1)) {
				System.out.println("Not a binary num");
				break;

			} else {

				n = n / 10;
			}
		}
		if (n == 0 || n == 1) {
			System.out.println("Binary number");
		}
		sc.close();
	}
}
