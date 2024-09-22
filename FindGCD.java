package com.MainApp;

import java.util.Scanner;

//Write a program to find Gresatest Common Divisor(GCD) of two numbers


public class FindGCD {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter Number:");
		int num2 = sc.nextInt();
		
		
		//method calling
		findGcd(num1, num2);
	}
	
	
	
	//method for call without creating object
	public static void findGcd(int num1, int num2) {
		int gcd = 1;
		int i = 2;
		while(i <= least(num1, num2)) {
			if(num1 % i == 0 && num2 %i == 0) {
				gcd = i;
			}
			i++;
		}
		System.out.println(gcd);
	}    
	
	//for finding least number
	public static int least(int num1, int num2) {
	if(num1 < num2) {
		return num1;
	}
	else {
		return num2;
	}
}

}
