import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BulgarianSolitaire {

	public static void main(String[] args) {
		// Make that array
		ArrayList<Integer> list = new ArrayList<Integer>();

		// fill it up
		Random randy = new Random();
		Scanner steve = new Scanner(System.in);
		int n = steve.nextInt();
		int back = n;

		// piles
		for (int i = 0; i < n; i++) {
			int pile = n - randy.nextInt(n);
			list.add(i, pile);
			n = n - pile;
			if (n <= 0) {
				break;
			}
		}
		if (n != 0) {
			list.add(n);
		}
		n = back;

		System.out.println(list);

		// moves
		int q = 0;
		int moves = 0;
		ArrayList<Integer> check = new ArrayList<Integer>();
		check.add(1);
		check.add(2);
		check.add(3);
		check.add(4);
		if (n >= 15) {
			check.add(5);
			if (n >= 21) {
				check.add(6);
				if (n >= 28) {
					check.add(7);
					if (n >= 36) {
						check.add(8);
						if (n >= 45) {
							check.add(9);
						}
					}
				}
			}
		}
		System.out.println(check);

		while (q == 0) {
			if (list.containsAll(check) == true) {
				q = 1;
			} else {
				rearrange(list);
				moves++;
				System.out.println(list + "		" + moves);
			}

		}

	}

	public static void rearrange(ArrayList<Integer> list) {
		int newPile = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				list.remove(i);
				newPile++;
				i--;
			} else {
				list.set(i, list.get(i) - 1);
				newPile++;
			}
		}
		list.add(newPile);

	}

}
