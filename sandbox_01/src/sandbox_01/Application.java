package sandbox_01;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// GET USER INPUT
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		
		String userFirstName = userInput.nextLine();
		
		System.out.println("Please enter your last name:");
		
		String userLastName = userInput.next();
		
		String[] userInfo = new String[2];
		
		userInfo[0] = userFirstName;
		userInfo[1] = userLastName;
		
		System.out.print("Your name is: ");
		
		for(int i=0; i < userInfo.length; i++){
			System.out.print(userInfo[i] + " ");
		}//for
		
		
		
	}//main
}//Application
