/**
 * @author J.A. Simmons V
 * @version 1.0  21Sep2009
 * House project
 */

import javax.swing.*;
import java.awt.*;

public class House extends JApplet
{
	//Window method that will draw a more complex window given the starting position and the length and width desired 
	public void window(Graphics g, int xCoord, int yCoord, int wWin, int lWin)
	{
		//initalize method variables
		int halfLength = lWin/2;
		int halfWidth = wWin/2;
		int lSlat=5; 
		if ((wWin/10) < 10 )lSlat=wWin/20;
		
	    //Draw the frame
		g.setColor( new Color(0xAF, 0x40,0x35)); //Light brown color
		g.fillRect(xCoord, yCoord, wWin, lWin);
		//Draw the panes of glass
		g.setColor( new Color(0xAD, 0xD8, 0xE6) ); //Light Blue color
		g.fillRect(xCoord+lSlat, yCoord+lSlat, wWin-(2*lSlat), lWin-(2*lSlat));//Draw Vertical Slat
		g.setColor( new Color(0xAF, 0x40,0x35)); //Back to light brown
 		g.fillRect(xCoord+halfWidth-lSlat, yCoord, lSlat*2, lWin);
		g.fillRect(xCoord, yCoord+halfLength-lSlat, wWin, lSlat*2);
	}//end method window
	
	public void door(Graphics g, int xCoord, int yCoord, int wDoor, int lDoor)
	{
		//Initialize method variables
		int midWidth = wDoor/2;
		int midLength = lDoor/2;
		int lSlat=10;
		if ((lDoor/10) < 5 )lSlat=lDoor/20;
		
		//Draw the door
		g.setColor( new Color(0xAF, 0x40,0x35)); //Light brown color
		g.fillRect(xCoord, yCoord, wDoor, lDoor);//Door Frame
		g.setColor(Color.black);
		g.drawRect(xCoord+lSlat, yCoord+lSlat, midWidth-lSlat, midLength-lSlat);//top left inset
		g.drawRect(xCoord+lSlat, yCoord+midLength+lSlat, midWidth-lSlat, midLength-(2*lSlat));//bottom left inset
		g.drawRect(xCoord+midWidth+2, yCoord+lSlat, midWidth-lSlat-2, (midLength-lSlat));//top right inset
		g.drawRect(xCoord+midWidth+2, yCoord+midLength+lSlat, midWidth-lSlat-2, midLength-(2*lSlat));//bottom left inset
		g.fillArc(xCoord+1, yCoord+midLength, 10, 10, 0, 360);
	}//end method door
	
	public void gDoor(Graphics g, int xCoord, int yCoord, int wDoor, int lDoor)
	{
		//Initialize method variables
		int ySlat = yCoord+10;
		
		//Draw the door
		//Left Garage Door
		g.setColor(new Color(0xFF,0xFF,0x99));//light tan
		g.fillRect(xCoord, yCoord, wDoor, lDoor);
		g.setColor(Color.black);
		for (int i=10; ySlat<=yCoord+lDoor; i++)
		{
			g.drawLine(xCoord, ySlat, xCoord+wDoor, ySlat);
			ySlat=ySlat+20;
		}//end door For loop
		//Right Garage Door
		g.setColor(new Color(0xFF,0xFF,0x99));//light tan
		g.fillRect(xCoord+wDoor+10, yCoord, wDoor, lDoor);
		ySlat = yCoord+10;
		g.setColor(Color.black);
		for (int i=10; ySlat<=yCoord+lDoor; i++)
		{
			g.drawLine(xCoord+wDoor+10, ySlat, xCoord+(2*wDoor)+10, ySlat);
			ySlat=ySlat+20;
		}//end door for loop
	}//end method gDoor
	
	public void paint(Graphics g)
	{
		int[] xValues = {130,670,550,250};
		int[] yValues = {151,151,80,80};
	  //super.paint(g);
		g.setColor(new Color(0xFF,0xCC,0x33));
		g.fillRect(150,150,500,150);
		window(g, 170, 180, 50, 85);
		window(g, 350, 180, 50, 85);
		door(g, 265, 180, 50, 115);
		gDoor(g, 430,180, 100, 120);
		Polygon roof = new Polygon (xValues,yValues, 4);
		g.setColor(Color.LIGHT_GRAY);
		g.fillPolygon(roof);
		g.setColor(Color.black);
		g.drawString("1234 Main", 580, 170);
	}//end method paint
}//end class House
