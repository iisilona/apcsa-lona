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
		{
		if(test.checkEquality()) {
			 System.out.println(test.toStringtrue());
		 }
		 else System.out.println(test.toStringfalse());
		}
	
	StringEquality testtwo = new StringEquality(three, four);
	{
	 if(test.checkEquality()) {
		 System.out.println(testtwo.toStringtrue());
	 }
	 else System.out.println(testtwo.toStringfalse());
	}
 }
}