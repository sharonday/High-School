/**
 * A Rational class contains a numerator and a denominator and stores a
 * fraction. This class can be used to manipulate rational number operations.
 */
public class Rational {
	private int num;
	private int den;
	private int rednum; // reduced numerator (defined from Lab09)
	private int redden; // reduced denominator (defined from Lab09)

	/**
	 * Constructs a fraction with a given numerator and denominator.
	 * 
	 * @param num
	 *            the numerator
	 * @param den
	 *            the denominator
	 */

	public Rational(int num, int den) {
		this.num = num;
		this.den = den;


	}

	/**
	 * Default constructor: Constructs a fraction with a default numerator and
	 * denominator.
	 */
	public Rational() {
		num = 0;
		den = 1;
	}

	/**
	 * Gets the numerator of the fraction.
	 * 
	 * @return the numerator
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Gets the denominator of the fraction.
	 * 
	 * @return the denominator
	 */
	public int getDen() {
		return den;
	}

	/**
	 * Gets the decimal equivalent of the fraction.
	 * 
	 * @return the decimal equivalent
	 */
	public double getDecimal() {
		return (double) num / (double) den;
	}

	/**
	 * Gets the reduced fraction as a String, for example ¾ (for printing
	 * purposes).
	 * 
	 * @return the reduced fraction
	 */
	public String getRational() {
		return reduce();
	}

	/**
	 * Gets the original fraction as a String, for example ¾ (for printing
	 * purposes).
	 * 
	 * @return the original fraction
	 */
	public String getOriginal() {
		return num + "/" + den;
	}

	/**
	 * Reduces a fraction (makes a call to getGCF() and handles the reduction.
	 * 
	 * @return the reduced fraction
	 */
	private String reduce() {
		int gcf = getGCF(num, den);
		rednum = num / gcf;
		redden = den / gcf;
		return rednum + "/" + redden;
	}

	/**
	 * Gets the GCF (Greatest Common Factor) of the given values.
	 * 
	 * @param val1
	 *            the first value
	 * @param val2
	 *            the second value
	 */
	private int getGCF(int val1, int val2) {
		int gcf = 0;
		for (int i = 1; i <= val1 || i <= val2; i++) {
			if (val1 % i == 0 && val2 % i == 0) {
				gcf = i;
			}
		}
		return gcf;
	}

	/**
	 * Multiplies this rational number with the rational number in the second
	 * Rational class.
	 * 
	 * @param r2
	 *            an instance of the second rational number (fraction)
	 * @return a new Rational object that stores the product as a rational
	 *         number (fraction)
	 */
	public Rational multiply(Rational r2) {
		int n = num * r2.getNum();
		int d = den * r2.getDen();
		Rational r3 = new Rational(n, d);
		r3.reduce();
		return r3;
	}

	/**
	 * Divides this rational number with the rational number in the second
	 * Rational class.
	 * 
	 * @param r2
	 *            an instance of the second rational number (fraction)
	 * @return a new Rational object that stores the quotient as a rational
	 *         number (fraction)
	 */
	public Rational divide(Rational r2) {
		int n = num * r2.getDen();
		int d = den * r2.getNum();
		Rational r3 = new Rational(n, d);
		r3.reduce();
		return r3;
	}

	/**
	 * Adds this rational number with the rational number in the second Rational
	 * class.
	 * 
	 * @param r2
	 *            an instance of the second rational number (fraction)
	 * @return a new Rational object that stores the sum as a rational number
	 *         (fraction)
	 */
	public Rational add(Rational r2) {
		int n = (num * r2.getDen()) + (den * r2.getNum());
		int d = den  * r2.getDen();
		Rational r3 = new Rational(n, d);
		r3.reduce();
		return r3;
	}

	/**
	 * Subtracts this rational number from the rational number in the second
	 * Rational class.
	 * 
	 * @param r2
	 *            an instance of the second rational number (fraction)
	 * @return a new Rational object that stores the difference as a rational
	 *         number (fraction)
	 */
	public Rational subtract(Rational r2) {
		int n = (num * r2.getDen()) - (den * r2.getNum());
		int d = den  * r2.getDen();
		Rational r3 = new Rational(n, d);
		r3.reduce();
		return r3;
	}
}
