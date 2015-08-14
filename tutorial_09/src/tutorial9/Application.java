package tutorial9;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		
		String userText = userInput.nextLine();

		switch(userText){
			
			case "start":
				System.out.println("Machine started");
				break;
			case "stop":
				System.out.println("Machine stopped");
				break;
			default: System.out.println("Command not recognized");
			
		} // SWITCH
		
		userInput.close();
		
	} //MAIN
} // Application
