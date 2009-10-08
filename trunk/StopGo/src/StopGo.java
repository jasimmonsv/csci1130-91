                                                                     
                                                                     
                                                                     
                                             
/** 
* @StopGo.java 
* 
* @Charlie Mulic, JA Simmons V
* @version 1.00 2009/10/7 
* 
* CSci 1130-91 Fall 2009 
* 
* Required / Completed: Create two buttons to change the color of an object (circle).
* Required / Completed: Handle button click events using ActionListener. 
* Required / Completed: Redraw a graphic with the color set by the buttons.
* Required / Completed: Use initial comments and in-line comments.
* Additional Features: 
*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;

public class StopGo extends JApplet implements ActionListener {
	
	private int circleWidth = 50; // set width of circle
	private int circleHeight = 50; // set height of circle
	private Color circleColor = Color.white; // set initial fill color for circle
	
	private JButton redBtn, greenBtn;
	
	public void init() {
		setSize(250,250); // set the size of the applet
		setupButtons(); // function to set up buttons
	}
	
	private void setupButtons() {
		setLayout(new FlowLayout()); // set the layout for positioning
		
		redBtn = new JButton("Red"); // initialize redBtn
		redBtn.addActionListener(this); // have redBtn listen for a click
		
		greenBtn = new JButton("Green"); // initialize greenBtn
		greenBtn.addActionListener(this); // have greenBtn listen for a click
		
		add(redBtn); // add redBtn to the screen
		add(greenBtn); // add greenBtn to the screen
    }
	
	public void paint(Graphics g) {	
		super.paint(g);
		g.setColor(circleColor); // set the circle's fill color
		// create the circle and position it in the center of the screen
		g.fillOval(getWidth()/2-(circleWidth/2), getHeight()/2-(circleHeight/2), circleWidth, circleHeight);
		
		g.setColor(Color.black); // set color for circle outline
		// create the circle outline and position it in the center of the screen
		g.drawOval(getWidth()/2-(circleWidth/2), getHeight()/2-(circleHeight/2), circleWidth, circleHeight);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object src = ae.getSource(); // get the source of the event
		
		if(src == redBtn) { // if event source is redBtn
			circleColor = Color.red; // set circleColor to red if redBtn clicked
			repaint(); // update screen
		} else if(src == greenBtn) { // if event source is greenBtn
			circleColor = Color.green; // set circleColor to green if greenBtn clicked
			repaint(); // update screen
		}
	}
}