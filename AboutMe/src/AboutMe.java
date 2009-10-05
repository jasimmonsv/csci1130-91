/**
 * @(#)AboutMe.java
 *
 * AboutMe Applet application
 *
 * @author J.A. Simmons V
 * @version 1.00 2009/9/12
 */

import java.awt.*;
import java.applet.*;

public class AboutMe extends Applet 
{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		
		Image img = getImage( getCodeBase(), "./JABluebonnets.JPG");
		Font small = new Font("Serif", Font.PLAIN, 8);
		Font medium = new Font("Serif", Font.ITALIC, 12);
		Font large = new Font("Serif", Font.PLAIN, 25);
		
		g.setColor(Color.blue);
		g.drawString("James A Simmons V", 220, 350 );
		
		g.setFont(large);
		g.setColor(Color.red);
		g.drawString("Simmons", 220, 380 );
		
		g.setFont(medium);
		g.setColor(Color.CYAN);
		g.drawString("jsimmons", 220, 400 );
		
		g.setColor(Color.black);
		g.setFont(small);
		g.drawString("Circumnavigated the Globe in the Navy", 220, 410 );
		
		g.drawImage(img, 0, 0, 550,309,this);
		
	}//end method paint
}//end class AboutMe

