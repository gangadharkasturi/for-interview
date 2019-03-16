package com.string;

public class DuplicateChars {
	public static void main(String[] args) {
		String name = "BETTER";
		for (int i = 0; i < name.length() - 1; i++) {
			for (int j = i + 1; j < name.length() - 1; j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.println(name.charAt(i));
				}
			}
		}
	}

}
