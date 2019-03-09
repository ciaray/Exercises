import java.util.Scanner;

public class examples {

	public static void main(String[] args) {
		
	
		// Enter variables
		int A;
		A = 4;
		int B;
		B = 8;
		
		// If statement:
		
		if  (A >= B) {
			System.out.println(A + B);
		}
	
		else if (A == B) {
			System.out.println(B / A);
		}
		
		else {
			System.out.println("The value of A is" + " " + A + " and the value of B is" + " " + B);
		}


		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("How old are you?");
		int age;
		age = user_input.nextInt();
		
		if (age <= 17) {
		    System.out.println("You are too young to legally buy or consume alcoholic beverages.");
		}
		
		else if (age >= 18 && age <= 21) {
		    System.out.println("You can legally buy and consume alcohol in most countries, but not in the USA.");
		}
		
		else if (age >= 21) {
		    System.out.println("You are legal worldwide!");
		}
			}
    }
