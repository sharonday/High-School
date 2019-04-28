import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("Please enter an 8-digit (credit card) number: ");
		String card = steve.next();
		int sum = 0;
		int add2 = 0;

		for (int i = 7; i > 0; i = i - 2) {
			sum = sum + card.charAt(i) - 48;
		}

		System.out.println(sum);
		
		for (int j = 0; j < 8; j = j + 2) {
			String monkey = Integer.toString(2 * (card.charAt(j) - 48));
			for (int l = 0; l < monkey.length(); l++) {
				add2 = add2 + (monkey.charAt(l) - 48);
			}
			
		}
		

		System.out.println("add2 " + add2);
		
		int tot = sum + add2;
		
		System.out.println(tot);

		if (tot % 10 == 0) {
			System.out.println("This card is valid.");
		} else {
			System.out.println("This card is invalid");
		}

		System.out.println(tot % 10);

	}

}
