
 
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class cinemaPrice extends JApplet{
	//Version UID -- need to resolve error in Eclipse IDE
	private static final long serialVersionUID = -4547408145084637657L;
	
	//global var declerations
	public static double FULL_PRICE=9.5; //full price of ticket
	double finalPrice; //initalize finalPrice var
	public static double discountPercent = 0.30; //Discount percentage for matinee price
	
	DecimalFormat twoDForm;
	public static JPanel pane;
	static JButton butStart;
	static JLabel welcomeBanner;
	static public ButtonHandler handler;
	
	public void init()
	{
		handler = new ButtonHandler();
		pane = new JPanel();
		pane.setLayout( new FlowLayout());
		//setup format for decimal format
		twoDForm = new DecimalFormat("#.##");
		KioskDisplay.welcomeScreen();
		add(pane);
		
		
		
	}//end init method */
	
	public void run()
	{
		/*
		 * RUN Method will assume that a display has been painted and will just 
		 * revalidate and repaint the main pane component.
		 */
		pane.validate();
		pane.repaint();
	}//end run method
	
	private class ButtonHandler implements ActionListener
	{
		public void  actionPerformed (ActionEvent ae)
		{
			Object obj = ae.getSource();
			//if the start button was pressed
			if (obj == KioskDisplay.butStart){ 
				pane.removeAll();
				KioskDisplay.intro();
		    }
			//if the age check button was pressed
			if (obj == KioskDisplay.butAgeSubmit){
				int age = Integer.parseInt(KioskDisplay.ageField.getText());
				finalPrice = PriceCheck.priceCheck(age);
				finalPrice = Double.valueOf(twoDForm.format(finalPrice));
				JOptionPane.showMessageDialog(pane,"Final Price for age "+age+" is: "+finalPrice);
				KioskDisplay.ageField.setText("");
			}
			else {
				KioskDisplay.welcomeBanner.setText(obj.toString());
			}//end if statement
			run();
		}//end private method actionPerformed
	}//end private class ButtonHandler
}//end class cinemaPrice