import java.util.Arrays;
import java.util.Random;

public class Runs {

	public static void main(String[] args) {
		// make that array
		Random randy = new Random();
		int[] daya = new int[20];
		for (int i = 0; i < daya.length; i++) {
			daya[i] = 1 + randy.nextInt(6);
		}

		System.out.println(Arrays.toString(daya));
		// find runs
		if (daya[0] == daya[1]) {
			System.out.print("( " + daya[0] + " ");
		} else {
			System.out.print(daya[0] + " ");
		}
		for (int i = 1; i < daya.length; i++) {
			if (i + 1 != daya.length && daya[i] == daya[i - 1] && daya[i] == daya[i + 1]) {
				System.out.print(daya[i] + " ");
			} else if (i + 1 != daya.length && daya[i] == daya[i + 1]) {
				System.out.print("( " + daya[i] + " ");
			} else if (daya[i] == daya[i - 1] && daya[i] != daya[i + 1]) {
				System.out.print(daya[i] + " ) ");
			} else {
				System.out.print(daya[i] + " ");
			}
		}
	}

}
