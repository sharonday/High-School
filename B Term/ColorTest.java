import java.applet.Applet;
import java.awt.*;

public class ColorTest extends Applet {
	public void paint(Graphics g) {
		int state = 0;
		int r = 255;
		int v = 0;
		int b = 0;
		for(int i = 0; i<256;i++){
			for(int j =0; j<256;j++){
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
				g.setColor(c);
				g.fillRect(5*i, 5*j, 5, 5);
			}
		}
			
			g.setColor(Color.white);
			g.drawRect(0, 0, 256, 256);
		}
	}


