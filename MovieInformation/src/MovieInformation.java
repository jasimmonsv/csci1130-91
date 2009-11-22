import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class MovieInformation extends JApplet
{
	JPanel pnlTitle, pnlImage, pnlDetails;
	JComboBox cboTitle;
	JLabel lblTitle, lblDirector, lblDate, lblImg;
	
	String[] movies = { "Gone With the Wind", "Superman", "Avatar" };
	
	public void init()
	{
		setLayout(new BorderLayout());
		
		pnlTitle = new JPanel(new FlowLayout());
		pnlTitle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder( Color.BLACK, 3 ),"Movie"));
		
		pnlImage = new JPanel();
		pnlImage.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder( Color.BLACK, 3 ),"Image"));
		
		pnlDetails = new JPanel();
		pnlDetails.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		pnlDetails.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder( Color.BLACK, 3 ),"Details"));
		
		lblTitle = new JLabel("Title: ");
		lblDirector = new JLabel("Director: ");
		lblDate = new JLabel("Date: ");
		lblImg = new JLabel();
		
		cboTitle = new JComboBox(movies);
		
		
		//add components to panels
		pnlTitle.add(cboTitle);
		pnlImage.add(lblImg);
		pnlDetails.add(lblDirector);
		pnlDetails.add(lblDate);
		//add panels to the main frame
		add(pnlTitle,BorderLayout.NORTH);
		add(pnlImage, BorderLayout.CENTER);
		add(pnlDetails, BorderLayout.SOUTH);
		
	}//end method init */

	/*public void paint(Graphics g)
	{
		
	}//end method paint */
}//end class MovieInformation */
