package exercises;

import java.util.Scanner;

// Program that implements a method to return the minimum of four user input values

public class ex8 {

	public static void main(String[] args) {
	
		// Define user input 
		Scanner input = new Scanner(System.in);
		
		// Get values from user
		System.out.print("Enter the first number:");
		double num1 = input.nextDouble();
		System.out.print("Enter the second number:");
		double num2 = input.nextDouble();
		System.out.print("Enter the third number:");
		double num3 = input.nextDouble();
		System.out.print("Enter the fourth number:");
		double num4 = input.nextDouble();
		System.out.println("The smallest number entered is: " + numMin(num1, num2, num3, num4));

	}
	
	// Method to return the minimum of four values of type double
	public static double numMin(double num1, double num2, double num3, double num4) {
		return Math.min(Math.min(num1, num2), Math.min(num3, num4));
		
	}
	
	

}
