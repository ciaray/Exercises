package exercises;

import java.util.Scanner;

// Program to solve quadratic equations

public class ex1 {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		// Ask user for a, b, c values of quadratic equation to solve
		double a;
		System.out.print("Insert value of a:");
		a = user_input.nextDouble();
		
		double b;
		System.out.print("Insert value of b:");
		b = user_input.nextDouble();
		
		double c;
		System.out.print("Insert value of c:");
		c = user_input.nextDouble();
		
		// Calculer le discriminant: delta
		double delta;
		delta = (b * b) - (4 * a * c);
		
		// Checking whether delta is positive, negative, or 0
		if (delta > 0)  {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The roots of the equation are " + root1 + " and " + root2);
		}
		
		else if (delta < 0) {
			System.out.println("The roots of your equation are not real.");
		}
			
		else {
			double root = (-b) / (2 * a);
			System.out.println("The root of the equation is " + root);
		}
	}

}
