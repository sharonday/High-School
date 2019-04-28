import java.awt.*;
import java.util.Random;

public class Raindrop {
	Random randy = new Random();

	// data
	private int dia, x, radius;
	private int y = -randy.nextInt(800);
	private Color c;
	private int speed;
	private int z = randy.nextInt(101);

	// constructors

	public Raindrop(Color newc) {
		c = newc;
		x = randy.nextInt(1000);
		if (z < 60) {
			radius = 2 + randy.nextInt(3);
			speed = radius;
			dia = 2 * radius;
		} else if (z > 99) {
			radius = 7 + randy.nextInt(4);
			speed = radius;
			dia = 2 * radius;
		} else {
			radius = 4 + randy.nextInt(6);
			speed = radius;
			dia = 3 * radius;
		}

	}

	// methods

	public void show(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Draw circle
		g.setColor(c);
		g2.fillOval(x, y, radius, dia);

	}

	public void fall() {
		y = y + speed;
		if (y > 650) {
			y = -randy.nextInt(400);
		}

	}

}
