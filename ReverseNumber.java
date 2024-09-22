package com.MainApp;

import java.util.Scanner;

//Create a program to Reverse the digits of a number

public class ReverseNumber {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		int reverseNum = findReverseNumber(num);
		System.out.println(reverseNum);

	}

	
	//method for call without creating object
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
