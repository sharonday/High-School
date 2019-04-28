import java.util.ArrayList;

/**
 * This CashRegister class contains a state tax rate. The class can be used to
 * add items to a receipt, retrieve a total amount, total tax. The class can
 * also get the amount of correct change, and print a receipt complete with a
 * list of items with prices, and total payment information. In addition, the
 * class can also retrieve a total amount of sales made and how much money was
 * made.
 * 
 * @author Daya
 *
 */
public class CashRegister {

	// data
	private double total;
	private ArrayList<Item> receipt = new ArrayList<Item>();
	private double tax;
	private double paid;
	private double totSales = 0.0;
	private int amtSales = 0;

	// constructors
	/**
	 * Constructs a CashRegister with an input parameter of a sales tax.
	 * 
	 * @param t
	 *            the state sales tax as a percentage
	 */
	public CashRegister(double t) {
		total = 0;
		tax = t / 100;
	}

	public CashRegister() {
		total = 0;
		tax = 6.25 / 100;
	}

	// methods
	/**
	 * Adds an item's to the receipt.
	 * 
	 * @param price
	 *            the price of the item
	 */
	public void addItem(String nom, double price, int quant) {
		total += price;
		receipt.add(new Item(nom, price, quant));
	}

	/**
	 * Returns the total price on the current receipt (tax not included).
	 * 
	 * @return the total price
	 */
	public double getTotalPrice() {
		return total;
	}

	/**
	 * Returns the amount of tax owed for the current receipt.
	 * 
	 * @return the total amount of tax
	 */
	public double getTotalTax() {
		double totTax = tax * total;
		return totTax;
	}

	/**
	 * Returns the change owed to the customer. Takes in the amount paid by the
	 * customer.
	 * 
	 * @param custPay
	 *            the amount paid by the customer
	 * @return the amount of change owed to the customer
	 */
	public double getChange(double custPay) {
		paid = custPay;
		total += (tax * total);
		return paid - total;
	}

	/**
	 * Prints out a receipt for the current sale, including a list of items with
	 * their respective prices, a total amount, a sales tax, amount owed, amount
	 * paid, and change owed to the customer. Adds a sale to the total amount o
	 * sales. Adds the total amount (money) from the sale being closed to the
	 * total sales for the CashRegister.
	 */
	public void closeSale() {
		System.out.println("Receipt");
		for (int i = 0; i < receipt.size(); i++) {
			System.out.println(receipt.get(i).name + ":		 	" + "$" + receipt.get(i).price);
		}
		System.out.printf("Total: 			$%.2f", total - getTotalTax());
		System.out.println();
		System.out.printf("Sales tax (6.25): 	$%.2f", getTotalTax());
		System.out.println();
		System.out.printf("Amount Owed: 		$%.2f", total);
		System.out.println();
		System.out.println("Amount Paid: 		$" + paid);
		System.out.printf("Change Owed: 		$%.2f", getChange(paid));
		System.out.println();
		receipt.removeAll(receipt);
		amtSales++;
		totSales += total;

	}

	/**
	 * Returns the total sales in dollars for the CashRegister.
	 * 
	 * @return the total sales
	 */
	public double getTotalSales() {
		return totSales;
	}

	/**
	 * Returns the amount of sales made.
	 * 
	 * @return the amount of sales
	 */
	public int getAmtSales() {
		return amtSales;
	}

	/**
	 * Resets all totals.
	 */
	public void reset() {
		total = 0;
		totSales = 0;
		amtSales = 0;
	}

}
