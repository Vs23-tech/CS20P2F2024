package Skillbuilders;
import java.util.*;
import java.text.DecimalFormat;
public class RectanglePerimeter
{

	public static void main(String[] args)
	{
		
		
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Please enter a value for lenght: ");
		int length = userInput.nextInt();
		
		System.out.print("Please enter a value for width: ");
		int width = userInput.nextInt();
		
	
		int perimeter = 2*length * 2*width;
		System.out.print("The perimeter of the rectangle is 2W + 2L: " + perimeter);
		
		
	
	
	
	}       

} 