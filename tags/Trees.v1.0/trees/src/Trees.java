/**
 * @author J.A. Simmons V
 * @version 1.0 29 Sep 2009
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Trees extends JApplet
{
	public void paint ( Graphics g )
	{
		int width = getWidth();
		int heigth = getHeight();
		super.paint( g );		
		Random random = new Random();
		//dTree(g, 100,100,30);
		setupBackground(g, width, heigth);
		for (int i=0; i<100;i++){
			simpleTree(g,random.nextInt(width),random.nextInt(heigth/2)+heigth/3,random.nextInt(50)+20);
		}
	}//end method paint */
	
	/*private void dTree (Graphics g, int xCoord, int yCoord, int size) 
	{
		drawTrunk(g,xCoord, yCoord,size);
	}//end method dTree */
	
	private void setupBackground( Graphics g, int width, int heigth )
	{
		
		g.setColor(new Color(0x32,0x99,0xcc));
		g.fillRect( 0, 0, width, heigth);
		g.setColor(new Color(0x2f,0x4f,0x2f));
		g.fillRect( 0,heigth/3, width, heigth);
	}//end method setupBackground

	private void drawTrunk(Graphics g, int xCoord, int yCoord, int size)
	{
		for (int i=0; i<(size/3);i++)//draw main trunk
		{
			g.drawLine( xCoord+i, yCoord, xCoord+i, yCoord-size);
		}
		for (int i=0; i<7;i++)//draw roots
		{
			g.drawLine( xCoord-(size/10), yCoord+(size/5), xCoord+i, yCoord-(size/2));			
		}
	}//end method drawTrunk */
	
	private void dTree(Graphics g, int xCoord, int yCoord, int branches)
	{
		
		g.drawLine( xCoord, yCoord, yCoord, yCoord-30);
		int x1=xCoord; int y1=yCoord-30;
		double x2=Math.sin(x1);
		g.drawLine(x1, y1, (int)x2,(int)Math.sin(y1));
		
	}//end method dTree */
	
	private void simpleTree(Graphics g, int xCoord, int yCoord, int size)
	{
		Random random = new Random();
		Color[] treeColors={
				new Color(0x00,0xFF,0x7F),
				new Color(0x6b,0x8e,0x23),
				new Color(0x21,0x5e,0x21),
				new Color(0x42,0x6f,0x42),
				new Color(0x23,0x8e,0x23),
				new Color(0x32,0xcd,0x32),
				new Color(0x7f,0xff,0x00)
				};
		g.setColor(new Color(0x97,0x69,0x4f));//draw Trunk
		g.fillRect(xCoord,yCoord,size/5,size);
		g.setColor(treeColors[random.nextInt(treeColors.length)]);
		g.fillOval(xCoord-size/2, yCoord-size, size, size);
		g.fillOval(xCoord-size/2-15, yCoord-size+10, size, size);
		g.fillOval(xCoord-size/2-5, yCoord-size+20, size, size);
		g.fillOval(xCoord-size/2+5, yCoord-size+20, size, size);
		g.fillOval(xCoord-size/2+15, yCoord-size+10, size, size);
		g.setColor(Color.black);
	}//end method simpleTree */
}//end class Trees */
