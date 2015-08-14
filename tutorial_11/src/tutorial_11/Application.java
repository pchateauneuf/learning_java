package tutorial_11;

public class Application {
	public static void main(String[] args) {

		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println("Array using indexes:");
		
		for(int i = 0; i < words.length; i++){
			System.out.println(words[i]);
		}//for
		
		System.out.println("Array using strings:");
		
		String[] fruits = {"apple","banana","pear"};
		
		for(int i = 0; i < fruits.length; i++){
			System.out.println(fruits[i]);
		}//for
		
		System.out.println("Array using strings v2:");
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}//for
		
		
	}
}
