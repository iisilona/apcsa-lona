package unit5;

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private int compare;
	
	public WordsCompare() {
	}
	
	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}
	
	public int compare() {
	      return wordOne.compareTo(wordTwo);
	}
	
	public String toString() {
		if (compare() > 0)
			return wordOne + " should be placed before " + wordTwo + "\n";
		 else
			return wordOne + " should be placed after " + wordTwo + "\n";
     }
}