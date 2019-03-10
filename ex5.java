package exercises;

import java.util.Scanner;

// Comparing user input name to my names

public class ex5 {

	public static void main(String[] args) {
		
		String myFirstName = "Ciara", myLastName = "Yvon", myMiddleName = "Marie-Françoise";
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter your first name:");
		String name = user_input.next();
		
		int result1 = name.compareToIgnoreCase(myFirstName);
		int result2 = name.compareToIgnoreCase(myLastName);
		int result3 = name.compareToIgnoreCase(myMiddleName);
		
		if (result1 == 0) {
			System.out.println("We share a first name!");
		}
		
		else if (result2 == 0) { 
			System.out.println("Your first name is my last name!");
		}

		else if (result3 == 0) { 
			System.out.println("Your first name is my middle name!");
		}
		
		else {
			System.out.println("Your first name has nothing in common with my full name...");
		}
		
		
	}

}
