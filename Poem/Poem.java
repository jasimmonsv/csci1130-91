/**
 * 
 * Poem Applet Application
 * 
 * @author J.A. Simmons V
 * @version 1.00 2009/9/12
 */

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Poem extends Applet{
	
	public void paint(Graphics g){
		//*************************Declerations****************************
		int xint = 20;
		int yint= 65;
		Image img = getImage(getCodeBase(), "CoffeeArmyThumb.jpg");
		Random randNum = new Random();
		Color txtColor[]={
		Color.black,
		Color.blue,
		Color.cyan,
		Color.green,
		Color.magenta,
		Color.orange,
		Color.pink,
		Color.red,
		Color.yellow
		};//End Color Array
		String txtPoem[] =
		{
				"If you can keep your head when all about you",
				"Are losing theirs and blaming it on you,",
				"If you can trust yourself when all men doubt you",
				"But make allowance for their doubting too,",
				"If you can wait and not be tired by waiting,",
				"Or being lied about, don’t deal in lies,",
				"Or being hated, don’t give way to hating,",
				"And yet don’t look too good, nor talk too wise:",
				"",
				"If you can dream–and not make dreams your master,",
				"If you can think–and not make thoughts your aim;",
				"If you can meet with Triumph and Disaster",
				"And treat those two impostors just the same;",
				"If you can bear to hear the truth you’ve spoken",
				"Twisted by knaves to make a trap for fools,",
				"Or watch the things you gave your life to, broken,",
				"And stoop and build ‘em up with worn-out tools:",
				"",
				"If you can make one heap of all your winnings",
				"And risk it all on one turn of pitch-and-toss,",
				"And lose, and start again at your beginnings",
				"And never breath a word about your loss;",
				"If you can force your heart and nerve and sinew",
				"To serve your turn long after they are gone,",
				"And so hold on when there is nothing in you",
				"Except the Will which says to them: \"Hold on!\"",
				"",
				"If you can talk with crowds and keep your virtue,",
				"Or walk with kings–nor lose the common touch,",
				"If neither foes nor loving friends can hurt you;",
				"If all men count with you, but none too much,",
				"If you can fill the unforgiving minute",
				"With sixty seconds’ worth of distance run,",
				"Yours is the Earth and everything that’s in it,",
				"And–which is more–you’ll be a Man, my son!",
		};//End txtPoem Array
		//********************End Declerations***********************		
		
		
		g.setColor(Color.lightGray);
		g.fillRect(0,0,1800,1440);
		g.setColor(Color.black);
		g.drawString("\"If\"",95,15);
		g.drawString("by Rudyard Kipling",55,30);
		
		for( int i=0; i<txtPoem.length;i++)
		{
			g.drawString(txtPoem[i], xint, yint);
			yint=yint+15;
			g.setColor(txtColor[randNum.nextInt(txtColor.length)]);
		}//end for Loop
		g.drawImage(img, 330, 100, this);
		//g.drawImage(img, 330, 100+img.getHeight(this), img.getWidth(this), img.getHeight(this), this)
	}//End Method paint

}//end Class Poem
