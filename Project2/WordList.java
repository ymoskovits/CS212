/**
 * 
 * @author Julian Moskovits
 * 
 * The WordList class can be used to create a Linked List of Words.
 * A list can either append words to the end of itself or insert a word to the proper alphabetical spot.
 *
 */
public class WordList {
	
	/**
	 * This is the Word which will be stored in the initial dummy Node.
	 */
	protected Word x = new Word(null);
	
	/**
	 * This is a pointer to the first Node in a list.
	 * It points to the dummy Node which acts as a placeholder for the beginning of the list.
	 */
	protected WordNode first = new WordNode(x);
	
	/**
	 * This is a pointer to the last Node in the list.
	 */
	protected WordNode last = first;
	
	/**
	 * The length variable keeps track of how many words are in a list.
	 */
	protected int length = 0;

	
	/**
	 * The append method adds a WordNode to the back of the list.
	 * @param s The String to be stored in the appended WordNode.
	 */
	public void append(String s){
		Word w = new Word(s);
		WordNode x = new WordNode(w);
		last.next = x;
		last = x;
		length++;
	}
	
	
	/**
	 * The insert method places a new WordNode in its proper alphabetical position.
	 * @param s The String to be stored in the inserted WordNode.
	 */
	public void insert(String s){
		Word w = new Word(s);
		WordNode WN = new WordNode(w);
		//Special case where we are inserting the first WordNode of the list.
		if (length == 0){
			WN.next = null;
			first.next = WN;
			last = WN;
			length++;
			return;
		}
		WordNode current = first.next;
		WordNode previous = first;
		//The loop goes through the list to find where to place the incoming WordNode.
		while(current != last){
			//If not up to correct position, continue to look for the proper position.
			if (WN.data.compareTo(current.data) > 0){
				previous = current;
				current = current.next;
			}
			//If correct position, insert WordNode.
			else{
				previous.next = WN;
				WN.next = current;
				length++;
				return;
			}
		}
		
		//Special case when comparing to the final Node in the list.
		if (WN.data.compareTo(last.data) > 0){
			last.next = WN;
			last = WN;
			length++;
			return;
		}
		else{
			previous.next = WN;
			WN.next = last;
			length++;
			return;
		}
		
	}
	
	/**
	 * This method goes through the entire list and combines each Word into one long string.
	 * @param x The WordList to be converted to a String.
	 * @return The String containing all of the Words in the list, each separated by a new line.
	 */
	public String toString(WordList x){
		String output = "";
		WordNode current = first.next;
		while(current.next != null){
			output = output + (current.data.getWord() + "\n");
			current = current.next;
		}
		output = output + current.data.getWord();
		return output;
	}
}
