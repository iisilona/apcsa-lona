//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	public static boolean go(int[] numArray)
	{
		int val;
		for (int i =1; i <= numArray.length -1; i++) {
			val = numArray[i-1];
			if (val <= numArray[i]) {
				return false;
			}
		}
		return true;
	}	
