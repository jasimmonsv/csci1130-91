/**
 * @author J.A. Simmons V, Bach Dang
 * @version 1.0 23 Sept 2009
 */
import javax.swing.*;
import java.awt.*;

public class ChessboardModified extends JApplet
{
	int cellSize=30;
	
  public void paint (Graphics g)
  {
	  super.paint(g);
	  int x=20,y=20;
	  g.drawRect(20,20,cellSize*8,cellSize*8);
	  drawRows(g, x, y);
	  x+=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x-=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x+=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x-=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x+=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x-=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  x+=cellSize;y+=cellSize;
	  drawRows(g, x, y);
	  
  }//end method paint
  
  public void drawRows(Graphics graphics, int x, int y)
  {
	  graphics.fillRect(x,y,cellSize,cellSize);
	  x+=2*cellSize;
	  graphics.fillRect(x,y,cellSize,cellSize);
	  x+=2*cellSize;
	  graphics.fillRect(x,y,cellSize,cellSize);
	  x+=2*cellSize;
	  graphics.fillRect(x,y,cellSize,cellSize);
	  x+=2*cellSize;
	  
	  
  }//end method drawRows
}//end class Chessboard
