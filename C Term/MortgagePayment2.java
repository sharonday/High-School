/**
 * This MortgagePayment class contains a principal, an annual interest rate, and
 * a number of years. The class can be used to calculate the monthly payment,
 * the total payment, and the total interest.
 * 
 */
public class MortgagePayment2 {

	// data
	private double principal;
	private double rate;
	private double numYears;

	// constructors
	/**
	 * Constructs a mortgage payment with a given principal, annual rate, and
	 * number of years.
	 * 
	 * @param p
	 *            the principal in dollars
	 * @param r
	 *            the annual rate as a percent
	 * @param y
	 *            the number of years
	 */
	public MortgagePayment2(double p, double r, double y) {
		principal = p;
		rate = r;
		numYears = y;

	}

	/**
	 * Constructs a mortgage payment with an annual rate of 3.0% and a given
	 * principal and nunber of years.
	 * 
	 * @param p
	 *            the principal in dollars
	 * @param y
	 *            the number of years
	 */
	public MortgagePayment2(double p, double y) {
		principal = p;
		rate = 3;
		numYears = y;
	}

	/**
	 * Constructs a mortgage payment with zero principal, zero annual rate, and
	 * zero years.
	 */
	public MortgagePayment2() {
		principal = 0;
		rate = 0;
		numYears = 0;
	}

	// methods
	private double monthlyRate() {
		double mRate = (rate / 12) / 100;
		return mRate;

	}

	private double numMonths() {
		double months = numYears * 12;
		return months;
	}

	/**
	 * Calculates the monthly payment of the mortgage payment
	 * 
	 * @return the monthly payment
	 */
	public double monthlyPay() {
		double mp = ((monthlyRate() * (Math.pow((1 + monthlyRate()), numMonths())))
				/ ((Math.pow((1 + monthlyRate()), numMonths()) - 1)) * principal);
		mp = roundToCent(mp);
		return mp;
	}

	/**
	 * Calculates the total payment of the mortgage payment
	 * 
	 * @return the total payment
	 */
	public double totalPay() {
		double tp = monthlyPay() * numMonths();
		tp = roundToCent(tp);
		return tp;
	}

	/**
	 * Calculates the total interest of the mortgage payment
	 * 
	 * @return the total interest
	 */
	public double totalInterest() {
		double ti = totalPay() - principal;
		ti = roundToCent(ti);
		return ti;
	}

	private double roundToCent(double d) {
		d = Math.floor(d * 100) / 100;
		return d;
	}
}
