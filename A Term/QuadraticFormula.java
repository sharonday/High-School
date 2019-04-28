import java.util.Scanner;

public class QuadraticFormula {
	// This thing solves the quadratic formula and outputs REAL NUMBERS ONLY.

	public static void main(String[] args) {

		Scanner steve = new Scanner(System.in);

		// A
		System.out.println("Please enter the coefficient for a: ");
		double a = steve.nextDouble();

		// B
		System.out.println("Please enter the coefficient for b: ");
		double b = steve.nextDouble();

		// C
		System.out.println("Please enter the coefficient for c: ");
		double c = steve.nextDouble();

		// Imaginary Numbers
		double dis = ((Math.pow(b, 2)) - (4 * a * c));
		if (dis < 0) {
			System.out.println("This quadratic has no real solutions");
		} else {
			// QuadFormula
			double x1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
			double x2 = (-b - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
			if (x1 == x2) {
				System.out.println("x = " + x1);
			} else {
				System.out.println("x = " + x1 + " or " + x2);
			}

		}

	}

}
