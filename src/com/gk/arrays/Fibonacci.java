package com.gk.arrays;
/**
 * 
 * @author Kasturi's
 *
 */
public class Fibonacci {
	public static void main(String[] args) {
		int value1 = 0;
		int value2 = 1;
		int show = 0;
		for(int i=1;i<10;i++){
			show = value1+value2;
			value1=value2;
			value2=show;
			System.out.println(show);
		}
		
	}

}
