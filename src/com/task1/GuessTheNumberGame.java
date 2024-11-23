package com.task1;

import java.util.Scanner;

public class GuessTheNumberGame
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			String playAgain;
			int win = 0;
			int totalScore=0;
			
			do
			{
				int score=0;
				int flag = 0;
				int attempt = 0;
				
				//generate random number in the range 1 to 100
				int randomNumber = (int) (1+Math.random()*100);
				
				System.out.print("\nGuess the number between 1 and 100 (Number of attempts = 5)");
				
				while(flag == 0 && attempt < 5)
				{	
					System.out.println("\nAttempt "+(attempt+1));
					//prompt user to guess entered number
					System.out.print("Enter your guess: ");
					int num = sc.nextInt();
					
					if(num < randomNumber)
					{
						System.out.println("Too low!");
						score -= 1;
						flag=0;
					}
					else if(num > randomNumber)
					{
						System.out.println("Too high!");
						flag=0;
						score -= 1;
					}
					else
					{
						System.out.println("\nCongratulations!!..The guess is correct !!");
						win++;
						flag=1;
						score += 5;
					}
					
					attempt++;
				}
				
				if(flag == 0)
				{
					System.out.println("\nOut of attempts!! The number was: "+randomNumber );
				}
				
				totalScore += score;
				System.out.println("Score for this round: "+score);
				
				System.out.print("Do you want to play again..?(yes/no)");
				playAgain = sc.next().toLowerCase();
			}
			while(playAgain.equals("yes"));
			
			System.out.println("\nTotal wins: "+win);
			System.out.println("Score: "+totalScore);
			System.out.println("Thank you for playing");			
			sc.close();
		}
}
