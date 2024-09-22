package com.MainApp;

import java.util.Scanner;

//Create a program that compute the sum of the digits on an integer

public class SumOfDigits {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		int sum = sumOfDigits(num);
		System.out.println("Sum of digitd of "+num+" is "+sum);

	}

	
	
	//method for call without creating object
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
