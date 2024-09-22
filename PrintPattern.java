package com.MainApp;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows:");
		int rows = sc.nextInt();
		
		//method calling
//		printRightHalfPyramid(rows);
//		printReverseRightHalfPyramid(rows);
		printLeftHalfPyramid(rows);

	}
	
	public static void printRightHalfPyramid(int row) {
		int rows = 0;
		while(rows < row) {
			System.out.print("*");
			int i = 0;
			while(i < rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++;
		}
	}
	
	
	public static void printReverseRightHalfPyramid(int maxRows) {
		int rows = maxRows;
		while(rows > 0) {
			int i = 0;
			while(i < rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	
	
	public static void printLeftHalfPyramid(int maxRows) {
		int rows = maxRows;
		while(rows > 0) {
			int j = 0;
			while(j < rows - 1) {
				System.out.print("  ");
				j++;
			}
			int i = 0;
			while(i <= (maxRows-rows)) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}

}
