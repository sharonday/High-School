import java.util.Scanner;

public class Paycheck {

	public static void main(String[] args) {
		// Ask for info
		Scanner steve = new Scanner(System.in);
		System.out.println("Please enter your hourly wage: ");
		double hwage = steve.nextDouble();
		System.out.println("How many hours have you worked this past week?");
		double hours = steve.nextDouble();
		double payday;

		// Calculate stuff
		if (hours <= 40) {
			payday = hwage * hours;
		} else {
			payday = ((1.5 * hwage) * (hours - 40)) + (40 * hwage);
		}
		System.out.println("This week, you earned $" + payday);

	}

}
