package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		int index = sentence.indexOf(lookFor);
		while (index != -1) {
			sentence = sentence.substring(0, index) + sentence.substring(index + 1, sentence.length());
			index = sentence.indexOf(lookFor);
		}
		return sentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}

	public String finalString()
	{
		return sentence;
	}
}
