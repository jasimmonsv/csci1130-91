/**
 * 
 * @author J.A. Simmons V
 * @version 1.0
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class KioskDisplay extends JApplet
{
	public static JTextField ageField;
	public static JLabel ageLabel, welcomeBanner, finalPriceBanner, movieLabel1, movieLabel2, movieLabel3, movieLabel4;
	public static JButton butAgeSubmit, butStart, movieButton1, movieButton2, movieButton3, movieButton4;
		
	public static void ageCheck()
	{
		//setup Layouts
		cinemaPrice.pane.removeAll();
		cinemaPrice.pane2.removeAll();
		cinemaPrice.pane.setLayout(new BorderLayout());
		cinemaPrice.pane2.setLayout(new FlowLayout());
		
		//setup button
		butAgeSubmit = new JButton("Submit");
		butAgeSubmit.addActionListener(cinemaPrice.handler);
		
		//Setup user GUI Label
		ageLabel = new JLabel("Enter Age: ");
		finalPriceBanner = new JLabel(" FINAL PRICE ", JLabel.CENTER);
		ageField = new JTextField(5);
		
		//add and finalize Jpanels
		cinemaPrice.pane2.add( ageLabel );
		cinemaPrice.pane2.add( ageField );
		cinemaPrice.pane2.add( butAgeSubmit );
		cinemaPrice.pane.add(finalPriceBanner, BorderLayout.CENTER);
		cinemaPrice.pane.add(cinemaPrice.pane2, BorderLayout.NORTH);
		cinemaPrice.pane.add(cinemaPrice.startOver, BorderLayout.SOUTH);
		
		//finalize Main JPanel
		cinemaPrice.mainPane.removeAll();
		cinemaPrice.mainPane.add(cinemaPrice.pane);
		cinemaPrice.mainPane.repaint();
	}//end method
	
	public static void welcomeScreen()
	{
		//setup layout		
		cinemaPrice.welcomePane.removeAll();
		cinemaPrice.welcomePane.setLayout( new BorderLayout());
		
		//setup JButton and JLabels for welcome screen
		welcomeBanner = new JLabel("Welcome to North Hennepin Cinema", JLabel.CENTER);
		butStart = new JButton("Press to Start");
		butStart.addActionListener(cinemaPrice.handler);
		
		//setup and finalize JPanels
		cinemaPrice.welcomePane.add( welcomeBanner, BorderLayout.NORTH );
		cinemaPrice.welcomePane.add( butStart, BorderLayout.SOUTH );
		cinemaPrice.welcomePane.add(cinemaPrice.imageLabel,BorderLayout.CENTER);
		
		//finalize MainPane
		cinemaPrice.mainPane.removeAll();
		cinemaPrice.mainPane.add(cinemaPrice.welcomePane);
		cinemaPrice.mainPane.repaint();
	}//end method welcomeScreen */
	
	public static void movieSelection()
	{
		//setup layouts and prep JPanels
		cinemaPrice.pane.removeAll();
		cinemaPrice.pane2.removeAll();
		cinemaPrice.pane.setLayout(new BorderLayout());
		cinemaPrice.pane2.setLayout(new GridLayout(1,4));
		JLabel movieTitle=new JLabel("Select your movie below:", JLabel.CENTER);
		
		//setup Movie Buttons
		movieButton1 = movieButtonSetup(cinemaPrice.movies[0][1],movieButton1, cinemaPrice.movieIcon1, 0);
		movieButton1.setHorizontalTextPosition(JButton.CENTER);
		movieButton1.setVerticalTextPosition(JButton.BOTTOM);
		movieButton1.addActionListener(cinemaPrice.handler);
		movieButton2 = movieButtonSetup(cinemaPrice.movies[1][1], movieButton2, cinemaPrice.movieIcon2, 1);
		movieButton2.setHorizontalTextPosition(JButton.CENTER);
		movieButton2.setVerticalTextPosition(JButton.BOTTOM);
		movieButton2.addActionListener(cinemaPrice.handler);
		movieButton3 = movieButtonSetup(cinemaPrice.movies[2][1], movieButton3, cinemaPrice.movieIcon3, 2);
		movieButton3.setHorizontalTextPosition(JButton.CENTER);
		movieButton3.setVerticalTextPosition(JButton.BOTTOM);
		movieButton3.addActionListener(cinemaPrice.handler);
		movieButton4 = movieButtonSetup(cinemaPrice.movies[3][1], movieButton4, cinemaPrice.movieIcon4, 3);
		movieButton4.setHorizontalTextPosition(JButton.CENTER);
		movieButton4.setVerticalTextPosition(JButton.BOTTOM);
		movieButton4.addActionListener(cinemaPrice.handler);

		//setup JPanels
		cinemaPrice.pane2.add( movieButton1);
		cinemaPrice.pane2.add( movieButton2);
		cinemaPrice.pane2.add( movieButton3);
		cinemaPrice.pane2.add( movieButton4);
		cinemaPrice.pane.add(movieTitle, BorderLayout.NORTH);
		cinemaPrice.pane.add(cinemaPrice.pane2, BorderLayout.CENTER);
		cinemaPrice.pane.add(cinemaPrice.startOver, BorderLayout.SOUTH);
		
		//finalize MainPane
		cinemaPrice.mainPane.removeAll();
		cinemaPrice.mainPane.add(cinemaPrice.pane);
		cinemaPrice.mainPane.repaint();
	}//end method welcomeScreen */
	
	private static JButton movieButtonSetup(String movieTitle, JButton movieButton, ImageIcon movieIcon, int i)
	{
		movieButton = new JButton( movieTitle, movieIcon );
		return movieButton;
	}//end method movieButtonSetup */
	
}//end class KioskDisplay */
