package tutorial_12;

public class Application {
	public static void main(String[] args) {
		
		//ONE-DIMENTIONAL ARRAYS
		//int[] values = {3,5,2323};
		//System.out.println(values[2]);
		
		//MULTI-DIMENTIONAL ARRAYS
		int[][] grid = {
				{3,5,2323},   // INDEX 0
				{2,4},        // INDEX 1
				{1,2,3,4,5,6} // INDEX 2
		};//grid
		
		//System.out.println(grid[2][1]);
		
		////////////////////////////////////
		
		// ARRAY OF STRINGS
		
		// 2 ROWS, 3 COLUMNS
		String[][] texts = new String[2][3];
		
		texts[0][1] = "hello there";
		
		//System.out.println(texts[0][1]);
		
		//using print() to keep on one line
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}//inner for
			System.out.println();
		}//outer for
		
		
		
	}
}
