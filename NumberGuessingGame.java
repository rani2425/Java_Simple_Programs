package com.MainApp;

//Write a program using do-while  to implement a number guessing game
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double roundedValue = Math.random()*100;
		int num = (int) Math.round(roundedValue);
		
//		System.out.println(num);        //for to check which is random number
		int guess;
		do {
			System.out.print("Enter Your Number: ");
			guess = sc.nextInt();
		}
		while(num != guess);
		System.out.println("Wow! You guess the number....");
		
		sc.close();
	}

}
