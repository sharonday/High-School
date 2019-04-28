
// Lab04
// The AWT Graphics Program
// This is the student, starting version of the AWT Graphics Program.

import java.awt.*;
import java.applet.*;

public class AWTGraphics extends Applet {

	public void paint(Graphics g) {

		// DRAW CUBE

		g.drawRect(25, 25, 100, 100);
		g.drawRect(50, 50, 100, 100);
		g.drawLine(25, 25, 50, 50);
		g.drawLine(125, 25, 150, 50);
		g.drawLine(25, 125, 50, 150);
		g.drawLine(125, 125, 150, 150);

		// DRAW SPHERE
		// Now inside the cube..

		g.drawOval(37, 37, 100, 100);
		g.drawOval(37, 50, 100, 75);
		g.drawOval(37, 63, 100, 50);
		g.drawOval(37, 75, 100, 25);
		g.drawOval(50, 37, 75, 100);
		g.drawOval(62, 37, 50, 100);
		g.drawOval(75, 37, 25, 100);

		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE

		// Outside Circle
		g.drawOval(375, 25, 150, 150);

		// Triangle
		g.drawLine(450, 25, 525, 100);
		g.drawLine(450, 25, 415, 165);
		g.drawLine(415, 165, 525, 100);

		// Inside Circle
		g.drawOval(434, 59, 69, 68);

		// DRAW MAMS (or your own block initials)

		// M
		g.fillRect(50, 200, 25, 125);
		g.fillRect(75, 225, 25, 25);
		g.fillRect(100, 250, 25, 25);
		g.fillRect(125, 225, 25, 25);
		g.fillRect(150, 200, 25, 125);

		// A
		g.fillRect(200, 200, 25, 125);
		g.fillRect(225, 200, 25, 25);
		g.fillRect(225, 250, 25, 25);
		g.fillRect(250, 200, 25, 125);

		// M
		g.fillRect(300, 200, 25, 125);
		g.fillRect(325, 225, 25, 25);
		g.fillRect(350, 250, 25, 25);
		g.fillRect(375, 225, 25, 25);
		g.fillRect(400, 200, 25, 125);

		// S
		g.fillRect(450, 200, 25, 75);
		g.fillRect(475, 200, 50, 25);
		g.fillRect(475, 250, 50, 25);
		g.fillRect(500, 275, 25, 50);
		g.fillRect(450, 300, 50, 25);

		// DRAW PACMEN FLOWER
		g.fillArc(75, 425, 100, 100, 225, 270);
		g.fillArc(137, 360, 100, 100, 135, 270);
		g.fillArc(137, 490, 100, 100, 315, 270);
		g.fillArc(200, 425, 100, 100, 45, 270);

	}
}