/**
 * @author J.A. Simmons V
 * @version 1.0 21Oct2009
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilkyWay extends JApplet implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6575932833188924720L;
	int MAX_DIMTR=100;
	int maxPlanets=100;
	private final Random randomNumber = new Random((int) (Math.random()*10+1));
	private final int SCREEN_WIDTH=700;
	private final int SCREEN_HEIGTH=500;
	private JButton btnSubmit;
	private JTextField numStars;
	private Graphics g;
	
	public void init()
	{
		setLayout( new BorderLayout() );
		numStars = new JTextField(10);
		btnSubmit = new JButton("Submit");
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(numStars);
		topPanel.add(btnSubmit);
		btnSubmit.addActionListener(this);
		add(topPanel, BorderLayout.NORTH);		
	}//end method init */
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillRect(0, 40, 800, 600);
		g.setColor(Color.white);
		for (int i=1; i<=300; i++) g.fillOval(randomNumber.nextInt(SCREEN_WIDTH+100), randomNumber.nextInt(SCREEN_HEIGTH+100), 2,2 ); //draws Background of stars
		for (int i=1;i<=maxPlanets;i++)
		{
			paintPlanet( g );
		}
	}//end paint method */

	private void paintPlanet(Graphics g)
	{
		int dimtr = randomNumber.nextInt( MAX_DIMTR );	
		g.setColor(new Color( randomNumber.nextInt(255), randomNumber.nextInt(255), randomNumber.nextInt(255) ));//set a random color and alpha for the planets
		g.fillOval(randomNumber.nextInt(SCREEN_WIDTH), randomNumber.nextInt(SCREEN_HEIGTH)+40, dimtr,dimtr ); //draw the planet of random width and heigth
	}//end paintPlanet Method */
	public void actionPerformed( ActionEvent ae )
	{
		Object obj = ae.getSource();
		if (obj == btnSubmit)
		{
			maxPlanets=Integer.parseInt(numStars.getText());
			super.repaint();
		}//end btnSubmit if */
		
	}//end method actionPerformed */
}//end MilkyWay Class */
