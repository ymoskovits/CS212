/**
 * 
 * @author Julian Moskovits
 * The WordNode class contains data in the form of a word and a pointer to the next WordNode in a list.
 *
 */
public class WordNode {
	/**
	 * The actual data to be stored.
	 */
	protected Word data;
	
	/**
	 * A pointer to the next Node in a List.
	 */
	protected WordNode next;
	
	
	/**
	 * The constructor takes one Word parameter and stores it in the data field.
	 * It sets the "next" pointer to null.
	 * @param x The data to be stored in the Node.
	 */
	public WordNode(Word x){
		data = x;
		next = null;
	}
}
