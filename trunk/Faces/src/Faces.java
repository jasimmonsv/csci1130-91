/**
 * @author J.A. Simmons V
 * @version 0.1 27Oct2009
 * http://jasimmonsv.com/code.html
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Faces extends JApplet implements ActionListener
{
	public void paint(Graphics g)
	{
		happyFace(g,locate(100),locate(100));
		sadFace(g,locate(100),locate(100));type filter text
		
	}//end method paint */
	
	private void happyFace(Graphics g, int x, int y)
	{
		g.setColor(Color.yellow);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(Color.black);
		g.fillArc(x+25, y+20, 15, 15, 0, 360);//Draw eye 1
		g.fillArc(x+60, y+20, 15, 15, 0, 360);//draw eye 2
		g.drawArc(x+20, y+55, 60, 20, 0, -190);
	}//end method happyFace */
	
	private void sadFace(Graphics g, int x, int y)
	{
		g.setColor(Color.blue);
		g.fillArc(x, y, 100, 100, 0, 360);
		g.setColor(Color.black);
		g.fillArc(x+25, y+20, 15, 15, 0, 360);//Draw eye 1
		g.fillArc(x+60, y+20, 15, 15, 0, 360);//draw eye 2
		g.drawArc(x+20, y+55, 60, 20, 0, 190);
	}//end method sadFace */
	
	private int locate(int maxNum)
	{
		Random rand = new Random();
		int rndResult = rand.nextInt(maxNum);
		return rndResult;
	}//end method locate */

}
