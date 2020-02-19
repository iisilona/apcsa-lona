package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
	setNumber(a);

	
	public Perfect(int number) {
		setNumber(a);
	}
	
	public void setNumber(int number) {
		number = a;
	}

	public boolean isPerfect()
	{
	   int divSum = 0;
	    	while (divSum < number)
	    		if (number % 2 == 0) {
	    			divSum = divSum + (number/2);
	    		}
	}

	public String toString() {
		return number + " is" + ((isPerfect()) ? " " : " not ") + "perfect.";
	}

	
}
