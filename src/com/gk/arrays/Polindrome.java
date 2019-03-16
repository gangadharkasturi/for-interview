package com.gk.arrays;

import java.util.Scanner;

/**
 * 
 * @author Kasturi's
 *
 */
public class Polindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter number");
		int number = new Scanner(System.in).nextInt();
		int temp = 0;
		int result = 0;
		int myStoredNumber = number;
		while (number != 0) {
			temp = number%10;
			result = result*10+temp;
			number=number/10;
		}
		if(myStoredNumber == result){
			System.out.println("The given number " +result+  " is Polindrome");
		}else{
			System.out.println("The given number " +result+  " is not Polindrome");
		}
	}
}
