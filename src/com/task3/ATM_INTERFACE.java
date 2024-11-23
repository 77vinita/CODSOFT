package com.task3;

import java.util.Scanner;

public class ATM_INTERFACE 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ATM atm = new ATM();
		
		//Prompt of user details
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter PIN: ");
		int pin = sc.nextInt();
		
		if(atm.authenticateUser(username, pin))
		{
			System.out.println("Authentication successful.");
			atm.startATM();
		}
		else
		{
			System.out.println("Invalid username or PIN...Please try again");
		}
		sc.close();
	}
}
