package exercises;

import java.util.Scanner;

public class ex9 {

	// Program to count the number of words in a string
		// The program will count the spaces (i.e. the spaces between each word) which will be equal to number of words, excluding final space
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Ask user to input string
		System.out.print("Type sentence here:");
		String string1 = input.nextLine();
		
		System.out.println("The number of words in your sentence is: " + wordCount(string1));
		
	}
	
	public static int wordCount(String string1) {
		
		int count = 0; // define variable for count
		
		// Conditional to ensure the first and last characters aren't spaces to not falsify count
		if (!(" ".equals(string1.substring(0, 1))) || !(" ".equals(string1.substring(string1.length() - 1)))) {
			
			//loops through all the characters in the string
			for (int n = 0; n < string1.length(); n++) {
				
				//searches for space characters for the length of the string and increases count by 1 for each space
				if (string1.charAt(n) == ' ') {
					count++;
				}
			}
			
			count = count + 1; //counts the first word if character one isn't a space
		}
		
		return count;
		
	}

}
