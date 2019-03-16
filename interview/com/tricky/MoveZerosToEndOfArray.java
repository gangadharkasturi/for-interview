package com.tricky;

public class MoveZerosToEndOfArray {
public static void main(String[] args) {
	int a [] = {0,2,0,1,0,3,0,2,1,4,0};
	for(int i = 0;i<a.length-1;i++){
		for(int k=i+1;k<a.length-1;k++){
			if(a[i]<a[k]){
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
				
			}
		}
	}
	for(int aa : a){
		System.out.print(aa);
	}
}
}
