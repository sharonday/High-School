import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		Scanner steve = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			int a = (int) Math.pow(steve.nextInt(), 2);
			int b = (int) Math.pow(steve.nextInt(), 2);
			if (Math.sqrt(a + b) == (int) Math.sqrt(a + b)) {
				System.out.println((int)Math.sqrt(a + b));
			} else if (Math.sqrt(Math.abs(a - b)) == (int) Math.sqrt(Math.abs(a - b))) {
				System.out.println((int)Math.sqrt(Math.abs(a - b)));

			} else {
				System.out.println("nuh uh");
			}

		}

	}
}