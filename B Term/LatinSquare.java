import java.util.Scanner;

public class LatinSquare {

	public static void main(String args[]) {

		Scanner steve = new Scanner(System.in);
		System.out.println("How many rows/columns would you like?");
		int n = steve.nextInt();
		int[][] square = new int[n][n];
		createLatin(square);
		displayLatin(square);

	}

	// Creates a Latin Square
	public static void createLatin(int[][] square) {

		int i = 1;
		int start = 1;
		for (int r = 0; r < square.length; r++) {
			i = start;
			for (int c = 0; c < square.length; c++) {
				square[r][c] = i;
				if (i == square.length) {
					i = 0;
				}
				i++;
			}
			start++;
		}
	}

	// Displays/Prints a Latin Square to the console
	public static void displayLatin(int[][] square) {

		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square.length; c++) {
				System.out.print(square[r][c] + " ");
			}
			System.out.println();
		}
	}
}