package com.MainApp;

import java.util.Scanner;

//Create a program to print fibonacci series up to a certain number

public class FibonacciSeries {
	public static void main(String[] args) {
		
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		
		//method calling
		findFibonaacci(num);
		
	}

	
    //method for call without creating object
	public static void findFibonaacci(int num) {
		int first = 0, second = 1;
		System.out.print("0 ");
		System.out.print("1 ");
		while(first + second <= num) {
			int third = first + second;
			System.out.print(third +" ");
			first = second;
			second = third;
		}
	}
}
