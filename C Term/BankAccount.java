/**
 * This class creates a bank account and allows for deposits and withdrawals,
 * with interest.
 * 
 * @author Daya
 *
 */
public class BankAccount {

	// data
	private double bal = 0;
	private double interest;

	// constructors
	/**
	 * Constructs a BankAccount.
	 * 
	 */
	public BankAccount() {

	}

	/**
	 * Constructs a BankAccount with an initial balance.
	 * 
	 * @param init
	 *            the initial balance
	 */
	public BankAccount(double init) {
		bal = init;
	}

	// methods
	/**
	 * Adds the deposited amount to the balance.
	 * 
	 * @param amt
	 *            the amount deposited
	 */
	public void deposit(double amt) {
		bal += amt;
	}

	/**
	 * Removes the withdrawed amount from the balance.
	 * 
	 * @param amt
	 *            the withdrawed amount
	 */
	public void withdraw(double amt) {
		bal -= amt;
	}

	/**
	 * Adds the interest amount to the balance.
	 * 
	 * @param rate
	 *            the interest rate (as a percentage)
	 */
	public void addInterest(double rate) {
		interest = rate / 100;
		double inte = bal * interest;
		bal += inte;
	}

	/**
	 * Returns the current balance.
	 * 
	 * @return the balance
	 */
	public double getBalance() {
		return bal;
	}

}
