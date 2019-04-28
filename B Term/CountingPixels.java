import java.util.Scanner;

public class CountingPixels {

	public static void main(String[] args) {
		// Get numbers
		Scanner steve = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int b = steve.nextInt();
		int m = steve.nextInt();
		int n = steve.nextInt();

		// Add 'em up
		int num = ((b - 1) * n * 2);
		int num2 = ((b - 1) * m * 2);
		int num3 = ((b - 1) * n - (n - 1)) * (m - 1);
		int num4 = ((b - 1) * m - (m - 1)) * (n - 1);

		// Print it all
		System.out.println("The result is: " + (num + num2 + num3 + num4));

	}

}
