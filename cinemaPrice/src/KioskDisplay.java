
import javax.swing.*;

import java.awt.*;

public class KioskDisplay
{
	static JTextField ageField;
	static JLabel ageLabel;
	static JButton butAgeSubmit, butStart;
	static JLabel welcomeBanner;
	
	public static void intro()
	{
		butAgeSubmit = new JButton("Submit");
		butAgeSubmit.addActionListener(cinemaPrice.handler);
		ageLabel = new JLabel("Enter Age: ");
		ageField = new JTextField(5);
		cinemaPrice.pane.add( ageLabel);
		cinemaPrice.pane.add( ageField);
		cinemaPrice.pane.add( butAgeSubmit );
	}//end method
	
	public static void welcomeScreen()
	{
		cinemaPrice.pane.removeAll();
		welcomeBanner = new JLabel("Welcome to North Hennepin Cinema");
		butStart = new JButton("Press to Start");
		butStart.addActionListener(cinemaPrice.handler);
		cinemaPrice.pane.add( welcomeBanner );
		cinemaPrice.pane.add( butStart );
	}//end method welcomeScreen */
	
}//end class KioskDisplay */
