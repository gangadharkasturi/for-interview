package com.string;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String name = "gangadhar Kasturi From Karimnagar ";
		String withOutWhiteSpaceName = "";
		for(int i=0;i<name.length()-1;i++){
			if(!(name.charAt(i)==' ')){
				withOutWhiteSpaceName = withOutWhiteSpaceName+name.charAt(i);
			}
		}
		System.out.println(withOutWhiteSpaceName);
	}
}
