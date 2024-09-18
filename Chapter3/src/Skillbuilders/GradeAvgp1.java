package Skillbuilders;

import java.util.Scanner;

public class GradeAvgp1 {


	public static void main(String[] args)
	{
		
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Please enter a first grade: ");
		int first = userInput.nextInt();
		
		System.out.print("Please enter a second: ");
		int second = userInput.nextInt();
		
		System.out.print("Please enter a third: ");
		int third = userInput.nextInt();
		
		System.out.print("Please enter a fourth: ");
		int fourth = userInput.nextInt();
		
		System.out.print("Please enter a fifth: ");
		int fifth = userInput.nextInt();
		
		
		int average = first + second + third + fourth + fifth / 5;
		System.out.print("The average grade is : " + average);
		
		
	
	}       

} 