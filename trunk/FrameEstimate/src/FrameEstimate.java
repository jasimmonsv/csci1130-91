/**
 * @(#)FrameEstimate.java
 *
 * FrameEstimate Applet application
 *
 * @author J.A. Simmons V, Wes Strand, Rinku Malhotra, Bach Dang
 * @version 1.00 2009/9/16
 */
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.applet.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class FrameEstimate extends Applet implements ActionListener
{	
	//***************declarations**************
	double woodCost = 2.50; //cost of frame wood
	double cardCost = 1.50; //cost of the backing card
	double glassCost = 5.50; //cost of glass
	double photoLength = 24; //length of photo
	double photoWidth = 12; //width of photo
	double frameWidth, frameLength, cardLength, cardWidth, glassLength, 
		glassWidth, totalFrame,totalGlass, totalCard;//Calculations
	JLabel messageLabel;
	JTextArea wPhoto, lPhoto;
	JButton btSubmit;
	String txtLPhoto, txtWPhoto;
	int intLPhoto, intWPhoto;
	//*************End Declarations************
	
	public void init()
	{
		messageLabel = new JLabel("Enter the dimentions of your photo: ");
		wPhoto = new JTextArea(5,5);
		lPhoto = new JTextArea(5,5);
		btSubmit = new JButton("Submit");
		btSubmit.addActionListener( this );
		add( messageLabel ); add( wPhoto ); add( lPhoto ); add( btSubmit );
	}//end method init
	
	public void actionPerformed( ActionEvent ae)
	{
		Object src = ae.getSource();
		if(src == btSubmit)
		{
			txtLPhoto = lPhoto.getText();
			txtWPhoto = wPhoto.getText();
			int intLPhoto = Integer.parseInt(txtLPhoto.trim());
			int intWPhoto = Integer.parseInt(txtWPhoto.trim());
			CostOfFraming()
		}
	}//end method actionPerformed
	public double CostOfFraming(double frame, double glass, double card)
	{
		double totalCost=0;
		totalCost = frame*woodCost+glass*glassCost+card*cardCost;
		return totalCost;
	}//end method CostOfFraming

	public double frameCalculate()
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
	}//end method frameCalculate
/*	public void paint(Graphics g) 
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
		Formatter formatter = new Formatter();
		formatter.format("Cost of picture frame : $%(.2f", CostOfFraming(totalFrame, totalGlass, totalCard));
	//	g.drawString(formatter.toString(), 10, 60 );
		
	}//End method paint
	*/
	
}//end class FrameEstimate