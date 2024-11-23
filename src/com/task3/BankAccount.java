package com.task3;

public class BankAccount
{
	String username;
	double balance;
	int pin;
	
	//Constructor
	public BankAccount(String username, double balance, int pin)
	{
		this.username = username;
		this.balance = balance;
		this.pin = pin;
	}
	
	//Getter for getting user details
	public String getUserName()
	{
		return username;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	//Withdraw money
	public boolean withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
			return true; //withdrawal successful
		}
		return false; //insufficient balance
	}
	
	//Deposit money
	public void deposit(double amount)
	{
		balance += amount; //deposit successful
	}
	
	//valid PIN to access account
	public boolean validatePin(int enteredPin)
	{
		return enteredPin == this.pin; //will return true if entered pin
	}
	
}
