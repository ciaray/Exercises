package exercises;

import java.util.Scanner;

public class ex10 {
	
	
	// Declare the method
	public static double small(double x1, double x2, double x3, double x4) {
		
		return(Math.min(Math.min(x1, x2), Math.min(x3, x4)));
		
	}
	
	// Call the method in main 
	public static void main(String[] args) {
		
		// User input variables
		Scanner user_input = new Scanner(System.in);
		System.out.print("Input the value for the first number to be compared:");
		double x1 = user_input.nextDouble();
		System.out.print("Input the value for the second number to be compared:");
		double x2 = user_input.nextDouble();
		System.out.print("Input the value for the third number to be compared:");
		double x3 = user_input.nextDouble();
		System.out.print("Input the value for the fourth number to be compared:");
		double x4 = user_input.nextDouble();
		
		// Use method to compare the four selected values and display result
		System.out.println("The smallest number you entered is " + small(x1, x2, x3, x4));
		
	}

}
