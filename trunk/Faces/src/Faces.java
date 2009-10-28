/**
 * @author J.A. Simmons V
 * @version 1.0 27Oct2009
 * http://jasimmonsv.com/code.html
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Faces extends JApplet implements ChangeListener
{
	private static final long serialVersionUID = -1712015145302933827L;
	private JSlider numJSlider;
	private int numFaces;
	
	public void init()
	{
		numFaces = 3;//set default
		setLayout(new BorderLayout());
		numJSlider = new JSlider( SwingConstants.HORIZONTAL, 0, 50, 3 ); //max of 50, startout position @ 3
		numJSlider.setMajorTickSpacing( 5 );//create tick every 10
		numJSlider.setPaintTicks( true );//paint ticks on slider
		numJSlider.addChangeListener(this); //add ChangeListener
		add( numJSlider, BorderLayout.NORTH); //add numslider to frame
	}//end method init */
	
	public void paint(Graphics g)
	{
		super.paint(g); //paint over existing frame
		for (int i=1;i<=numFaces;i++) //loop to paint faces
		{
			happyFace(g,locate(700),locate(500)+30);
			sadFace(g,locate(700),locate(500)+30);
		}//end painting loop
		
	}//end method paint */
	
	/**
	 * happyFace method draws the happy face graphics
	 * 
	 * @param	g	graphics object passed
	 * @param	x	x position of happy face
	 * @param	y	y position of happy face
	 * 
	 */
	private void happyFace(Graphics g, int x, int y)
	{
		g.setColor(Color.yellow);
		g.fillArc(x, y, 100, 100, 0, 360); //Draw face outline
		g.setColor(Color.black);
		g.fillArc(x+25, y+20, 15, 15, 0, 360);//Draw eye 1
		g.fillArc(x+60, y+20, 15, 15, 0, 360);//draw eye 2
		g.drawArc(x+20, y+55, 60, 20, 0, -190);//Draw Mouth
	}//end method happyFace */
	
	/**
	 * sadFace method draws the sad face graphics
	 * 
	 * @param	g	graphics object passed
	 * @param	x	x position of happy face
	 * @param	y	y position of happy face
	 * 
	 */
	private void sadFace(Graphics g, int x, int y)
	{
		g.setColor(Color.blue);
		g.fillArc(x, y, 100, 100, 0, 360);//Draw Face outline
		g.setColor(Color.black);
		g.fillArc(x+25, y+20, 15, 15, 0, 360);//Draw eye 1
		g.fillArc(x+60, y+20, 15, 15, 0, 360);//draw eye 2
		g.drawArc(x+20, y+55, 60, 20, 0, 190);//Draw mouth
	}//end method sadFace */
	
	/**
	 * Processes a random number and returns the random number as an Int
	 * 
	 * @param	maxNum	the maximum number for Random to consider
	 * @return			random number as Int
	 * @see 			Random
	 * 
	 */
	private int locate(int maxNum)
	{
		Random rand = new Random();
		int rndResult = rand.nextInt(maxNum);
		return rndResult;
	}//end method locate */

	/**
	 * Sets the numFaces var to the value the Slider is at.
	 * 
	 * @param	number	the value from the slider is at
	 * 
	 */
	private void setNumber(int number)
	{
		numFaces = number;
		repaint();
	}//end method setNumber */
	
	/**
	 * Listens for the Slider to move, and then passes
	 * the JSlider value to the setNumber method
	 * 
	 * @param	ce	ChangeEvent that the method is listening to 
	 * 
	 */
	public void stateChanged(ChangeEvent ce) 
	{
		setNumber( numJSlider.getValue() );
	}//end method stateChanged

}
