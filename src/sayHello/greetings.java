package sayHello;

import java.util.Scanner;

public class greetings {

	public static void sayHello(String name) {
		System.out.println("Hello " + name + "! Nice to meet you!");
	}
	
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("What's your name?");
		String user_name;
		user_name = user_input.next();
		
		sayHello(user_name);
	

	}

}
