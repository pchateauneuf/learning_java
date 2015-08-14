package tutorial_10;

public class Application {
	public static void main(String[] args) {
		
		// CREATE ARRAY
		int[] values;
		
		values = new int[3];
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println("values of 'value' array:");
		
		for(int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		} // for
		
		int[] numbers = {5,6,7};
		
		System.out.println("values of 'numbers' array:");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		} // for
		
		System.out.println("total count of 'numbers' array:");
		
		System.out.println(numbers.length);
		
	}
}
