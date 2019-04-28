
// Lab11.java
// This is the Student Version of the Disappearing Squares assignment.
import java.awt.*;
import java.util.Random;
import java.applet.*;

public class Lab11 extends Applet {

	public void paint(Graphics g) {
		drawSquare(g, 0, 100, 200);
		drawSquare2(g, 800, 400, 200);

	}

	public void drawSquare(Graphics g, int x, int y, int len) {
		Random randy = new Random();
		if (x <= 1000 && len > 4) {
			int r = randy.nextInt(256);
			int b = randy.nextInt(256);
			int v = randy.nextInt(256);			
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.fillRect(x, y, len, len);
			g.setColor(Color.black);
			g.drawRect(x, y, len, len);
			x = x + 10 + len;
			y = (int) (y + Math.ceil(0.25 * len));
			len = (int) Math.ceil(0.75 * len);
			drawSquare(g, x, y, len);

		}
	}

	public void drawSquare2(Graphics g, int x, int y, int len) {

		Random randy = new Random();
		if (x >= 0 && len > 4) {
			int r = randy.nextInt(256);
			int b = randy.nextInt(256);
			int v = randy.nextInt(256);
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.fillRect(x, y, len, len);
			g.setColor(Color.black);
			g.drawRect(x, y, len, len);
			len = (int) Math.ceil(0.75 * len);
			x = x - 10 - len;
			drawSquare2(g, x, y, len);

		}
	}
}