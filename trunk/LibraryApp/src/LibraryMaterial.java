/*
 * @author J.A. Simmons V
 * @version 0.1 3Nov2009 * 
 * 
 * This abstract class 
 */
public abstract class LibraryMaterial implements DisplayInfo
{
	private String author; //Author Name
	private String title; //Title of Material
	private double price; //Price of material
	private int year; //year material was originally produced

	//----constructor
	public LibraryMaterial (String txtAuthor, String txtTitle, double dblPrice, int intYear)
	{
		author = txtAuthor;
		title = txtTitle;
		price = dblPrice;
		year = intYear;
	}//end constructor LibraryMaterial
	
	public String getAuthor()
	{
		return author;
	}//end method getAuthor */
	
	/*
	 * @param	txtAuthor	required to set the Author's name on the requested material
	 */
	public void setAuthor(String txtAuthor)
	{
		author = txtAuthor;
	}//end method setAuthor */
	
	public String getTitle()
	{
		return title;
	}
	
	/*
	 * @param	txtTitle	required to set the title on the requested material
	 */
	public void setTitle(String txtTitle)
	{
		title = txtTitle;
	}//end method setTitle
	
	public double getPrice()
	{
		return price;
	}//end method getPrice */
	
	/*
	 * @param	dblPrice	required to set the price on the requested material
	 */
	public void setPrice(double dblPrice)
	{
		if (dblPrice <0)price=0;
		else price=dblPrice;
		
	}//end method setPrice */
	
	public int getYear()
	{
		return year;
	}
	
	/*
	 * @param	intYear	required to set the year produced on the requested material
	 */
	public void setYear(int intYear)
	{
		if (intYear <0)year=0;
		else year=intYear;
	}//end method setYear */
	
	
	public String displayInfo()
	{
		return String.format("%s: \n%s: %s \n%s: %d \n%s: $%,.2f",
				getTitle(), "Author", getAuthor(), "Year", getYear(), "Price", getPrice());
	}//end method display Info
}//end class LibraryMaterial
