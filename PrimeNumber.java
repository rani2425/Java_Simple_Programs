package com.MainApp;

import java.util.Scanner;

//Create a program to check whether a given number is prime or not

public class PrimeNumber {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method call
        findPrime(num);
		
		if(findPrime(num)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

	
	
	//method for call without creating object
	public static boolean findPrime(int num) {
		int i = 2;
		while(i < num ) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}
