package com.string;

public class StringRev {
	public static void main(String[] args) {
		String name = "gangadhar";
		String revName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);

		}
		System.out.println(revName);
	}
}
//alternative is StringBuffer reverse function