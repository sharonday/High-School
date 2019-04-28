import java.awt.*;
import java.applet.Applet;
import java.util.Random;
import java.util.Scanner;

public class Rain extends Applet {

	Random randy = new Random();
	Raindrop[] drops = new Raindrop[2000];
	Graphics bufferGraphics;
	Image offscreen;
	Dimension dim;

	public void init() {

		dim = getSize();
		offscreen = createImage(dim.width, dim.height);
		bufferGraphics = offscreen.getGraphics();
	}

	public void paint(Graphics g) {

		for (int i = 0; i < drops.length; i++) {
			// Random color
			int r = randy.nextInt(50);
			int v = randy.nextInt(25);
			int b = randy.nextInt(256);
			int a = randy.nextInt(100);
			//Color c = new Color(0, v, b, a);
			 Color c = new Color(255, 255, 255);
			drops[i] = new Raindrop(c);
			System.out.println("hi");

		}
		drop(g);
	}

	public void drop(Graphics g) {
		int j = 0;
		for (int i = 0; i < drops.length; i++) {
			drops[i].show(bufferGraphics);
		}
		Color d = new Color(57, 50, 100, 100);
		// Color d = new Color(255,255, 255);
		while (j == 0) {
			bufferGraphics.setColor(d);
			bufferGraphics.fillRect(0, 0, dim.width, dim.width);
			for (int i = 0; i < drops.length; i++) {
				drops[i].fall();
				drops[i].show(bufferGraphics);
			}
			g.drawImage(offscreen, 0, 0, this);
			delay(8);
		}

	}

	public void delay(int n) {
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();
	}

}
