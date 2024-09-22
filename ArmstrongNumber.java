package com.MainApp;

import java.util.Scanner;

//Write a program to check if a number is an Armstrong Number

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		boolean number = isAramstrong(num);
		if(number) {
			System.out.println("Your number is Armstrong");
		}
		else {
			System.out.println("Your number is not Armstrong");
		}

	}

	
	public static boolean isAramstrong(int num) {
		int noOfDigits = noOfDigits(num);
		int numCopy = num;
		int finalNumber = 0;
		while(num > 0) {
			int lastDigit = num % 10;
			num /= 10;
			finalNumber += pow(lastDigit, noOfDigits);
		}
		return finalNumber == numCopy;
		
	}
	
	public static int pow(int num1, int num2) {
		int result = 1;
		int i = 0;
		while(i < num2) {
			result *= num1;
			i++;
		}
		return result;
	}
	
	public static int noOfDigits(int num) {
		int digits = 0;
		while(num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
}
















