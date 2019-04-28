import java.util.ArrayList;
import java.util.Scanner;

public class MovingAverage {

	public static void main(String[] args) {

		Scanner steve = new Scanner(System.in);
		System.out.print("Type in the number of numbers: ");

		ArrayList<Double> bob = new ArrayList<Double>();
		int n = steve.nextInt();
		System.out.print("Type in the number of numbers to average each time: ");
		int p = steve.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + ": ");
			bob.add(steve.nextDouble());
		}

		for (int i = p; i <= bob.size(); i++) {
			double k = 0;
			for (int j = i - p; j < i; j++) {
				k += bob.get(j);
			}
			k*=10;
			System.out.println(((int)k) / (10.0*p));
		}

	}

}