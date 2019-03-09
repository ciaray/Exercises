import java.util.Random;
import java.util.Scanner;

public class guess {

	
	public static void main(String[] args) {
		// Guessing game for user

		Random rand = new Random();
		
		// Generate random integer between 0 and 10
		int n;
		n = rand.nextInt(11);
		
		// Get user input
		@SuppressWarnings("resource")
		Scanner guess = new Scanner(System.in);
		System.out.print("I'm thinking of a number between 1 and 10. Take a guess:");
		int nGuess;
		nGuess = guess.nextInt();
		
		int win = 0;
		
		while (win == 0) {
			
		
		if (nGuess == n) {
			System.out.print("Well done! " + nGuess + " " + "is indeed the number I was thinking of!");	
			win = 1;
		
		}
		
		else if (nGuess < n) {
			System.out.print("Think higher! Guess again:");
			nGuess = guess.nextInt();
			win = 0;
		}
		
		else if (nGuess > n) {
			System.out.print("Think lower! Guess again:");
			nGuess = guess.nextInt();
			win = 0;
		}
		
		}
		
		
	}

}
