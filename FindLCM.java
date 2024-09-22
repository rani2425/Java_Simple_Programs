package com.MainApp;

import java.util.Scanner;

//Create a program to find Least Common Multiple(LCM) of two numbers

public class FindLCM {

	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter Number:");
		int num2 = sc.nextInt();
		
		//method calling
		findLcm(num1,num2);

	}

	
	//method for call without creating object
	public static void findLcm(int num1,int num2) {
		int i = 1;
		while(i <= num2) {
			int factor = num1 * i;
			if(factor % num2 == 0){
				System.out.println(factor);
				break;
			}
			i++;
		}
	}
}
