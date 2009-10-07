/**
 * @(#)cinemaPrice.java
 *
 * cinemaPrice Applet application
 *
 * @author 
 * @version 1.00 2009/9/30
 */

import java.util.Calendar;
import javax.swing.*;

public class PriceCheck extends JApplet{

	public static double priceCheck(int age)
	{
		double finalPrice=0;
		
		//check age to apply proper discount
		if (age < 5 || age >=55)finalPrice=0;
		if (age >=5 && age <13)finalPrice= cinemaPrice.FULL_PRICE/2;
		if (age >=13 && age <55)finalPrice = cinemaPrice.FULL_PRICE;
		
		//check the day of week for possible matinee discounts 
		Calendar dateTime = Calendar.getInstance();
		int dayOfWeek = dateTime.get(Calendar.DAY_OF_WEEK);
		//For days of week => 1=Sunday ... 7=Saturday
		//int dayOfWeek = 1;
		switch( dayOfWeek)
		{
		  case 1: case 7: break;
		  default: finalPrice = finalPrice - (finalPrice* cinemaPrice.discountPercent); break; 
		}//end Switch statement
		return finalPrice;
	}//end method priceToAgeCheck */
}//end Class PriceCheck */
