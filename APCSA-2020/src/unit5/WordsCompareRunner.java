//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

package unit5;

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare s = new WordsCompare();
        s.setWords("abe", "ape");
	System.out.println(s.toString());
        s.setWords("giraffe", "gorilla");
	System.out.println(s.toString());
        s.setWords("one", "two");
	System.out.println(s.toString());
        s.setWords("fun", "funny");
	System.out.println(s.toString());
        s.setWords("123", "19");
	System.out.println(s.toString());
        s.setWords("193", "1910");
	System.out.println(s.toString());
        s.setWords("goofy", "godfather");
	System.out.println(s.toString());
        s.setWords("funnel", "fun");
	System.out.println(s.toString());
        
	}
}
