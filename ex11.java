package exercises;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		// Get user to input the number
		System.out.print("Which number do you want to check is divisible by 7?");
		int num = user_input.nextInt();
		
		// Check whether it can be divided into an integer by 7
		if ((num % 7) == 0) {
			System.out.println(num + " can be divided by 7. The result of the division is " + (num/7));
		}
		
		// Display a message in the case that the number cannot be divided into 7		
		else {
			System.out.println("Unfortunately, the number you entered cannot be divided by 7!");
		}
		
	}

}
