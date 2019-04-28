import java.awt.*;
import java.applet.Applet;
import java.util.Random;
import java.util.Scanner;

public class RandomCircles extends Applet {

	public void paint(Graphics g) {

		Random randy = new Random();
		int num = randy.nextInt(Integer.MAX_VALUE);
		System.out.println(num);

		// Circles must be inside this box
		g.setColor(Color.white);
		g.fillRect(0, 0, 1000, 650);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		for (int i = 1; i <= num; i++) {

			// Random color
			int r = randy.nextInt(50);
			int v = randy.nextInt(100);
			int b = randy.nextInt(256);
			int a = randy.nextInt(100);
			Color c = new Color(r, v, b, a);
			g2.setColor(c);

			// Draw circle
			// Random diameter
			int dia = 5 + randy.nextInt(30);
			int radius = dia / 2;

			// Random location
			int x = randy.nextInt(1001 - (dia));
			int y = randy.nextInt(651 - (dia));
			g2.fillOval(x, y, dia, dia);
			//g2.setColor(Color.black);
			//g2.drawOval(x, y, dia, dia);

			// Slow it down now y'all
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
