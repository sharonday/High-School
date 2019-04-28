import java.util.Random;
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		// Number between 1 and 10
		Scanner steve = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10!");
		int hum = steve.nextInt();

		Random randy = new Random();
		int comp = 1 + randy.nextInt(10);

		if (hum == comp) {
			System.out.println("Congradulations! you chose the correct number!");
		} else if (hum < 11 || hum > 0){
			System.out.println("Sorry, you guessed the wrong number. The correct number was " + comp);
		} else {
			System.out.println("FOLLOW DIRECTIONS! The number you entered was invalid.");
		}

	}

}
