import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// set the thing up
		Random randy = new Random();
		int[] daya = new int[25];
		for (int i = 0; i < daya.length; i++) {
			daya[i] = 1 + randy.nextInt(50);
		}

		// ask for a number
		Scanner steve = new Scanner(System.in);
		System.out.println(Arrays.toString(daya));
		System.out.println("Please input a number between 1 and 50: ");
		int user = steve.nextInt();

		// check
		int q = 0;
		while (q == 0) {
			for (int i = 0; i < daya.length; i++) {
				if (user == daya[i]) {
					System.out.println("true");
					q = 1;
					break;
				}

			}
			if (q == 0) {
				System.out.println("false");
				break;
			}
		}
		

	}

}
