package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
	 String one = "Cat";
     String two = "Dog";
     String three = "Bird";
     String four = "Bird";
     
		StringEquality test = new StringEquality(one, two);
		System.out.println(test.toString());
	
		StringEquality testtwo = new StringEquality(three, four);
		System.out.println(testtwo.toString());
	{
	}
 }
}