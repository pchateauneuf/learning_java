package tutorial8;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		// CREATE SCANNER OBJECT
		Scanner userScanner = new Scanner(System.in);
		
		// ASK FOR USER INPUT
		System.out.println("Enter a number: ");
		
		// STORE USER INPUT
		int userInputValue = userScanner.nextInt();
		
		// IF USER INPUT WASN'T 5 THEN KEEP ASKING
		while(userInputValue !=5 ){
			
			System.out.println("Enter another number: ");
			
			userInputValue = userScanner.nextInt();
			
		} // WHILE
	
		System.out.println("You finally picked 5!");
		
		userScanner.close();
		
	} // MAIN
} // APPLICATION
