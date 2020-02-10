package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num%2 == 1) {
		return true;
		}
		if (num%2 == 0) {
		return false;
		}
		return true;
	}
	public static boolean isEven( int num )
	{
		if (num%2 ==0) {
		return true;
		}
		if (num%2 == 1) {
		return false;
		}
		return true;
	}	
}