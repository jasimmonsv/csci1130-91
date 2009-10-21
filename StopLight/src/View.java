
/** 
* @View.java 
* Model for StopLight Project
* @Charlie Mulic, JA Simmons V
* @version 1.00 2009/10/7 
* 
* CSci 1130-91 Fall 2009 
* 
* Required / Create three Buttons
* Required / Draw traffic Light 
* Required / Events to turn on Green Light if user presses Go
* Required / Events to turn on Yellow Light if user presses Wait
* Required / Events to turn on Red Light if user presses Stop
* Include a Car Image
* Additional Features:
*  
*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JButton;

public class View
{
	public static String lightImgLocation;
	public static JButton stopBtn, waitBtn, goBtn;
	
	public static void setupMainPanel()
	{
		StopLight.mainPanel.setLayout(new FlowLayout()); // set the layout for positioning
		//build buttons
		goBtn = new JButton("Go"); // initialize goBtn
		stopBtn = new JButton("Stop"); // initialize stopBtn
		waitBtn = new JButton("Wait"); //initialize waitBtn
		//add listeners
		stopBtn.addActionListener(StopLight.handler); // have stopBtn listen for a click
		waitBtn.addActionListener(StopLight.handler); //have waitBtn listen for click
		goBtn.addActionListener(StopLight.handler); // have goBtn listen for a click
		//add to controlling panel
		StopLight.mainPanel.add(stopBtn); // add stopBtn to the screen
		StopLight.mainPanel.add(waitBtn); //add waitBtn to the screen
		StopLight.mainPanel.add(goBtn); // add goBtn to the screen		
	}//end method setupButtons */
	
	/*
	 * @param graphics object
	 * @param startX where the stripe will begin
	 * @param startY where the stripe will begin
	 * @param lineLength how long the dashed stripe will be
	 * @param stripeWidth how long each individal stripe will be
	 * 
	 * This method will loop through drawing a straight line of dashed lines until
	 * the lineLength condition is met.
	 */
	public static void drawMiddleStripe(Graphics g, int startX, int startY, int lineLength, int stripeWidth)
	{
		g.setColor(Color.yellow);
		for ( int x = startX; x < lineLength; x += stripeWidth*2 )
		{
			g.fillRect(x, startY, stripeWidth, 10);
		}
		g.setColor(Color.black);
	}//end method drawMiddleStripe */
	
}//end Class View */
