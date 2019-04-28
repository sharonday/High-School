import java.util.Random;

public class DartThrowingSimulation {

	public static void main(String[] args) {
		Random randy = new Random();
		double x;
		double y;
		double distance = 0;
		double hit = 0;
		double miss = 0;
		int i = 0;

		while (i < 2147483647) {
			x = randy.nextDouble();
			y = randy.nextDouble();
			distance = Math.sqrt((Math.pow((x), 2)) + (Math.pow((y), 2)));

			if (distance <= 1) {
				hit++;
			} else {
				miss++;
			}
			
			i++;
		}

		double pi = 0;
		double total = hit + miss;
		if (miss != 0) {
			pi = 4 * (hit) / i;
		}

		System.out.println(distance);
		System.out.println("Hits: " + hit);
		System.out.println("Misses: " + miss);
		System.out.println("Pi: " + pi);
	}

}
