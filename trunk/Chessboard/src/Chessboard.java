/**
 * @author J.A. Simmons V, Bach Dang
 * @version 1.2 23 Sept 2009
 */

import javax.swing.*;
import java.awt.*;

public class Chessboard extends JApplet
{
  public void paint (Graphics g)
  {
	  super.paint(g);
	  int x=20;
	  g.drawRect(20,20,80,80);
	  for (int i=20; i<=90; i+=10){
		  drawRows(g, x, i);
		  if (x==30)x-=20;
		  x+=10;
	  }//end For Loop  
  }//end method paint
  
  public void drawRows(Graphics graphics, int x, int y)
  {
	  for (int i=1;i<=4;i++){
		  graphics.fillRect(x, y, 10, 10);
		  x+=20;
	  }//end for Loop
  }//end method drawRows
}//end class Chessboard
