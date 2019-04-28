
public class RecursiveTester {
	/**
	 * A sample main method to be used for testing purposes
	 */
	public static void main(String[] args) {
		System.out.println(evenProducts(-1)); // 0
		System.out.println(evenProducts(0)); // 0
		System.out.println(evenProducts(1)); // 2
		System.out.println(evenProducts(2)); // 8
		System.out.println(evenProducts(3)); // 48
		System.out.println(evenProducts(4)); // 384
		System.out.println(evenProducts(8)); // 10321920
	}

	/**
	 * A recursive function that returns the product of the first n even
	 * integers
	 * 
	 * @param n
	 *            the number of even integers
	 * @return the product of the first n even integers, or 0 if n < 1
	 */
	public static int evenProducts(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 2;
		}

		return (2 * n) * evenProducts(n - 1);

	}
}