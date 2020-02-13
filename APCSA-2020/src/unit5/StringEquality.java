//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		setWords(one,two);
		checkEquality();
     }

	public void setWords(String one, String two)
	{
		wordOne =  one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
			if(wordOne.equals(wordTwo)) {
				return true;
			}
			else return false;
	}

	public String toStringtrue()
	{
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
	
	public String toStringfalse()
	{
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}