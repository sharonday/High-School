import java.util.Scanner;

public class CashRegTest {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("Sales tax: ");
		CashRegister cash = new CashRegister(steve.nextDouble());
		for (int i = 0; i < 5; i++) {
			System.out.println("Items (to end the loop, enter -1.0) :");
			double quit = 0;
			double price;
			while (quit == 0) {
				System.out.println("Item price :");
				price = steve.nextDouble();
				if (price == -1) {
					quit = -1;
				} else {
					System.out.println("Item name :");
					cash.addItem(steve.next(), price, 1);
				}
			}
			System.out.println("total: " + cash.getTotalPrice());
			System.out.println("total tax: " + cash.getTotalTax());
			System.out.println("change: " + cash.getChange(200));
			System.out.println("total: " + cash.getTotalPrice());
			cash.closeSale();

		}
		System.out.println(cash.getTotalSales());
		System.out.println(cash.getAmtSales());
		cash.reset();

	}
}
