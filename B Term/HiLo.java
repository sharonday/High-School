import java.util.Random;
import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		// Random Number between 1 and 100
		Random randy = new Random();
		int comp = 0 + randy.nextInt(101);
		System.out.println(comp);

		// Quitters never win
		System.out.println("If you want to quit at any point, just type in a number outside the range of 1-100.");
		Scanner steve = new Scanner(System.in);
		int play = 0;

		// Get user number
		System.out.println("Please guess a number between 1 and 100: ");
		int user = steve.nextInt();

		// Try counter
		int count = 1;

		// Decision time
		while (play == 0) {
			while (user > 0 && user < 101) {
				if (user < comp) {
					System.out.println("Too low! Try again.");
				} else if (user > comp) {
					System.out.println("Too high! Try again.");
				} else if (user == comp) {
					System.out.println("Good Job! You guessed correctly! It took you " + count
							+ " tries to guess the correct number!");
					System.out.println("Play again? Enter 0 for yes and 1 for no.");
					comp = 0 + randy.nextInt(101);
					play = steve.nextInt();
					System.out.println(comp);
				}
				System.out.println("Please guess a number between 1 and 100: ");
				user = steve.nextInt();
				count++;

			}
			if (user < 0 || user > 100) {
				System.out.println(
						"Quitters never win and winners never quit. But you did. So I guess you're not a winner.");
				play = 1;
			}

		}
	}
}
