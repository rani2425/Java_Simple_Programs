package com.MainApp;

//write a program to calculate sum of positive number using for each loop

import java.util.Scanner;

public class SumOfPositiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		int i = 0;
		while(i < size) {
			System.out.print("Enter element of Position " + (i+1) + ": ");
			nums[i] = sc.nextInt();
			i++;
		}
		
		int sum = 0;
		for(int num : nums) {
			if(num < 0) {
				continue;
			}
			sum += num;
		}
		System.out.println("Sum of positive number is "+ sum);

		sc.close();
	}

}
