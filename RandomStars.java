import java.awt.*;
import java.applet.Applet;
import java.util.Random;

public class RandomStars extends Applet {

	public void paint(Graphics g) {

		Random randy = new Random();
		int num = randy.nextInt(Integer.MAX_VALUE);
		System.out.println(num);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		int state = 0;
		int r = 255;
		int v = 0;
		int b = 0;
		for (int i = 0; i < num; i++) {

			// Random color
//			int r = randy.nextInt(256);
//			int v = randy.nextInt(256);
//			int k = randy.nextInt(256);
//			Color c = new Color(r, v, k);
//			g2.setColor(c);

			if (state == 0) {
				v++;
				if (v == 255)
					state = 1;
			}
			if (state == 1) {
				r--;
				if (r == 0)
					state = 2;
			}
			if (state == 2) {
				b++;
				if (b == 255)
					state = 3;
			}
			if (state == 3) {
				v--;
				if (v == 0)
					state = 4;
			}
			if (state == 4) {
				r++;
				if (r == 255)
					state = 5;
			}
			if (state == 5) {
				b--;
				if (b == 0)
					state = 0;
			}
			Color c = new Color(r, v, b);
			g2.setColor(c);

			// Draw star
			int inner = 10 + randy.nextInt(80);
			int outer = (int) (inner * 2 / (3 + Math.sqrt(5)));
			int radius[] = { outer, inner, outer, inner };
			int midX = 10 + randy.nextInt(990 - outer);
			int midY = 10 + randy.nextInt(640 - outer);
			int nPoints = 10;
			// int nPoints = 10;
			int max = nPoints;
			int[] X = new int[nPoints];
			int[] Y = new int[nPoints];

			double theta = randy.nextDouble();

			for (double current = 0.0; current < nPoints; current++) {
				int j = (int) current;
				theta += 2 * Math.PI / max;
				double a = Math.cos((theta)) * radius[j % 4];
				double b1 = Math.sin((theta)) * radius[j % 4];

				X[j] = (int) a + midX;
				Y[j] = (int) b1 + midY;
			}

			if (nPoints % 2 == 0) {
				g.fillPolygon(X, Y, nPoints);
				g.setColor(Color.BLACK);
				g.drawPolygon(X, Y, nPoints);
			}

			// Slow it down now y'all
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
