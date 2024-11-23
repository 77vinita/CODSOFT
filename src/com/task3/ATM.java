package com.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ATM 
{
	//list of user accounts
	List<BankAccount> accounts = new ArrayList<>();
	
	//currently authenticated account
	BankAccount currentAcc;
	
	//Initializing atm with some user accounts
	public ATM()
	{
		accounts.add(new BankAccount("Max",5000,1234));
		accounts.add(new BankAccount("Fiona",4000, 9876));
		accounts.add(new BankAccount("Dustin",6000,4567));
	}
	
	//method to authenticate user based on the entered user-name and PIN
	public boolean authenticateUser(String username, int pin)
	{
		for(BankAccount account : accounts)
		{
			if(account.getUserName().equals(username) && account.validatePin(pin))
			{
				currentAcc = account;
				return true; //authentication successful
			}
		}
		return false; //invalid credentials
	}
	
	
		public void startATM()
	{
		Scanner sc = new Scanner(System.in);
		double amount;
		int ch;

		do {
			System.out.println("\nWelcome to the ATM ");
			System.out.println("Please choose an option: ");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposit Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.print("\nEnter amount to be withdrawn: ");
					amount = sc.nextDouble();
					if(currentAcc.withdraw(amount))
					{
						System.out.println("Amount withdrawn successfully!");
						System.out.println("New Balance: "+currentAcc.getBalance());
					}
					else
					{
						System.out.println("Insufficient funds !!");
					}
					
					break;
			case 2: System.out.print("\nEnter amount to be deposited: ");
					amount = sc.nextDouble();
					currentAcc.deposit(amount);
					System.out.println("Amount deposited successfully!");
					System.out.println("New Balance: "+currentAcc.getBalance());
					break;
			case 3: System.out.println("Current Balance: "+currentAcc.getBalance());
					break;
			case 4: System.out.println("Thank you for using the ATM...Goodbye!!");
					break;
			default: System.out.println("Invalid choice.Please try again.");
			}
		}
		while(ch != 4);
		sc.close();
	}
}
