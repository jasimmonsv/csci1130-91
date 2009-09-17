/**
 * @(#)FrameEstimate.java
 *
 * FrameEstimate Applet application
 *
 * @author J.A. Simmons V, Wes Strand, Rinku Malhotra, Bach Dang
 * @version 1.00 2009/9/16
 */
 
import java.awt.*;
import java.applet.*;

public class FrameEstimate extends Applet {
	
	//***************declarations**************
	double woodCost = 2.50; //cost of frame wood
	double cardCost = 1.50; //cost of the backing card
	double glassCost = 5.50; //cost of glass
	double photoLength = 24; //length of photo
	double photoWidth = 12; //width of photo
	double frameWidth, frameLength, cardLength, cardWidth, glassLength, 
		glassWidth, totalFrame,totalGlass, totalCard;//Calculations
	//*************End Declarations************
	
	public double CostOfFraming(double frame, double glass, double card)
	{
		double totalCost=0;
		totalCost = frame*woodCost+glass*glassCost+card*cardCost;
		return totalCost;
	}//end method CostOfFraming

	public void paint(Graphics g) 
	{
		frameWidth = photoWidth + 6;
		frameLength = photoLength + 6;
		cardLength = photoLength + 5.5;
		cardWidth = photoWidth + 5.5;
		glassLength = cardLength;
		glassWidth = cardWidth;
	//Calculate dimensions for the Frame, Glass, and Card.
		totalFrame = (frameWidth*frameLength)/24 - (photoLength*photoWidth)/24;
		totalGlass = (glassLength*glassWidth)/24;
		totalCard = (cardLength*cardWidth)/12;
	//Display
		g.drawString("Cost of picture frame: " + CostOfFraming(totalFrame, totalGlass, totalCard), 10, 60 );
		
	}//End method paint
}//end class FrameEstimate