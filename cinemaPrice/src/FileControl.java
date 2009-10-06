import java.io.File;

import javax.swing.JOptionPane;

public class FileControl 
{
	static String FILE_PATH ="./fileName";
	public static void analyzePath ()
	{
		//create File object
		File name = new File( FILE_PATH);
		if ( !(name.exists()) )// if name exists
		{
			JOptionPane.showMessageDialog(cinemaPrice.pane,"ERROR: "+ FILE_PATH + " does not exist!");
		}//if file check 
	}//end class analyzePath
}
