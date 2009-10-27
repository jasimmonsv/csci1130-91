/**
 * @author J.A. Simmons V
 * @version 1.0 21Oct2009
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.Toolkit;

public class MilkyWay extends JApplet
{
	int MAX_DIMTR=100;
	int MAX_PLANETS=100;
	private final Random randomNumber = new Random((int) (Math.random()*10+1));
	private final int SCREEN_WIDTH=700;
	private final int SCREEN_HEIGTH=500;
	
	public void paint(Graphics g)
	{
		g.fillRect(0, 0, 800, 600);
		g.setColor(Color.white);
		for (int i=1; i<=MAX_PLANETS*3; i++) g.fillOval(randomNumber.nextInt(SCREEN_WIDTH+100), randomNumber.nextInt(SCREEN_HEIGTH+100), 2,2 );
		for (int i=1;i<=MAX_PLANETS;i++)
		{
			paintPlanet( g );
		}
	}//end paint method */

	private void paintPlanet(Graphics g)
	{
		int dimtr = randomNumber.nextInt( MAX_DIMTR );	
		g.setColor(new Color( randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255) ));//set a random color and alpha for the planets
		g.fillOval(randomNumber.nextInt(SCREEN_WIDTH), randomNumber.nextInt(SCREEN_HEIGTH), dimtr,dimtr ); //draw the planet of random width and heigth
	}//end paintPlanet Method */
}//end MilkyWay Class */
