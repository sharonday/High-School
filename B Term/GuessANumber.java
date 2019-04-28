import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		Random randy = new Random();
		int comp = 1 + randy.nextInt(21);

		Scanner steve = new Scanner(System.in);
		int user = 0;
		System.out.println(comp);

		for (int i = 0; i < 21; i++) {
			System.out.println("Please guess a number between 1 and 20.");
			user = steve.nextInt();
			if (user == comp) {
				System.out.println("Good Job! You guessed the correct number.");
				break;
			} else {
				System.out.println("Sorry, " + user + " is not the correct number.");
			}
		}
		System.out.println("Game over...");

	}

}
