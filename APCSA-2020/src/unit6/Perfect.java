package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;


	public Perfect() {
	}
	
	public void setNumber(int a) {
		number = a;
	}

	public boolean isPerfect()
	{
	   int divSum = 0;
	    	while (divSum < number)
	    		if (number % 2 == 0) {
	    			divSum = divSum + (number/2);
	    		}
	     if (divSum == number)
	     {
	    	 return true;
	     }
	     else return false;
	}

	public String toString() {
		return number + " is" + ((isPerfect()) ? " " : " not ") + "perfect.";
	}	
}
