package src;

/**
 * 
 * @author J.A. Simmons V, Wes Strand, Rinku Malhotra, Bach Dang
 * @version 1.0 16 Sep 2009
 *
 */
import java.awt.*;
import javax.swing.*;

public class Carpet extends JApplet
{
	//*********************Declarations*********************************
	int lengthCarpet = 25; //in feet
	int widthCarpet = 40; //in feet
	int totalSize = 0; //in yards
	double totalPrice = 0; //in dollars
	double priceCarpet = 12.42; //Per sq yard. - ***NOTE***->9 sq ft. in a sq yard
	//*******************End Declarations*******************************
	
	public void paint(Graphics g)
	{
		
		totalSize = (lengthCarpet * widthCarpet)/9;
		totalPrice = (totalSize*priceCarpet);
		g.drawString("Your size of your carpet will be:   " + totalSize + " sq. yards",10,50);
		g.drawString("The price of your carpet will be: $" + totalPrice, 10, 70 );
		Image img = getImage( getCodeBase(), "./carpetSample.jpg");
		g.drawImage(img, 10, 100,100,100, this);
		
	}//end method Paint
}//end class Carpet
