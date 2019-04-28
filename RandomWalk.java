import java.awt.*;
import java.applet.Applet;
import java.util.Random;
import java.util.Scanner;

public class RandomWalk extends Applet {

	public void paint(Graphics g) {
		Random randy = new Random();
		Scanner steve = new Scanner(System.in);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


		// circle
		g2.setColor(Color.black);
		System.out.println("how big do you want your circle? ");
		int dia = steve.nextInt();
		int radius = dia / 2;
		g2.drawOval(10, 10, dia, dia);

		// start
		int x = 10 + radius;
		int y = 10 + radius;
		int x2 = 10 + radius;
		int y2 = 10 + radius;
		int dist = (int) Math.sqrt((Math.pow((x2 - x), 2) + (Math.pow((y2 - y), 2))));

		// do it
		int moves = 0;


		// color
		
		int state = 0;
		int r = 255;
		int v = 0;
		int b = 0;
		while(dist <= radius){
			if(state == 0){
			    v++;
			    if(v == 255)
			        state = 1;
			}
			if(state == 1){
			    r--;
			    if(r == 0)
			        state = 2;
			}
			if(state == 2){
			    b++;
			    if(b == 255)
			        state = 3;
			}
			if(state == 3){
			    v--;
			    if(v == 0)
			        state = 4;
			}
			if(state == 4){
			    r++;
			    if(r == 255)
			        state = 5;
			}
			if(state == 5){
			    b--;
			    if(b == 0)
			        state = 0;
			}
			Color c = new Color(r, v, b);
			g2.setColor(c);
			int dir = randy.nextInt(4);
			if (dir == 0) {
				// up
				y2++;
			} else if (dir == 1) {
				// down
				y2--;
			} else if (dir == 2) {
				// left
				x2--;
			} else if (dir == 3) {
				// right
				x2++;
			}
			g2.drawOval(x2, y2, 1, 1);
			moves++;
			System.out.println(moves);
			dist = (int) Math.sqrt((Math.pow((x2 - x), 2) + (Math.pow((y2 - y), 2))));
			
			// Slow it down now y'all
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		}

	}




