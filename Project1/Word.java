
public class Word {
	private static int WORD_SIZE = 3;
	private String word = null;
	
	public Word(String s){
			word = s;
	}
	
	public String getWord(){
		return word;
	}
	
	public void setWord(String s){
		word = s;
	}
	
	public static int getWORD_SIZE(){
		return WORD_SIZE;
	}
	
	public int compareTo(Word other){
		return (word.compareTo(other.word));
	}
}
