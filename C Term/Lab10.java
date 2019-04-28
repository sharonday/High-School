
// Lab10.java - The Rational Class Program II
// This is the starting version of the Lab10 assignment.
import java.util.Scanner;

public class Lab10 {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
		int num1 = input.nextInt();
		System.out.print("\nEnter the 1st denominator --> ");
		int den1 = input.nextInt();
		System.out.print("\nEnter the 2nd numerator ----> ");
		int num2 = input.nextInt();
		System.out.print("\nEnter the 2nd denominator --> ");
		int den2 = input.nextInt();
		Rational r1 = new Rational(num1, den1); // Stores the “first” rational
												// number (fraction)
		Rational r2 = new Rational(num2, den2); // Stores the “second” rational
												// number (fraction)
		Rational r3 = new Rational(); // This is an “empty” rational number that
										// will store the result of the
		// performed operation.
		// Sample Usage
		r3 = r1.multiply(r2);
		System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + " = " + r3.getRational());
		r3 = r1.divide(r2);
		System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + " = " + r3.getRational());
		// 100 Point Version Only
		r3 = r1.add(r2);
		System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + " = " + r3.getRational());
		r3 = r1.subtract(r2);
		System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + " = " + r3.getRational());
		System.out.println();
	}
}