
import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class DieSimulator extends Applet{
	
	public void paint(Graphics g) {
		
		Random randy = new Random();
		int die = 1 + randy.nextInt(6);
		System.out.println(die);
		
		
		if(die == 1){
			drawOne(g);	
		}
		else if(die == 2){
			drawTwo(g);
		}
		else if(die == 3){
			drawThree(g);
		}
		else if(die == 4){
			drawFour(g);
		}
		else if(die == 5){
			drawFive(g);	
		}
		else if(die == 6){
			drawSix(g);
		}
		
	}

	public static void drawOne(Graphics g) {
		//1 side of die
		g.drawRect(25, 25, 100, 100);
		g.fillOval(70, 70, 10, 10);

	}

	public static void drawTwo(Graphics g) {
		//2 side of die
		g.drawRect(25, 25, 100, 100);
		g.fillOval(90, 45, 10, 10);
		g.fillOval(50, 95, 10, 10);

	}

	public static void drawThree(Graphics g) {
		//3 side of die
		drawOne(g);
		drawTwo(g);
	}

	public static void drawFour(Graphics g) {
		//4 side of die
		drawTwo(g);
		g.fillOval(50, 45, 10, 10);
		g.fillOval(90, 95, 10, 10);
	}

	public static void drawFive(Graphics g) {
		//5 side of die
		drawFour(g);
		drawOne(g);
	}

	public static void drawSix(Graphics g) {
		//6 side of die
		drawFour(g);
		g.fillOval(50, 70, 10, 10);
		g.fillOval(90, 70, 10, 10);
	}


	}
	
