import java.util.Scanner;

public class BookStore {

	public static void main(String[] args) {
		// KiloByte sale at a bookstore
		Scanner steve = new Scanner(System.in);
		System.out.println("Please type in the total cost before discounts: ");
		double cost = steve.nextDouble();
		
		double under = cost * .92;
		double over = cost * .84;
		
		if(cost < 128){
			System.out.println("Your discounted price comes out to $" + under);
		} else{
			System.out.println("Your discounted price comes out to $" + over);
		}

	}

}
