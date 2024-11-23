package com.task2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StudentGradeCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> marksList = new ArrayList<>();
		
		System.out.print("Enter number of subjects: ");
		int totalSub = sc.nextInt();
		
		//taking marks as input
		System.out.println("Enter student marks for each subject(out of 100): ");
		for(int i=0; i < totalSub; i++)
		{
			System.out.print("Subject "+(i+1)+": ");
			int marks = sc.nextInt();
			marksList.add(marks);
		}
		
		//calculate total marks
		int totalMarks = 0;
		for(int mark : marksList)
		{
			totalMarks += mark;
		}
		
		//calculate average percentage
		double avgPer = (double)totalMarks / totalSub;
		
		
		//grade calculation
		String grade;
		if(avgPer >= 85)
		{
			grade = "A";
		}
		else if(avgPer >= 70)
		{
			grade = "B";
		}
		else if(avgPer >= 50)
		{
			grade = "C";
		}
		else if(avgPer >= 33)
		{
			grade = "D";
		}
		else
		{
			grade = "FAIL";
		}
		
		//Display Results
		System.out.println("\nResults:");
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Average Percentage: "+avgPer+"%");
		System.out.println("Grade: "+grade);
		if(grade.equals("FAIL"))
		{
			System.out.println("Remarks: Needs Imporvement!");
		}
		else
		{
			System.out.println("Remarks: Great job! keep up the good work");
		}
		
		sc.close();
	}
}

	

