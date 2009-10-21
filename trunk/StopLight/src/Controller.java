/** 
* @Controller.java 
* Model for StopLight Project
* @author Charlie Mulic, JA Simmons V
* @version 1.00 2009/10/7 
* 
* CSci 1130-91 Fall 2009 
* 
* Required / Create three Buttons
* Required / Draw traffic Light 
* Required / Events to turn on Green Light if user presses Go
* Required / Events to turn on Yellow Light if user presses Wait
* Required / Events to turn on Red Light if user presses Stop
* Include a Car Image
* Additional Features:
*  
*/

public class Controller {
	
	/*
	 * @param lightColor 1 = RedLight, 2=YellowLight, 3=GreenLight
	 * @param returns true for error,  false for no error
	 * 
	 */
	public static boolean changeLight(int lightColor)
	{
		boolean fail;
		switch (lightColor)
		{
		case 1: View.lightImgLocation = "./trafficLightRed.jpg";fail = false;break;//if light is passed Red
		case 2: View.lightImgLocation = "./trafficLightYellow.jpg";fail = false;break;//if light is passed yellow
		case 3: View.lightImgLocation = "./trafficLightGreen.jpg";fail = false;break;//if light is passed green
		default: View.lightImgLocation = ".trafficLightRed.jpg";fail = true;break;//if error occures
		}//end case lightColor */
		return fail;
	}//end method changeLight */
}
