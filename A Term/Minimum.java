import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		// Find the smallest of 3 numbers
		Scanner steve = new Scanner(System.in);
		System.out.println("Please insert 3 numbers: ");
		int a = steve.nextInt();
		int b = steve.nextInt();
		int c = steve.nextInt();

		int min = 0;

		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else if (c < a && c < b) {
			min = c;
		}

		System.out.println("The smallest number out of " + a + ", " + b + ", and " + c + " is: " + min);
	}

}
