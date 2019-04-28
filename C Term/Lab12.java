
// Lab12.java
// The student, starting version of The Square Fractal assignment.
import java.awt.*;
import java.util.Random;
import java.applet.*;

public class Lab12 extends Applet {

	public void paint(Graphics g) {
		Random randy = new Random();
		int r = 71 + randy.nextInt(185);
		int v = 211 + randy.nextInt(45); 
		int b = 175 + randy.nextInt(71);
		Color c = new Color(r, v, b);
		drawSquare1(g, 1024, 768, c);
	}

	public void drawSquare1(Graphics g, int maxX, int maxY, Color c) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2);
		int tlY = midY - (startHeight / 2);
		g.setColor(c);
		g.fillRect(tlX, tlY, startWidth, startHeight);
		g.setColor(Color.black);
		g.drawRect(tlX, tlY, startWidth, startHeight);
		topLeft(g, tlX, tlY, startWidth, startHeight, c);
		topRight(g, tlX, tlY, startWidth, startHeight, c);
		botLeft(g, tlX, tlY, startWidth, startHeight, c);
		botRight(g, tlX, tlY, startWidth, startHeight, c);
	}

	public void topLeft(Graphics g, int x, int y, int wid, int height, Color c) {
		if (wid > 1 && height > 1) {
			delay(1000);
			int r = c.getRed()-10;
			int v = c.getGreen()-30;
			int b = c.getBlue()-25;
			c = new Color(r, v, b);
			g.setColor(c);
			wid = wid / 2;
			height = height / 2;
			x -= wid;
			y -= height;
			g.fillRect(x, y, wid, height);
			g.setColor(Color.black);
			g.drawRect(x, y, wid, height);
			topLeft(g, x, y, wid, height, c);
			topRight(g, x, y, wid, height, c);
			botLeft(g, x, y, wid, height, c);
			//botRight(g, x, y, wid, height, c);
		}
	}

	public void topRight(Graphics g, int x, int y, int wid, int height, Color c) {
		if (wid > 1 && height > 1) {
			delay(1000);
			int r = c.getRed()-10;
			int v = c.getGreen()-30;
			int b = c.getBlue()-25;
			c = new Color(r, v, b);
			g.setColor(c);
			x += wid;
			wid = wid / 2;
			height = height / 2;
			y -= height;
			g.fillRect(x, y, wid, height);
			g.setColor(Color.black);
			g.drawRect(x, y, wid, height);
			topRight(g, x, y, wid, height, c);
			//botLeft(g, x, y, wid, height, c);
			topLeft(g, x, y, wid, height, c);
			botRight(g, x, y, wid, height, c);
		}
	}

	public void botLeft(Graphics g, int x, int y, int wid, int height, Color c) {
		if (wid > 1 && height > 1) {
			delay(1000);
			int r = c.getRed()-10;
			int v = c.getGreen()-30;
			int b = c.getBlue()-25;
			c = new Color(r, v, b);
			g.setColor(c);
			y += height;
			wid = wid / 2;
			height = height / 2;
			x -= wid;
			g.fillRect(x, y, wid, height);
			g.setColor(Color.black);
			g.drawRect(x, y, wid, height);
			botLeft(g, x, y, wid, height, c);
			//topRight(g, x, y, wid, height, c);
			topLeft(g, x, y, wid, height, c);
			botRight(g, x, y, wid, height, c);
		}
	}

	public void botRight(Graphics g, int x, int y, int wid, int height, Color c) {
		if (wid > 1 && height > 1) {
			delay(1000);
			int r = c.getRed()-10;
			int v = c.getGreen()-30;
			int b = c.getBlue()-25;
			c = new Color(r, v, b);
			g.setColor(c);
			x += wid;
			y += height;
			wid = wid / 2;
			height = height / 2;
			g.fillRect(x, y, wid, height);
			g.setColor(Color.black);
			g.drawRect(x, y, wid, height);
			botRight(g, x, y, wid, height, c);
			botLeft(g, x, y, wid, height, c);
			topRight(g, x, y, wid, height, c);
			//topLeft(g, x, y, wid, height, c);
		}
	}

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}
