/**
 * @author J.A. Simmons V, Bach Dang
 * @version 1.0 23 Sept 2009
 */
import java.awt.*;
import javax.swing.*;

public class HouseWithMethods extends JApplet
{
   int  WINDOW_WIDTH = 20;
   int  WINDOW_HEIGHT = 30;
   public void paint (Graphics g )
   {
		super.paint( g );
		paintHouse( g );
		paintLandscape( g );
   }
   public void paintHouse( Graphics grph )
   {
		grph.setColor( Color.pink );
		grph.fillRect ( 100,100,200,200 );
		grph.setColor( Color.black );
		Polygon poly = new Polygon( );   
		poly.addPoint(100,100);
		poly.addPoint(200,50);
		poly.addPoint(300,100);
		grph.fillPolygon(poly);
		grph.setColor( Color.blue );
		grph.fillRect ( 200,230,40,70);  
                                 // windows
		paintWindow( grph, 120, 150 );  
		paintWindow( grph, 150, 150 );
		paintWindow( grph, 200, 150 );
		paintWindow( grph, 230, 150 );
		//second row of windows
		paintWindow( grph, 120, 190 );  
		paintWindow( grph, 150, 190 );
		paintWindow( grph, 200, 190 );
		paintWindow( grph, 230, 190 );
   }
   public void paintWindow( 
                 Graphics gp, int x, int y )
   {
		gp.setColor( Color.blue );
		gp.fillRect( x, y, WINDOW_WIDTH,     
                             WINDOW_HEIGHT);
		gp.setColor(Color.black);
		gp.drawLine( x+(WINDOW_WIDTH/2),y,x+(WINDOW_WIDTH/2),y+WINDOW_HEIGHT);
		gp.drawLine( x,y+(WINDOW_HEIGHT/2),x+WINDOW_WIDTH,y+(WINDOW_HEIGHT/2));
   }//end paintWindow
   public void paintLandscape( Graphics g )
   {
		g.setColor( Color.black );     
		g.fillRect ( 400,130,30,170 );
		g.setColor( Color.green );
		g.fillOval( 370,80,100,100 );
		g.fillRect ( 0,295,500,5 );
   }//end paintLandscape
}//end class HouseWithMethods
