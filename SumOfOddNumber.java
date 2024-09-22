package com.MainApp;

import java.util.Scanner;

// Create a program to sum all odd numbers from 1 to a specified number N

public class SumOfOddNumber {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		int sum = oddSum(num);
		System.out.println(sum);

	}
	
	
	//method for call without creating object
	public static int oddSum(int num) {
		int sum = 0;
		int i = 1;
		while(i <= num) {
			sum += i;
			i += 2;
		}
		return sum;
	}

}
