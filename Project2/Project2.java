/**
 * 
 * @author Julian Moskovits
 * 
 * The program reads a list of words from a file and stores them in one linked list of Words
 * 	in the order they are read and in another list in alphabetical order.
 * It outputs both lists to a JFrame.
 */


import java.util.*;
public class Project2 {

	public static void main(String[] args) {
		WordList unsorted = new WordList();
		WordList sorted = new WordList();

		inputFromFile("words.txt", unsorted, sorted);

		new WordGUI(unsorted, sorted);
	}

	
	/**
	 * The function reads the input from the file into the 2 lists.
	 * @param filename The name of the file to read words from.
	 * @param x The List which will store the words in the order they are read.
	 * @param y The List which will store the words in alphabetical order.
	 */
	public static void inputFromFile(String filename, WordList x, WordList y){
		TextFileInput in = new TextFileInput(filename);
		String line = in.readLine();
		//Continues to take lines of input from the file until none are left.
		while (line != null){
			//Divides the Words in the line which are split up by ",".
			StringTokenizer st = new StringTokenizer(line, ",");
			//Put each Word of proper size into the Word array.
			while(st.hasMoreElements()){
				String check = st.nextToken();
				if (check.length() == Word.getWORD_SIZE()){
					x.append(check);
					y.insert(check);
				}
				else{
					System.out.println(check);
				}
				
			}
			line = in.readLine();
		}
		in.close();
	}

}