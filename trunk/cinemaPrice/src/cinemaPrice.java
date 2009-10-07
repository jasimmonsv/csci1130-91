
 
import java.awt.*;
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
	public static Image img;
	private static ImageIcon welcomeIcon;
	DecimalFormat twoDForm;
	public static JPanel mainPane, welcomePane, pane, pane2;
	static public ButtonHandler handler;
	static public JButton startOver;
	public static JLabel imageLabel;
	private Image movieImages1, movieImages2, movieImages3, movieImages4;
	public static ImageIcon movieIcon1, movieIcon2, movieIcon3, movieIcon4;	
	public static String[][] movies = {{"./cloudymeatballsPosterH85.jpg","Meatballs","Cloudy w/ Chance of Meatballs"},
			 {"./inventionOfLyingPosterH85.jpg","Inven Lying","The Invention of Lying"},
			 {"./surrogatesPosterH85.jpg","Surrogate","Surrogates"},
			 {"./zombielandPosterH85.jpg","Zombie","Zombieland"}
			};
	private static String finalMovie;
	
	public void init()
	{
		handler = new ButtonHandler();
		mainPane = new JPanel();
		welcomePane = new JPanel();
		pane  = new JPanel();
		pane2 = new JPanel();
		startOver = new JButton("Start Over");
		startOver.addActionListener(cinemaPrice.handler);
		

		//setup Welcome Image
		img = getImage( getCodeBase( ), "./popcornTickets149x100.jpg" );
		welcomeIcon = new ImageIcon( img );
		imageLabel = new JLabel( welcomeIcon, JLabel.CENTER );
		
		//setup Movie images
		//Movie1
		movieImages1 = getImage( getCodeBase(), movies[0][0]);
		movieIcon1 = new ImageIcon( movieImages1 );	
		//Movie2
		movieImages2 = getImage( getCodeBase(), movies[1][0]);
		movieIcon2 = new ImageIcon( movieImages2 );		
		//Movie3
		movieImages3 = getImage( getCodeBase(), movies[2][0]);
		movieIcon3 = new ImageIcon( movieImages3 );
		//movie4
		movieImages4 = getImage( getCodeBase(), movies[3][0]);
		movieIcon4 = new ImageIcon( movieImages4 );
			
		//setup format for decimal format
		twoDForm = new DecimalFormat("#.##");
		KioskDisplay.welcomeScreen();
		add(mainPane);
	}//end init method */
	
	public void run()
	{
		/*
		 * RUN Method will assume that a display has been painted and will just 
		 * revalidate and repaint the main pane component.
		 */
		mainPane.validate();
		mainPane.repaint();
	}//end run method
	
	private class ButtonHandler implements ActionListener
	{
		public void  actionPerformed (ActionEvent ae)
		{
			Object obj = ae.getSource();
			//if the start button was pressed
			if (obj == KioskDisplay.butStart){ 
				mainPane.removeAll();
				KioskDisplay.movieSelection();
		    }
			//if the age check button was pressed
			if (obj == KioskDisplay.butAgeSubmit){
				int age = Integer.parseInt(KioskDisplay.ageField.getText());
				finalPrice = PriceCheck.priceCheck(age);
				finalPrice = Double.valueOf(twoDForm.format(finalPrice));
				KioskDisplay.finalPriceBanner.setText("Final Price for "+finalMovie+" & age "+age+" is: "+finalPrice);
				KioskDisplay.ageField.setText("");
			}
			if (obj == KioskDisplay.movieButton1){finalMovie=movies[0][2];KioskDisplay.ageCheck();}
			if (obj == KioskDisplay.movieButton2){finalMovie=movies[1][2];KioskDisplay.ageCheck();}
			if (obj == KioskDisplay.movieButton3){finalMovie=movies[2][2];KioskDisplay.ageCheck();}
			if (obj == KioskDisplay.movieButton4){finalMovie=movies[3][2];KioskDisplay.ageCheck();}
			if (obj == startOver)KioskDisplay.welcomeScreen();
			else {
				KioskDisplay.welcomeBanner.setText(obj.toString());
			}//end if statement
			run();
		}//end private method actionPerformed
	}//end private class ButtonHandler
}//end class cinemaPrice