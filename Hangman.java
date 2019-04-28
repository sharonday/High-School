import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman extends Applet {

	public void paint(Graphics g) {
		Scanner steve = new Scanner(System.in);

		// draw gallows
		g.fillRect(600, 50, 5, 400);
		g.fillRect(500, 50, 100, 5);
		g.fillRect(400, 450, 205, 5);
		g.fillRect(495, 50, 5, 50);

		// set word
		System.out.println("Please pick a word: ");
		String word = steve.nextLine();
		ArrayList<String> letters = new ArrayList<String>();
		for (int i = 0; i < word.length(); i++) {
			String n = "" + word.charAt(i);
			letters.add(n);
		}
		System.out.println(letters);

		// check letters and/or draw
		int counter = 0;
		while (counter != 7 && letters.size() > 0) {
			System.out.println("Please guess a letter: ");
			String l = steve.next();
			if (letters.contains(l)) {
				letters.remove(l);
				System.out.println(letters);
				continue;
			} else {
				counter++;
				System.out.println("nope");
				switch (counter) {
				case 1:
					drawHead(g);
					break;
				case 2:
					drawBody(g);
					break;
				case 3:
					drawRArm(g);
					break;
				case 4:
					drawLArm(g);
					break;
				case 5:
					drawRLeg(g);
					break;
				case 6:
					drawLLeg(g);
					break;
				case 7:
					System.out.println("You LOSE!!!");
					break;

				}

			}
		}
		System.out.println("done");

	}

	public void drawHead(Graphics g) {
		g.fillOval(477, 100, 40, 40);
	}

	public void drawBody(Graphics g) {
		g.fillRect(495, 140, 5, 100);

	}

	public void drawRArm(Graphics g) {
		g.fillRect(450, 170, 45, 5);

	}

	public void drawLArm(Graphics g) {
		g.fillRect(500, 170, 45, 5);

	}

	public void drawRLeg(Graphics g) {
		g.fillRect(500, 240, 5, 65);

	}

	public void drawLLeg(Graphics g) {
		g.fillRect(490, 240, 5, 65);

	}

	private void findAndRemoveLetter(String let) {
		

	}
}
