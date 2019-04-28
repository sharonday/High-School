import java.util.Scanner;

public class Sieve {
	public static void main(String args[]) {
		System.out.println("\nSieve of Eratosthenes\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound ===>> ");
		final int MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static boolean checkNumber(boolean primeArray[], int i) {
		int maxDev = (int) Math.sqrt((double) i);
		for (int j = 2; j <= maxDev; j++) {
			if (primeArray[j] == false) {
				continue;
			}
			if (i % j == 0) {
				return false;
			}
		}
		return true;

	}

	public static void computePrimes(boolean primeArray[]) {
		// This method will compute the prime numbers
		for (int i = 2; i < primeArray.length; i++) {
			primeArray[i] = true;
		}
		// 0 and 1
		primeArray[0] = false;
		primeArray[1] = false;

		// Check
		for (int i = 2; i < primeArray.length; i++) {
			primeArray[i] = checkNumber(primeArray, i);
		}

	}

	public static void displayPrimes(boolean primeArray[]) {
		// This method will display the prime numbers
		int count = 0;
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] == true) {
				System.out.print(String.format("%04d ", i));
				count++;
				if (count % 16 == 0) {
					System.out.println();
				}
			}
		}
	}
}
