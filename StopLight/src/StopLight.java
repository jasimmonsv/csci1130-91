/** 
* @StopLight.java 
* Model for StopLight Project
* @author JA Simmons V
* @version 1.00 2009/10/7 
* 
* CSci 1130-91 Fall 2009 
* 
* COMPLETE Create three Buttons
* COMPLETE Draw traffic Light 
* COMPLETE Events to turn on Green Light if user presses Go
* COMPLETE Events to turn on Yellow Light if user presses Wait
* COMPLETE Events to turn on Red Light if user presses Stop
* COMPLETE Include a Car Image
* Additional Features:
*  XTRA animate a car according to the traffic light
*  XTRA include sounds for the button presses
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StopLight extends JApplet implements ActionListener
{
	/**
	 * Declarations
	 */
	private static final long serialVersionUID = -8667465455765597738L;
	public static JPanel mainPanel;
	public static ButtonHandler handler;
	public Image img, offscreen, redCar;
	Graphics offscreenGRP; //declare Offscreen graphic object
	Timer timer; //declare time for yellow light
	int DELAY = 2400; //init delay for timer

	public void init()
	{
		handler = new ButtonHandler(); //action handler
		setSize(750,400); // set the size of the applet
		timer = new Timer(DELAY, handler); //init timer
		mainPanel = new JPanel(); //init main panel
		View.setupMainPanel(); //function to set up buttons
		offscreen = createImage(750, 400); //setup offscreen graphics
		offscreenGRP = offscreen.getGraphics(); //setup offscreen Graphics object
		add(mainPanel); //add main panel to app frame
		Controller.changeLight(1); //set default light position
		
	}// end method init */
	
	public void paint(Graphics g)
	{
		super.paint(g);
		img = getImage( getCodeBase(), View.lightImgLocation );
		redCar = getImage( getCodeBase(), "./redCar.gif");
		offscreenGRP.drawImage(img,625,0,this);
		offscreenGRP.setColor(Color.gray);
		offscreenGRP.fillRect(0, 200, 750, 110);
		offscreenGRP.setColor(Color.black);
		offscreenGRP.fillRect(0, 300, 750, 10);
		offscreenGRP.fillRect(0, 200, 750, 10);
		//draw middle stripe
		View.drawMiddleStripe(offscreenGRP,0, 250, 600, 20);
		View.drawMiddleStripe(offscreenGRP, 720, 250, 750, 20);
		//draw stopLines
		offscreenGRP.setColor(Color.white);
		offscreenGRP.fillRect(600, 250, 15, 50);
		offscreenGRP.fillRect(700, 210, 15, 50);
		offscreenGRP.setColor(Color.black);
		offscreenGRP.drawImage(redCar, 50, 240,this);//draw the car
		g.drawImage(offscreen, 0, 50, this);
		
	}//end method paint */
	
	private class ButtonHandler implements ActionListener
	{
		public void  actionPerformed (ActionEvent ae)
		{
			Object obj = ae.getSource();
			if (obj == View.goBtn)
			{
				if (Controller.changeLight(3)==false)
				{
					img = getImage(getCodeBase(), View.lightImgLocation);
				}//end if
			}//end goBtn button click */
			else if(obj == View.stopBtn)
			{
				if (Controller.changeLight(1)==false)
				{
					img = getImage(getCodeBase(), View.lightImgLocation);
				}//end if
			}//end stopBtn button clich */
			else if(obj == View.waitBtn)
			{
				if (Controller.changeLight(2)==false)
				{
					img = getImage(getCodeBase(), View.lightImgLocation);
					timer.start();
				}//end if
			}//end waitBtn click
			else if(obj == timer)
			{
				Controller.changeLight(1);
				img = getImage(getCodeBase(), View.lightImgLocation);
				timer.stop();
			}//end if timer
			repaint();
			return;
		}//end private method actionPerformed */
	}//end private class ButtonHandler*/
	
}//end class StopLight */
