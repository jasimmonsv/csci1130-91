/**
 * @(#)cinemaPrice.java
 *
 * cinemaPrice Applet application
 *
 * @author 
 * @version 1.00 2009/9/30
 */
 
import java.awt.*;
import java.applet.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Calendar;

public class cinemaPrice extends Applet {
	/**
	 * 
	 */
	//Version UID -- need to resolve error in Eclipse IDE
	private static final long serialVersionUID = -4547408145084637657L;
	
	double FULL_PRICE=9.5; //full price of ticket
	double finalPrice; //initalize finalPrice var
	double discountPercent = 0.30; //Discount percentage for matinee price
	
	public void paint(Graphics g) 	
	{
		String txtAge;
		txtAge=JOptionPane.showInputDialog("Enter in Age:");
		int age = Integer.parseInt(txtAge);
		finalPrice = priceToAgeCheck(age);
		finalPrice = dateCheck(finalPrice);
		
		//format finalPrice to 2 decimal points
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		finalPrice = Double.valueOf(twoDForm.format(finalPrice));
		
		//draw the result
		g.drawString("Final Price: "+finalPrice,50,60);
	}//end method paint */
	
	public double priceToAgeCheck(int age)
	{
		//check age to apply proper discount
		if (age < 5 || age >=55)finalPrice=0;
		if (age >=5 && age <13)finalPrice= FULL_PRICE/2;
		if (age >=13 && age <55)finalPrice = FULL_PRICE;
		return finalPrice;
	}//end method priceToAgeCheck */
	
	public double dateCheck(double finalPrice)
	{
		//check the day of week for possible matinee discounts 
		Calendar dateTime = Calendar.getInstance();
		int dayOfWeek = dateTime.get(Calendar.DAY_OF_WEEK);
		//For days of week => 1=Sunday ... 7=Saturday
		//int dayOfWeek = 1;
		switch( dayOfWeek)
		{
		  case 1: case 7: break;
		  default: finalPrice = finalPrice - (finalPrice* discountPercent); break; 
		}//end Switch statement
		return finalPrice;
	}//end method matineeCheck */
}//end class cinemaPrice