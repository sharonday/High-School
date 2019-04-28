import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Statistics {

	public static void main(String[] args) {
		// Get your array
		Scanner steve = new Scanner(System.in);
		System.out.println("Please input a number less than 20: ");
		int num = steve.nextInt();
		// int num = 7;
		int[] array = new int[num];
		Random randy = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + randy.nextInt(20);
		}
		System.out.println(Arrays.toString(array));

		// Mean
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		double mean = (double) sum / num;
		System.out.println("The average of the numbers is: " + mean);

		// Median
		Arrays.sort(array);
		System.out.println("Here are the numbers in numerical order: ");
		System.out.println(Arrays.toString(array));

		if (num % 2 == 0) {
			System.out.println("The medians of the numbers are: " + array[num / 2] + " and " + array[(num / 2) + 1]);

		} else {
			System.out.println("The median of the numbers is: " + array[num / 2]);

		}

		// Mode
		int mode = 1;
		int modeAt = 0;
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1 && array[i] == array[i + 1]) {
				count++;
				if (count > mode) {
					mode = count;
					modeAt = array[i];
				}

			} else {
				count = 1;
			}
		}
		System.out.println("There are " + mode + " " + modeAt + "s.");

	}

}
