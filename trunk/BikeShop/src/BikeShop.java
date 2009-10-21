/**
 * @(#)BikeShop.java
 *
 * BikeShop Applet application
 *
 * @author JA Simmons V, Aaron G., Wesley Strand
 * @version 1.00 2009/10/14
 *
 *TODO input season and number of days of rental
 *TODO use switch statement for seasons
 *TODO add images of bicycle or seasons
 *TODO Display number of days and season inputed
 *TODO Format total charge to 2 decimals
 *
 *XTRA create nice GUI <Possible border layout>
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class BikeShop extends JApplet implements ActionListener
{
	//*************DECLERATIONS**************
	//Constants
	private static final long serialVersionUID = -8434103538226605407L;
	double SPRING_PRICE = 5.0;
	double SUMMER_PRICE = 7.5;
	double FALL_PRICE = 3.75;
	double WINTER_PRICE = 2.5;
	double DISCOUNT_PRICE = 0.75;
	
	//Vars
	private JButton submitBtn;
	private JTextField daysRental;
	private JComboBox seasons;
	private JPanel centerDisplay;
	private String totalCost;
	private double dblFinalPrice;
	private JLabel lblFinalCost, lblDaysRental, lblSeason;
	
	public void init() 
	{
		
		setLayout( new BorderLayout());//main panel layout
		//initialize centerDisplay panel
		centerDisplay = new JPanel();
		centerDisplay.setLayout(new FlowLayout());
		//initialize components
	//title JLabel
		  JLabel lblCompTitle = new JLabel("1130 Bike Rentals", JLabel.CENTER);
		  JLabel lblDaysRental = new JLabel("How many days rental? ");
		  JLabel lblSeason = new JLabel("During what season will you be renting? ");
		  lblFinalCost = new JLabel("Total Cost is: $0.00", JLabel.CENTER);
	//setup Left and RIght Images
		  Image leftBike = getImage( getCodeBase(), "./bicycle1.jpg");
		  Image rightBike = getImage( getCodeBase(), "./bicycle2.jpg");
		  ImageIcon leftIcon = new ImageIcon(leftBike);
		  ImageIcon rightIcon = new ImageIcon(rightBike);
		  JLabel leftLabel = new JLabel(leftIcon);
		  JLabel rightLabel = new JLabel(rightIcon);
		    //JComboBox
		  seasons = new JComboBox();
		  seasons.addItem("Spring"); //index 0
		  seasons.addItem("Summer"); //index 1
		  seasons.addItem("Fall");  //index 2
		  seasons.addItem("Winter"); //index 3
		    //TextField
		  daysRental = new JTextField(5);
		    //init button
		  submitBtn = new JButton("Submit");
		  submitBtn.addActionListener(this);
		  
		  //init panels
		    //main panel
		  add(lblCompTitle,BorderLayout.NORTH);
		  add(centerDisplay,BorderLayout.CENTER);
		  add(lblFinalCost,BorderLayout.SOUTH);
		  add(leftLabel, BorderLayout.WEST);
		  add(rightLabel, BorderLayout.EAST);
		
  		    //center panel
		  centerDisplay.add(lblDaysRental);
		  centerDisplay.add(daysRental);
		  centerDisplay.add(lblSeason);
		  centerDisplay.add(seasons);
		  centerDisplay.add(submitBtn);
	}//end method init */

	private double calcPrice(int rentDays, double seasonPrice)
	{   double price ;
	
		if (rentDays > 7)
		
		 	price = rentDays * seasonPrice * DISCOUNT_PRICE;
		else 
			 price = rentDays * seasonPrice;
			 
	    return price;
		
				
				
	}//end method calcPrice */
	
	public void actionPerformed(ActionEvent ae)
	{
		Object obj = ae.getSource();
		switch (seasons.getSelectedIndex())
		{
		
			case 0: dblFinalPrice = calcPrice(Integer.parseInt(daysRental.getText()), SPRING_PRICE);break;//season is spring
			case 1: dblFinalPrice = calcPrice(Integer.parseInt(daysRental.getText()), SUMMER_PRICE);break;//season is spring
			case 2: dblFinalPrice = calcPrice(Integer.parseInt(daysRental.getText()), FALL_PRICE);break;//season is spring
			case 3: dblFinalPrice = calcPrice(Integer.parseInt(daysRental.getText()), WINTER_PRICE);break;//season is spring
		}//end switch */
		NumberFormat formatter = new DecimalFormat("#0.00");//setup proper format
		lblFinalCost.setText("Total Cost is: $"+formatter.format(dblFinalPrice));//print final formatted txt
		/*if (obj == submitBtn)
		{
			switch()
			
		}//end if submitBtn */
	}//end method actinPerformed */
}//end class BikeShop */