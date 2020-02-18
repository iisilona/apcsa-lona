package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int index = 0;
		while (index != -1) {
			index = cleaned.indexOf(lookFor);
			cleaned = cleaned.substring(0, index) + cleaned.substring(index + 1);
			index = cleaned.indexOf(lookFor);
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}
