package exercises;

import java.util.Calendar;

public class ex6 {

	// Time and date printing code
	
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		System.out.println("Current date and time:");
		System.out.format("%tb %te,  %tY%n", date, date, date);
		System.out.format("%tl:%tM %tp%n", date, date, date);
		
	}

}
