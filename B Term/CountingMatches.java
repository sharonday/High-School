import java.util.Scanner;

public class CountingMatches {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("Please input a word or phrase: ");
		String user = steve.nextLine();
		int counter = 0;
		String lower = user.toLowerCase();

		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) != lower.charAt(i)) {
				counter++;
			}

		}

		System.out.println("There is/are " + counter + " uppercase letter(s) in " + user + ".");

	}

}
