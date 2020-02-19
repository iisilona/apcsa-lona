package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public toSet(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void tPrint()
	{
		for (int i = word.length(); i > -1; i--) {
			System.out.println(word.substring(0, i));
		}
	}
}
