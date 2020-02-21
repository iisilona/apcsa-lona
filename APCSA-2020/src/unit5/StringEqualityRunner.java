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

	 String one = "hello";
     String two = "goodbye";
     String three = "one";
     String four = "two";
     String five = "three";
     String six = "four";
     String seven = "TCEA";
     String eight = "UIL";
     String nine = "State";
     String ten = "Champions";
     String eleven = "ABC";
     String twelve = "ABC";
     String thirteen = "CBA";
     String fourteen = "ABC";
     String sixteen = "Same";
     String fifteen = "Same";
     
		StringEquality test = new StringEquality(one, two);
		System.out.println(test.toString());
	
		StringEquality testtwo = new StringEquality(three, four);
		System.out.println(testtwo.toString());
		
		StringEquality testthree = new StringEquality(five, six);
		System.out.println(testthree.toString());
		
		StringEquality testfour = new StringEquality(seven, eight);
		System.out.println(testfour.toString());
		
		StringEquality testfive = new StringEquality(nine, ten);
		System.out.println(testfive.toString());
		
		StringEquality testsix = new StringEquality(eleven, twelve);
		System.out.println(testsix.toString());
		
		StringEquality testseven = new StringEquality(thirteen, fourteen);
		System.out.println(testseven.toString());
		
		StringEquality testeight = new StringEquality(fifteen, sixteen);
		System.out.println(testeight.toString());
	}
 }
