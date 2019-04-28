import java.applet.Applet;
import java.awt.Graphics;

public class DieTester extends Applet{
	
	public void paint(Graphics g) {
		
		// Drawing 1
				g.drawRect(25, 25, 100, 100);
				g.fillOval(70, 70, 10, 10);

				// Drawing 2
				g.drawRect(25, 25, 100, 100);
				g.fillOval(90, 45, 10, 10);
				g.fillOval(50, 95, 10, 10);

				// Drawing 3
				g.drawRect(25, 25, 100, 100);
				g.fillOval(50, 45, 10, 10);
				g.fillOval(70, 70, 10, 10);
				g.fillOval(90, 95, 10, 10);

				// Drawing 4
				g.drawRect(25, 25, 100, 100);
				g.fillOval(50, 45, 10, 10);
				g.fillOval(50, 95, 10, 10);
				g.fillOval(90, 45, 10, 10);
				g.fillOval(90, 95, 10, 10);

				// Drawing 5
				g.drawRect(25, 25, 100, 100);
				g.fillOval(70, 70, 10, 10);
				g.fillOval(90, 45, 10, 10);
				g.fillOval(50, 95, 10, 10);
				g.fillOval(50, 45, 10, 10);
				g.fillOval(90, 95, 10, 10);
				
				// Drawing 6
				g.drawRect(25, 25, 100, 100);
				g.fillOval(50, 45, 10, 10);
				g.fillOval(50, 70, 10, 10);
				g.fillOval(50, 95, 10, 10);
				g.fillOval(90, 45, 10, 10);
				g.fillOval(90, 70, 10, 10);
				g.fillOval(90, 95, 10, 10);

	}
}
