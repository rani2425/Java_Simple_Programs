package com.MainApp;

//create a program using do while to find password checker until a valid password is entered

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String password;
		do {
			System.out.print("Enter your password: ");
			password = sc.next();
		}
		while(!inValidPass(password));
		System.out.println("Thank You! Your password is valid.");
		sc.close();

	}

	
	
	
    public static boolean inValidPass(String pass) {
       
        if (pass.length() <= 6) {
            System.out.println("Password must be longer than 6 characters.");
            return false;
        }

        
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        int i = 0;
        do {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }

            i++;
        } while (i < pass.length());
        
        
        
        if (!hasUpperCase || !hasLowerCase || !hasNumber || !hasSpecialChar) {
            System.out.println("Password must contain at least:");
            if (!hasUpperCase) {
                System.out.println("- One uppercase letter.");
            }
            if (!hasLowerCase) {
                System.out.println("- One lowercase letter.");
            }
            if (!hasNumber) {
                System.out.println("- One number.");
            }
            if (!hasSpecialChar) {
                System.out.println("- One special character.");
            }
            return false;
        
        }
        return true;
    }
    
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

