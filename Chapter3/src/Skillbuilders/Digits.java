package Skillbuilders;
import java.util.*;
public class Digits
{


	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter a two-digit number: ");
		int two= userInput.nextInt();
	
		
		int tenPlace = two / 10;
		System.out.println("Ten Place:" + tenPlace);
		int onePlace = two % 10;
		System.out.println("One Place:" + onePlace);
		
		
	}
}
		
	
	
	
	
	
	