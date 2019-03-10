package exercises;

import java.util.Arrays;

public class ex7 {
	
	// Sorting arrays numerically and alphabetically

	public static void main(String[] args) {
		
		int[] arrayNum = {24, 52, 67, 98, 1, 12, 9, 54, 72};
		System.out.println("The numerical array is: " + Arrays.toString(arrayNum));
		Arrays.sort(arrayNum);
		System.out.println("The numerically sorted array is:" + Arrays.toString(arrayNum));
		
		
		String[] arrayStr = {"Ciara", "March", "Sun", "Java", "Coding", "Math", "February"};
		System.out.println("The string array is: " + Arrays.toString(arrayStr));
		Arrays.sort(arrayStr);
		System.out.println("The alphabetically sorted array is:" + Arrays.toString(arrayStr));
		
		
	}

}
