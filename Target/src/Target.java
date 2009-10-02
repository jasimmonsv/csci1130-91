/**
 * Target Assignment - CSci 1130-91
 * 
 * @author J.A. Simmons V
 * @date 09/14/2009
 * 
 */
import java.awt.*;
import java.applet.*;

public class Target extends Applet {
	
		public void paint (Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(175, 175, 300, 300 );
		g.setColor(Color.BLACK);
		g.drawString("5", 320,193);
		g.setColor(Color.white);
		g.fillOval(200, 200, 250, 250 );
		g.setColor(Color.BLACK);
		g.drawString("6", 320, 216);
		g.setColor(Color.red);
		g.fillOval(225, 225, 200, 200 );
		g.setColor(Color.BLACK);
		g.drawString("7", 320, 242);
		g.setColor(Color.white);
		g.fillOval(250, 250, 150, 150 );
		g.setColor(Color.BLACK);
		g.drawString("8", 320, 267);
		g.setColor(Color.red);
		g.fillOval(275, 275, 100, 100 );
		g.setColor(Color.BLACK);
		g.drawString("9", 320, 295);
		g.setColor(Color.white);
		g.fillOval(300, 300, 50, 50 );
		g.setColor(Color.BLACK);
		g.drawString("10", 318, 330);
		
	}//End method paint
}//end class Target
