/**
 * 
 * @author J.A. Simmons V
 * @version 1.0 22 Sep 2009
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversion  extends JApplet implements ActionListener
{
	JButton convButton;
	JPanel tempPanel;
	JLabel tempLabel;
	JTextArea txtTemp;

	public void init()
	{
		setLayout(new FlowLayout());
		txtTemp = new JTextArea( 5,10);
		setupButtons();
	}//end method init
	
	public void setupButtons()
	{
		tempLabel = new JLabel();
		convButton = new JButton("Convert");
		convButton.addActionListener(this);
		tempPanel = new JPanel(new GridLayout(2,1));
		tempPanel.add( convButton );
		add( tempPanel ); add( tempLabel); add( txtTemp );
		 
	}//end method setupButtons
	
	public void actionPerformed (ActionEvent ae)
	{
		Object source = ae.getSource();
		if( source == convButton ) 
			tempLabel.setText("blah");
	}//end method actionPerformed
	
	public void setupImage ()
	{
		txtTemp.
	}//end method setupImage
}//end class TempConversion
