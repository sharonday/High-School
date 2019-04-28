import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// Computer's choice
		char computer;
		Random randy = new Random();
		int compChoice = 1 + randy.nextInt(3);

		// Person's choice
		Scanner human = new Scanner(System.in);
		System.out.println(
				"Please type in your preferred weapon form these choices: '1' for rock, '2' for paper, or '3' for scissors");
		int humChoice = human.nextInt();

		System.out.println("Computer chose: " + compChoice);

		// Battle Time
		if (compChoice == 1) {
			if (humChoice == 1) {
				System.out.println("Tie!");
			} else if (humChoice == 2) {
				System.out.println("You win! :)");
			} else if (humChoice == 3) {
				System.out.println("You lose! :(");
			} else {
				System.out.println("That was not a valid input. You automatically lost.");
			}
		} else if (compChoice == 2) {
			if (humChoice == 2) {
				System.out.println("Tie!");
			} else if (humChoice == 3) {
				System.out.println("You lose! :(");
			} else if (humChoice == 1) {
				System.out.println("You win! :)");
			} else {
				System.out.println("That was not a valid input. You automatically lost.");
			}
		} else if (compChoice == 3) {
			if (humChoice == 3) {
				System.out.println("Tie!");
			} else if (humChoice == 1) {
				System.out.println("You win! :)");
			} else if (humChoice == 2) {
				System.out.println("You lose! :(");
			} else {
				System.out.println("That was not a valid input. You automatically lost.");
			}

		}
	}
}
