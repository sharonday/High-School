
// Lab09.java
// The Rational Class Program I
// This is the starting version of the Lab09 assignment.
import java.util.Scanner;

public class Lab09Tester {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		int num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		int den = input.nextInt();
		Rational rat = new Rational(num, den);
		// Use the Rational class methods below to complete the assignment.		
		System.out.println(rat.getOriginal() + " equals " + rat.getDecimal());
		System.out.println("and reduces to " + rat.getRational());

	}

}