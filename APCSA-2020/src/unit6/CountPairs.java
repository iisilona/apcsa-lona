package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int index = 1; index <= str.length() - 1; index++) {
			if (str.charAt(index) == str.charAt(index - 1))
				count++;
		}
		return count;
			
	}
}
