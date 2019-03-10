package exercises;

// Compare two strings 

public class ex4 {

	public static void main(String[] args) {
		
		String string1 = "Welcome to Exercise 4";
		String string2 = "Welcome to exercise 4";
		
		int result = string1.compareTo(string2);
		
		if (result > 0) {
			System.out.println("The strings are equal!");
		}
		
		else {
			System.out.println("The strings are not equal...");
		}
		
		// Compare them ignoring case differences
		
		int result2 = string1.compareToIgnoreCase(string2);
		
		if (result2 == 0) {
			System.out.println("The strings are equal!");
		}
		
		else {
			System.out.println("The strings are not equal...");
		}
	}
	
	
	
}
