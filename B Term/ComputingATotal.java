import java.util.Scanner;

public class ComputingATotal {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);
		System.out.println("Please insert a number: ");
		int user = steve.nextInt();
		int sum = 0;

		for (int i = 0; i <= user; i++) {
			sum = sum + i;
		}

		System.out.println("Your final total is: " + sum);
	}

}
