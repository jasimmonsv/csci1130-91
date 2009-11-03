/*
 * @author J.A. Simmons V
 * @version 1.0 3Nov2009
 * 
 * This program assists counting cars comming and leaving a parking lot using two buttons.
 * 
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParkingLot extends JApplet implements ActionListener
{
	//**********Declarations************
	private static final long serialVersionUID = 5303554677924231324L;
	int MAX_CARS = 15;
	private JPanel mainPanel;
	private JButton addCar, subtractCar;
	public int totalCars, vacentSpots;
	private JLabel carCount, mainTitle;
	
	public void init() //entry point
	{
		vacentSpots = MAX_CARS - totalCars;
		setupPanels();
	}//end method init */
	
	private void setupPanels()
	{
		//setup Panel
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout() );
		
		//setup labels
		carCount = new JLabel("Cars in Lot: "+totalCars+" Vacent Spots: "+vacentSpots);
		mainTitle = new JLabel("Java Parking Lot",JLabel.CENTER);
		//setup Buttons
		addCar = new JButton("+ Car");
		subtractCar = new JButton("- Car");
		addCar.addActionListener(this);
		subtractCar.addActionListener(this);
		
		//add components
		mainPanel.add(mainTitle,BorderLayout.NORTH);
		mainPanel.add(carCount, BorderLayout.CENTER);
		mainPanel.add(addCar,BorderLayout.WEST);
		mainPanel.add(subtractCar, BorderLayout.EAST);
		
		
		//add mainPanel to the frame
		add(mainPanel);
	}//end method setupPanels */
	
	private void plusOneCar()
	{
		totalCars+=1;
	}//end method plusOneCar */
	
	private void minusOneCar()
	{
		totalCars-=1;
	}//end method minusOneCar */
	
	private void updatePanel()
	{
		vacentSpots = MAX_CARS - totalCars;
		carCount.setText( "Cars in Lot: " + totalCars + " Vacent Spots: " + vacentSpots);
	}//end methodRedrawPanel */
	
	public void actionPerformed(ActionEvent ae)
	{
		Object obj = ae.getSource();
		if (obj == addCar)
			{
			if (totalCars >= MAX_CARS) //check if lot is full
			{
				JOptionPane.showMessageDialog(this, 
						"Total Capacity Reached",
					    "PEBKAC Awareness Fail!",
					    JOptionPane.ERROR_MESSAGE);

			}
			else{plusOneCar();}
			}
		if (obj == subtractCar) 
			{
			if (totalCars <= 0) //check if lot is empty
			{
				JOptionPane.showMessageDialog(this, 
						"There are 0 Cars on the lot!",
					    "PEBKAC Awareness Fail!",
					    JOptionPane.ERROR_MESSAGE);

			}
			else{minusOneCar();}
			
			}//end subtract if */
		updatePanel();
	}

}//end class ParkingLot
