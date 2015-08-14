package tutorial7;

import java.util.Scanner; // WITH CURSOR ON Scanner PRESS CMD+SHIFT+M

public class Application {
	public static void main(String[] args) {

		// CREATE SCANNER OBJECT
		Scanner userInput = new Scanner(System.in);
		
		// PROMPT USER FOR INPUT
		System.out.println("Enter a line of text: ");
		
		// WAIT FOR USER TO ENTER INPUT
		String inputLine = userInput.nextLine();
		
		// RETURN INPUT TEXT
		System.out.println("You entered: " + inputLine);
		
		// CLOSE SCANNER TO PREVENT RESOURCE LEAK
		userInput.close();
		
	}
}
