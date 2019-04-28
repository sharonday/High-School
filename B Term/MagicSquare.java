import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		// make that thing
		Scanner steve = new Scanner(System.in);
		System.out.println("Please input an ODD number: ");
		int n = steve.nextInt();
		int c = n / 2;
		int r = n - 1;
		int[][] magic = new int[n][n];

		// fill it up
		// System.out.print();
		magic[r][c] = 1;
		for (int k = 2; k <= (n * n); k++) {

			if ((r == n - 1 && c == n - 1) || (magic[(r + 1) % n][(c + 1) % n] != 0)) {
				r = (r - 1) % n;
			} else {
				r = (r + 1) % n;
				c = (c + 1) % n;
			}

			magic[r][c] = k;

		}

		// print
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (magic[i][j] < 100) {
					System.out.print(" ");
					if (magic[i][j] < 10) {
						System.out.print(" " + magic[i][j] + " ");
					} else {
						System.out.print(magic[i][j] + " ");
					}
				} else {
					System.out.print(magic[i][j] + " ");
				}

			}
			System.out.println(" ");
		}

	}

}
