
public class Book extends LibraryMaterial
{
	private int edition;
	private int type;
	private int numPages;
	
	//------constructor
	public Book(String txtAuthor, String txtTitle, double dblPrice, int intYear,int intType,int intEdition,int intNumPages)
	{
		super(txtAuthor, txtTitle, dblPrice, intYear); //pass to LibraryMaterial Constructor
		setType(intType); //set type
		setEdition(intEdition);
		setNumPages(intNumPages);
	}//end constructor

	public int getType()
	{
		return type;
	}//end method getType
	
	/*
	 * @param	intType	required to set the type properly.0 is hardcover, 1 is paperback, 2 is large print
	 */
	public void setType(int intType)
	{
		if(intType <0 || intType >3)type=0;
		else type = intType;
	}//end method setType
	
	public String getTypeString(int intType)
	{
		String typeString="";
		switch (intType)
		{
		case 0: typeString = "Hardcover"; break;
		case 1: typeString = "Paperback"; break;
		case 2: typeString = "Large Print"; break;
		}//end switch
		return typeString;
	}//end method getTypeString */
	
	public int getEdition()
	{
		return edition;
	}
	
	/*
	 * @param	intEdition	is needed to set the edition number
	 */
	public void setEdition(int intEdition)
	{
		if (intEdition <=0)edition=1;
		else edition=intEdition;
	}//end method setEdition */
	
	public int getNumPages()
	{
		return numPages;
	}//end method getNumPages*/
	
	/*
	 * @param	intNumPages	required to set the number of pages in the book class 
	 */
	public void setNumPages(int intNumPages)
	{
		if (intNumPages <= 0) numPages = 1;
		else numPages = intNumPages;
	}//end method setNumPages */
	
	@Override
	public String displayInfo()
	{
		return String.format("%s: \n%s: %s \n%s: %d \n%s: $%,.2f \n%s: %s \ns%: %s \n%s: %s",
				//TODO setup type as string
				getTitle(), "Author", getAuthor(), "Year", getYear(), "Price", getPrice(),
				"Type: ",getTypeString(getType()),"Edition: ",getEdition(),"Number of Pages",getNumPages());
	}//end method display Info
}//end class Book
