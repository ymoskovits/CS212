import java.awt.*;
import javax.swing.*;

public class WordGUI{
	private static Word[] unsorted;
	private static Word[] sorted;
	
	public WordGUI(Word[] x, Word[] y){	
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
		
		myUnsortedText.append(unsorted.toString());
		mySortedText.append(sorted.toString());
		
		myWordGUI.pack();
		myWordGUI.setVisible(true);
	}
}
		

