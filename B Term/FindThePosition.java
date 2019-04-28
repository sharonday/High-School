import java.util.Arrays;
import java.util.Random;

public class FindThePosition {

	public static void main(String[] args) {
		// make that array
		Random randy = new Random();
		int[] daya = new int[25];
		for (int i = 0; i < daya.length; i++) {
			daya[i] = 1 + randy.nextInt(50);
		}

		System.out.println(Arrays.toString(daya));
		// find that thing
		for (int i = 0; i < daya.length; i++) {
			if (daya[i] > 30) {
				System.out.println("Value: " + daya[i]);
				System.out.println("Position: " + i);
				break;
			}
		}

	}

}
