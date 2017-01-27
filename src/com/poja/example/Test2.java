package com.poja.example;

public class Test2 {

	public static void isPalindrom(String input) {
		//doing some editing
		String str = input;
		String temp = "";
		
		//char ch[] = str.toCharArray();//pooja aoojp
		int length = str.length()- 1;
		
		for(int i = length; i >= 0; i-- ){
			temp = temp + str.charAt(i);
		}
		
		
		if(temp == input){
			System.out.println(temp + " This is a palindrom");
		}
			
		else
			System.out.println(temp + " Is Not palindrom");
	}

	public static void main(String[] args) {
		isPalindrom("dad");

	}
}
