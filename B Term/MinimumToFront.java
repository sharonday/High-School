import java.util.ArrayList;
import java.util.Random;

public class MinimumToFront {

	public static void main(String[] args) {
		// make that array
		Random randy = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i, randy.nextInt(101));
		}
		System.out.println(list);

		// find and remove the min
		int min = 100;
		int minAt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
				minAt = i;
			}
		}
		list.remove(minAt);
		System.out.println(min);
		System.out.println(list);

		// moving it to front
		list.add(0, min);
		System.out.println(list);
	}

}
