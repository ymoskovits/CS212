/***************************************
 * Name: Julian Moskovits
 * Date: 3/14/2017
 * Description: Takes input words from a file and puts them into Word Objects.
 * 				Sorts them and displays them both unsorted and sorted in a GUI.
 **************************************/


import java.util.*;
public class Project1 {

	public static void main(String[] args) {
		Word[] result = inputFromFile("words.txt");
		int count = 0;
		
		//Counts the number of words in the input file.
		while (result[count] != null){
			count++;
		}
		Word[] unsorted = new Word[count];
		Word[] sorted = new Word[count];

		//Fills the 2 Word Arrays of proper size with the results from the input file.
		for (int i = 0; i < count; i++){
			unsorted[i] = result[i];
			sorted[i] = new Word(result[i].getWord());
		}
		selectionSort(sorted, sorted.length);
		new WordGUI(unsorted, sorted);
	}
	
	
	public static void selectionSort(Word[] array, int size){
		//Goes through the array and places the "lowest" unsorted Word in position i.
		for (int i = 0; i < size - 1; i++){
			int low = i;
			//Finds the "lowest" Word in the unsorted part of the array.
			for (int j = i + 1; j < size; j++){
				//Compares the jth Word to the Word stored in the "low" index.
				if (array[j].compareTo(array[low]) < 0){
					low = j;
				}
			}
			if (low != i){
				swap(array[low], array[i]);
			}
		}
	}

	
	public static Word[] inputFromFile(String filename){
		TextFileInput in = new TextFileInput(filename);
		Word[] words = new Word[100];
		String line = in.readLine();
		int i = 0;
		//Continues to take lines of input from the file until none are left.
		while (line != null){
			//Divides the Words in the line which are split up by ",".
			StringTokenizer st = new StringTokenizer(line, ",");
			//Put each Word of proper size into the Word array.
			while(st.hasMoreElements()){
				String check = st.nextToken();
				if (check.length() == Word.getWORD_SIZE()){
					words[i++] = new Word(check);
				}
				else{
					System.out.println(check);
				}
				
			}
			line = in.readLine();
		}
		in.close();
		return words;
	}
	
	//Swaps the Strings stored in the Word objects.
	public static void swap(Word x, Word y){
		String temp = x.getWord();
		x.setWord(y.getWord());
		y.setWord(temp);
	}
}