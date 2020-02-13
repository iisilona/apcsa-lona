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
	public String wordOne, wordTwo;

	public StringEquality(String one, String two)
	{
		setWords(one,two);
		toString();
     }

	public void setWords(String one, String two)
	{
		wordOne =  one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
			if(wordOne.compareTo(wordTwo) == 0) {
				return true;
			}
			return false;
	}
	public String toString()
	{
		if (wordOne.equals(wordTwo))
			{
			return wordOne + " has the same letters as " + wordTwo + "\n";
			}
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}
