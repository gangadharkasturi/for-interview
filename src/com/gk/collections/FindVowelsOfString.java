package com.gk.collections;

public class FindVowelsOfString {
	/*public static void main(String[] args) {
		String name = "ironmanearth";
		String vowels = "aeiou";
		int countOfConsonents = 0;
		int countOfVowels = 0;
		for (int i = 0; i < vowels.length(); i++) {
			for (int j = 0; j < name.length(); j++) {
				if (vowels.charAt(i) == name.charAt(j)) {

					++countOfVowels;
					System.out.print(name.charAt(j));

				} else {

					
				}
			}
		}
		System.out.println("\nCOUNT of Vowels:" + countOfVowels);
		System.out.println("COUNT of Consonents:" + countOfConsonents);
	}*/
	public static void main(String[] args) {
		String name = "ironmanearth";
		int count = 0;
		char[] chArr =name.toCharArray();
		for(char ch: chArr){
			switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
				default:
					
			}
			
		}
		System.out.println("Count is:"+count);
	}
}
