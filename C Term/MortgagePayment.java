import java.util.Scanner;

// Lab03
// The Mortgage Payment Program
// This is the student starting version of the Lab03 assignment.
public class MortgagePayment {

	public static void main(String args[]) {

		System.out.println("Lab03: The Mortgage Payment Program\n");
		Scanner steve = new Scanner(System.in);
		System.out.print("Please enter a principal amount: ");
		double principal = steve.nextDouble();
		System.out.print("Please enter an annual interest rate: ");
		double annualRate = steve.nextDouble();
		System.out.print("Please enter a number of years: ");
		double numYears = steve.nextDouble();
		
		// double r = (annualRate / 12) / 100;
		// double n = numYears * 12;
		// // 80 points
		// double mp = ((r * (Math.pow((1 + r), n))) / ((Math.pow((1 + r), n) -
		// 1)) * principal);
		// // 100 points
		// mp = Math.round(mp * 100.0) / 100.0;
		// // 90 points
		// double tp = mp * n;
		// double ti = tp - principal;

		MortgagePayment2 me = new MortgagePayment2(principal, annualRate, numYears);

		System.out.println("Principal:		$" + principal);
		System.out.println("Annual Rate:		 " + annualRate + "%");
		System.out.println("Number of Years:	 " + numYears);
		System.out.println("Monthly Payment:	$" + me.monthlyPay());
		System.out.println("Total Payments:         $" + me.totalPay());
		System.out.println("Total Interest:         $" + me.totalInterest());
	}
}