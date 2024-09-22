package com.MainApp;

import java.util.Scanner;

//Develop a program that prints the multiplication table for given number

public class MultificationTable {

	public static void main(String[] args) {
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method call
		multification(num);

	}

	
	
	
	//method for call without creating object
	public static void multification(int num) {
		for(int i = 1; i <= 10; i++){
			System.out.println(num+" * "+i+" = " +num * i);
		}		
	}
}
