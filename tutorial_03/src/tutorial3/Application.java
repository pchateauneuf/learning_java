package tutorial3;

public class Application {
	
	public static void main(String[] args) {
		
		// PRIMITIVE VARIABLE TYPE
		int myInt = 7;
		double myDouble = 7.5;
		
		// CLASS VARIABLE TYPE
		String text = "Hello";
		String blank = " ";
		String name = "Pete";
		
		String greeting = text + blank + name;
		
		System.out.println(greeting);
		
		System.out.println("My integer is " + myInt);
		
		System.out.println(myInt + myDouble);
		
	} // CLOSE MAIN

} // CLOSE APPLICATION