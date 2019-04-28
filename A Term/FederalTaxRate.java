import java.util.Scanner;

// Lab05
// The Federal Tax Rate Program
// This is the student, starting version of Lab05.

public class FederalTaxRate {

	public static void main(String args[]) {

		// Get info
		System.out.println("Lab05: The Federal Tax Rate Program");
		Scanner steve = new Scanner(System.in);
		System.out.println("Kindly insert your marital status: 1 = single  or 2 = married/widow(er).");
		int marital = steve.nextInt();
		System.out.println("Kindly insert your income:");
		double income = steve.nextDouble();
		double tax = 0;
		double base = 0;

		// Calculate tax return
		if (marital == 1) {
			if (income <= 9075 && income >= 0) {
				base = 0;
				tax = .10 * (income - base);
			} else if (income > 9075 && income <= 36900) {
				base = 9075;
				tax = 907.5 + (.15 * (income - base));
			} else if (income > 36900 && income <= 89350) {
				base = 36900;
				tax = 5081.25 + (.25 * (income - base));
			} else if (income > 89350 && income <= 186350) {
				base = 89350;
				tax = 18193.75 + (.28 * (income - base));
			} else if (income > 186350 && income <= 405100) {
				base = 186350;
				tax = 45353.75 + (.33 * (income - base));
			} else if (income > 405100 && income <= 406750) {
				base = 405100;
				tax = 117541.25 + (.35 * (income - base));
			} else if (income > 406750) {
				base = 406750;
				tax = 118118.75 + (.396 * (income - base));
			} else {
				System.out.println("You did something wrong. Please read the instructions and redo your input.");
			}
		} else if (marital == 2) {
			if (income <= 18150 && income >= 0) {
				base = 0;
				tax = .10 * (income - base);
			} else if (income > 18150 && income <= 73800) {
				base = 18150;
				tax = 1815 + (.15 * (income - base));
			} else if (income > 73800 && income <= 148850) {
				base = 73800;
				tax = 10162.5 + (.25 * (income - base));
			} else if (income > 148850 && income <= 226850) {
				base = 148850;
				tax = 28925 + (.28 * (income - base));
			} else if (income > 226850 && income <= 405100) {
				base = 226850;
				tax = 50765 + (.33 * (income - base));
			} else if (income > 405100 && income <= 457600) {
				base = 405100;
				tax = 109587.5 + (.35 * (income - base));
			} else if (income > 457600) {
				base = 457600;
				tax = 127962.5 + (.396 * (income - base));
			} else {
				System.out.println("You did something wrong. Please read the instructions and redo your input.");
			}
		} else {
			System.out.println("You did something wrong. Please read the instructions and redo your input.");
		}
		
		
		//Print result
		System.out.printf("You must pay $%.2f", tax);
		System.out.print(" in federal income taxes.");
	}
}