
// LineArt.java
// Student version of the Lab06 Line Art Graphics Program assignment.
import java.awt.*;
import java.util.Random;
import java.applet.*;

public class LineArt extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {

		int borderx = 10;
		int bordery = 10;
		int width = 980;
		int height = 630;

		for (int i = 0; i < 15; i++) {
			drawMagic(g, borderx, bordery, width, height);
			width = width / 2;
			height = height / 2;
			borderx = width / 2 + borderx;
			bordery = height / 2 + bordery;
		}
	}

	public void drawMagic(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
		int hstep = 9;
		// int wstep = (hstep * width) / height;
		// double wstep = ((double) hstep * width) / height;
		int wstep = 14;
		int n = (int) (width / wstep);
		int m = height / hstep;

		Random randy = new Random();
		int r = 0;
		int v = 0;
		int b = 0;

		// Draw bottom-right corner
		for (int i = 1; i <= n && i < m; i++) {
			r = randy.nextInt(256);
			v = randy.nextInt(256);
			b = randy.nextInt(256);
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.drawLine(width + x, y + (i * hstep), width + x - (int) (i * wstep), height + y);
			System.out.println(i);
		}

		// Draw bottom-left corner
		for (int i = 1; i <= n && i < m; i++) {
			r = randy.nextInt(256);
			v = randy.nextInt(256);
			b = randy.nextInt(256);
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.drawLine(x, y + (i * hstep), x + (int) (i * wstep), height + y);
		}

		// Draw top-left corner
		for (int i = 1; i <= n && i < m; i++) {
			r = randy.nextInt(256);
			v = randy.nextInt(256);
			b = randy.nextInt(256);
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.drawLine(x, y + (i * hstep), width + x - (int) (i * wstep), y);
		}

		// Draw top-right corner
		for (int i = 1; i <= n && i < m; i++) {
			r = randy.nextInt(256);
			v = randy.nextInt(256);
			b = randy.nextInt(256);
			Color c = new Color(r, v, b);
			g.setColor(c);
			g.drawLine(width + x, y + (i * hstep), x + (int) (i * wstep), y);
		}

	}
}