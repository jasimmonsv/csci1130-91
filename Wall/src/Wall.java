/**
 * 
 * @author J.A. Simmons V
 * @version 1.0 28Oct 2009
 * 
 * This program will build a wall that is offset at every other row.
 */
import java.awt.Graphics;
import javax.swing.*;


public class Wall extends JApplet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6737867818191964598L;
	int MAX_BRICK_WIDTH = 200;
	int MAX_BRICK_HEIGHT = 30;
	int x,y;

	
	public void paint(Graphics g)
	{
		y=0;
		
		for (int j=0;y<this.getHeight();j++)//for loop to create a new row
		{
			x=0;
			if (j%2 == 1)x-=63;//to offset every other row
			for (int i=0;x<this.getWidth();i++)//for loop to create each brick in a row
			{
				if(i%4 == 3 || i%4 == 2) //to create the structure strengthening horz bricks. <wall building BS>
					{
						drawBrick(g,x,y,50,50);
						x+=50+5;
					}//end if
				else
				{
					drawBrick(g,x,y,100,50);
					x+=100+5;
				}//end else
			}//end row for loop */
			y+=50+5;
		}//end height for loop */
		
	}//end paint method */
	
	/**
	 * 
	 * @param	g	Graphics object to draw to.
	 * @param	x	x position of the brick
	 * @param	y	y position of the brick
	 * @param	width	Width of the brick
	 * @param	height	Height of the brick
	 */
	private void drawBrick(Graphics g, int x, int y, int width, int height)
	{
			g.fillRect(x,y,width, height);
	}//end drawBrick Method */}
}//end Wall class */
