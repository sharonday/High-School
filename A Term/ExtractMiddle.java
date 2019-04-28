import java.util.Scanner;

public class ExtractMiddle {

	public static void main(String[] args) {
		// Get a string
		Scanner steve = new Scanner(System.in);
		System.out.println("Please enter a word or phrase to find the middle of:");
		String str = new String(steve.next());
		int len = str.length();
		char mid;
		char midd;

		// Find the middle of the string
		if (len % 2 == 0) {
			mid = str.charAt((len / 2) - 1);
			midd = str.charAt((len / 2));
			System.out.println("The middle of '" + str + "' is '" + mid + midd + "'.");
		} else {
			String str1 = str;
			str1 += "a";
			mid = str.charAt(len / 2);
			System.out.println("The middle of '" + str + "' is '" + mid + "'.");
		}

	}

}
