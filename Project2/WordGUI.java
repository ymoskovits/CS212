/**
 * 
 * @author Julian Moskovits
 * The WordGUI class creates a GUI which presents the Words in 2 WordLists.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class WordGUI{
	/**
	 * This is the unsorted WordList to be displayed.
	 */
	private static WordList unsorted;
	
	/**
	 * This is the sorted WordList to be displayed.
	 */
	private static WordList sorted;
	
	
	/**
	 * The constructor takes 2 WordLists and displayes each one on opposite sides of a GUI.
	 * @param x The handle on the unsorted WordList.
	 * @param y The handle on the sorted WordList.
	 * 
	 */
	public WordGUI(WordList x, WordList y){	
		//Initializes the elements of the JFrame.
		JFrame myWordGUI = new JFrame();
		myWordGUI.setSize(200,200);
		myWordGUI.setLocation(100,100);
		myWordGUI.setTitle("PROJECT 1");
		myWordGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Displays the values in the JFrame.
		unsorted = x;
		sorted = y;
		myWordGUI.setLayout(new GridLayout(1, 2));
		Container myContentPane = myWordGUI.getContentPane();
		TextArea myUnsortedText = new TextArea(50,40);
		TextArea mySortedText = new TextArea(50,40);
		myContentPane.add(myUnsortedText);
		myContentPane.add(mySortedText);

		myUnsortedText.append("UNSORTED LIST:\n");
		mySortedText.append("SORTED LIST:\n");
		


		myUnsortedText.append(unsorted.toString(unsorted));
		mySortedText.append(sorted.toString(sorted));
	
		myWordGUI.pack();
		myWordGUI.setVisible(true);
	}
}
		

