package com.MainApp;

import java.util.Scanner;

//Write a program to check if a number is a Palindrome

public class VerifyPalindrome {

	public static void main(String[] args) {
		
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		boolean isPalindrome = isPalindrome(num);
		if(isPalindrome) {
			System.out.println("Your number is palindrome");
		}
		else {
			System.out.println("Your number is not palindrome");
		}

	}

	
	public static boolean isPalindrome(int num) {
		return num == findReverseNumber(num);
	}
	
	public static int findReverseNumber(int num) {
		int newNum = 0;
		while(num > 0) {
			int digit = num % 10;
			newNum = newNum * 10 + digit;
			num /= 10;
		}
		return newNum;
	}
}
