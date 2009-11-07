import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LibraryFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3927493369671159976L;
	private ButtonHandler handler;
	private JButton btnBooks, btnAudioVisual, btnBookSubmit, btnAVSubmit;
	private JPanel pnlInput;
	private LibraryMaterial[] libraryObjects;
	private JTextField txtTitle, txtPrice, txtEdition, txtPageNum, txtYear, txtAuthor;
	private JComboBox jcbType;

	public LibraryFrame()
	{
		super( "Library App" );
		
		//setup Components
		libraryObjects = new LibraryMaterial[10];
		libraryObjects[0] = new Book( "Atlas Shrugged", "Ayn Rand", 15.00, 1970, 1, 1, 1000);
		libraryObjects[1] = new AudioVisualMaterial("System of a Down", "Toxicity", 15.00, 2000, 0, "./toxicity.jpg" );
		libraryObjects[2] = new Book( "Ender's Game", "Orson Scott Card", 12.00, 1985, 2, 3, 400);
		handler = new ButtonHandler(); //action handler
		btnBooks = new JButton("Books"); btnAudioVisual = new JButton("Audio/Visual");
		btnBooks.addActionListener(handler);
		btnAudioVisual.addActionListener(handler);
		
		//setup Panels
		pnlInput = new JPanel(new FlowLayout());
		pnlInput.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder( Color.BLACK, 3 ),"Input"));		
		JPanel pnlDetails = new JPanel(new FlowLayout());
		pnlDetails.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder( Color.BLACK, 3 ),"Details"));
		
		//add components to panels
		pnlInput.add(btnBooks);
		pnlInput.add(btnAudioVisual);
		
		//add panels to the Main Frame
		add( pnlInput, BorderLayout.NORTH );
		add( pnlDetails, BorderLayout.CENTER );
		
	}//end constructor
	
	private void repaintInit()
	{
		pnlInput.removeAll();
		
		pnlInput.add(btnBooks);
		pnlInput.add(btnAudioVisual);
		
		pnlInput.validate();
		pnlInput.repaint();
	}//end method repaintInit */
	
	private void setupBookInput()
	{
		pnlInput.removeAll();
		//init components
		String[] types = {"HardCover", "PaperBack", "Large Print", "Audio Tape", "CD", "DVD"};
		
		JLabel lblTitle = new JLabel("Title: ");
		JLabel lblType = new JLabel("Type: ");
		JLabel lblEdition = new JLabel("Edition: ");
		JLabel lblPageNum = new JLabel("Number of Pages: ");
		JLabel lblPrice = new JLabel("Price: $");
		JLabel lblYear = new JLabel("Year: ");
		JLabel lblAuthor = new JLabel("Author: ");
		
		txtTitle = new JTextField(10);
		jcbType = new JComboBox(types);
		txtEdition = new JTextField(3);
		txtPageNum = new JTextField(3);
		txtPrice = new JTextField(3);
		txtYear = new JTextField(3);
		txtAuthor = new JTextField(5);
		btnBookSubmit = new JButton("Submit");
		btnBookSubmit.addActionListener(handler);
		
		//add components to inputPanel
		pnlInput.add(lblTitle); 
		pnlInput.add(txtTitle);
		pnlInput.add(lblAuthor);
		pnlInput.add(txtAuthor);
		pnlInput.add(lblType);
		pnlInput.add(jcbType);
		pnlInput.add(lblEdition);
		pnlInput.add(txtEdition);
		pnlInput.add(lblYear);
		pnlInput.add(txtYear);
		pnlInput.add(lblPageNum);
		pnlInput.add(txtPageNum);
		pnlInput.add(lblPrice);
		pnlInput.add(txtPrice);
		pnlInput.add(btnBookSubmit);
		pnlInput.validate();
		pnlInput.repaint();
	}//end method setupBookInput */
	
	private void setupAudioVisualInput()
	{
		pnlInput.removeAll();
		//init components
		String[] types = {"HardCover", "PaperBack", "Large Print", "Audio Tape", "CD", "DVD"};
		
		JLabel lblTitle = new JLabel("Title: ");
		JLabel lblType = new JLabel("Type: ");
		JLabel lblEdition = new JLabel("Edition: ");
		JLabel lblPageNum = new JLabel("Number of Pages: ");
		JLabel lblPrice = new JLabel("Price: $");
		JLabel lblYear = new JLabel("Year: ");
		JLabel lblAuthor = new JLabel("Author: ");
		
		txtTitle = new JTextField(10);
		jcbType = new JComboBox(types);
		txtEdition = new JTextField(3);
		txtPageNum = new JTextField(3);
		txtPrice = new JTextField(3);
		txtYear = new JTextField(3);
		txtAuthor = new JTextField(5);
		btnAVSubmit = new JButton("Submit");
		btnAVSubmit.addActionListener(handler);
		
		//add components to inputPanel
		pnlInput.add(lblTitle); 
		pnlInput.add(txtTitle);
		pnlInput.add(lblAuthor);
		pnlInput.add(txtAuthor);
		pnlInput.add(lblType);
		pnlInput.add(jcbType);
		pnlInput.add(lblEdition);
		pnlInput.add(txtEdition);
		pnlInput.add(lblYear);
		pnlInput.add(txtYear);
		pnlInput.add(lblPageNum);
		pnlInput.add(txtPageNum);
		pnlInput.add(lblPrice);
		pnlInput.add(txtPrice);
		pnlInput.add(btnBookSubmit);
		pnlInput.validate();
		pnlInput.repaint();
	}//end method setupAudioVisualInput */
	
	private void addBook()
	{
		libraryObjects[4]=new Book(txtAuthor.getText(),
									txtTitle.getText(),
									Double.parseDouble(txtPrice.getText()), 
									Integer.parseInt(txtYear.getText()),
									Integer.parseInt(jcbType.toString()),
									Integer.parseInt(txtEdition.getText()), 
									Integer.parseInt(txtPageNum.getText()));
	}//end addBook */
	
	private class ButtonHandler implements ActionListener
    {

		public void actionPerformed(ActionEvent ae)
		{
			Object obj = ae.getSource();
			if (obj == btnBooks)setupBookInput();
			if (obj == btnBookSubmit)
			{
				addBook();
				repaintInit();
			}
			if (obj == btnAudioVisual)setupAudioVisualInput();
			if (obj == btnAVSubmit)
			{
				repaintInit();
			}
			
		}//end method actionPerformed */
	}//end anonymous class ButtonHandler */
}
