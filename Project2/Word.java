/**
 * 
 * @author Julian Moskovits
 * 
 * The Word class stores a Word in the form of a String and has get and set methods for the Word.
 *
 */
public class Word {
	/**
	 * WORD_SIZE is a variable that determines whether a String from the input file is of valid length.
	 */
	private static int WORD_SIZE = 3;
	
	/**
	 * Word is the String stored in the class.
	 */
	private String word = null;
	
	
	/**
	 * The constructor takes a String and puts it into the word variable.
	 * @param s The string to be placed in the word variable.
	 */
	public Word(String s){
			word = s;
	}
	
	
	/**
	 * Gets the String stored in a Word Object.
	 * @return The string stored in Word.
	 */
	public String getWord(){
		return word;
	}
	
	
	/**
	 * Gives the word variable the string passed to the set method.
	 * @param s The String to be stored in the word variable.
	 */
	public void setWord(String s){
		word = s;
	}
	
	
	/**
	 * Gets the WORD_SIZE variable.
	 * @return The WORD_SIZE.
	 */
	public static int getWORD_SIZE(){
		return WORD_SIZE;
	}
	
	
	/**
	 * Uses the compareTo method for Strings to compare 2 words.
	 * @param other The Word to be compared.
	 * @return A number representing whether the other word is before, after or equal to this word alphabetically.
	 */
	public int compareTo(Word other){
		return (word.compareTo(other.word));
	}
}
