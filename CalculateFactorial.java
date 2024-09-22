package com.MainApp;

import java.util.Scanner;

//Write a program that calculate the factorial of a given number

public class CalculateFactorial {

	public static void main(String[] args) {
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		long fact = findFactorial(num);
		System.out.println("Factorial of "+num+" is "+fact);

	}

	
	//method for call without creating object
	public static long findFactorial(int num) {
		if(num < 2){
			return 1;
		}
		long fact = 1;
		int i = 1;
		while(i <= num) {
			fact *= i;
			i++;
		}
		return fact;
	}
	
}
