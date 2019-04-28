import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FilterRange {

	public static void main(String[] args) {
		// make that array(list)
		Random randy = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			list.add(i, randy.nextInt(10));
		}
		System.out.println(list);

		// Scanner & range
		Scanner steve = new Scanner(System.in);
		System.out.println("Please input a minimum value for the range: ");
		int min = steve.nextInt();
		System.out.println("Please input a maximum value for the range: ");
		int max = steve.nextInt();
		filterRange(list, min, max);
		System.out.println(list);

	}

	public static void filterRange(ArrayList<Integer> list, int min, int max) {
		// find and remove
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= min && list.get(i) <= max) {
				list.remove(i);
				i--;
			}
		}
	}

}
