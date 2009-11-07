import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class AudioVisualMaterial extends LibraryMaterial 
{
	private int type;
	private Image coverImage;
	
	//------constructor
	public AudioVisualMaterial(String txtAuthor, String txtTitle, double dblPrice, int intYear,int intType,String imageLocation)
	{
		super(txtAuthor, txtTitle, dblPrice, intYear); //pass to LibraryMaterial Constructor
		setType(intType); //set type
		setImage(imageLocation);
	}//end constructor
	
	public int getType()
	{
		return type;
	}//end method getType
	
	/*
	 * @param	intType	required to set the type properly.large print
	 */
	public void setType(int intType)
	{
		if(intType < 3 || intType > 5)type=3;
		else type = intType;
	}//end method setType
	
	/*
	 * @param	intType required to set the type properly.3 is Audiotape, 4 is CD, 5 is DVD
	 * @return	typeString	returns a string of the type that exists.
	 */
	public String getTypeString(int intType)
	{
		String typeString="";
		switch (intType)
		{
		case 3: typeString = "Audiotape"; break;
		case 4: typeString = "CD"; break;
		case 5: typeString = "DVD"; break;
		}//end switch
		return typeString;
	}//end method getTypeString */
	
	public Image getImage()
	{
		return coverImage;
	}//end method getImage */
	
	public ImageIcon getImageIcon()
	{
		ImageIcon imgIcon = new ImageIcon(coverImage);
		return imgIcon;
	}//end method getImageIcon()
	
	/*
	 * @param	imageLocation required to set image to the passed image location
	 * 
	 */
	public void setImage(String imageLocation)
	{
		BufferedImage image = null;
		try
		{
		image = ImageIO.read(new File(imageLocation));
		}
		catch( IOException e)
		{
			//do something with exception
		}
		coverImage = (Image) image;
		/*try
		{
			FileOpenService fileOpenService = (FileOpenService) ServiceManager.lookup("javax.jnlp.FileOpenService");
			FileContents contents = fileOpenService.openFileDialog( null, null);
			fileOpenService.
			byte[] imageData = new byte[ (int) contents.getLength()];
			contents.getInputStream().read( imageData );// read image bytes
			coverImage = new ImageIcon( imageData ); //create the image
		}//end try
		catch( Exception e )
		{
			e.printStackTrace();	
		}//end catch*/
	}//end method setImage */
	
	@Override
	public String displayInfo()//TODO figure out how to pass Image information
	{
		return String.format("%s: \n%s: %s \n%s: %d \n%s: $%,.2f \n%s: %s \ns%: %s \n%s: %s",
				//TODO setup type as string
				getTitle(), "Author", getAuthor(), "Year", getYear(), "Price", getPrice(),
				"Type: ",getTypeString(getType()),"Cover: ",getImageIcon());
	}//end method display Info
	
}//end class AudioVisualMaterial */
