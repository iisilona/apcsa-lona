package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
	public Perfect(int number) {
		setNumber(a);
	}
	
	public void setNumber(int number) {
		number = a;
	}

	public boolean isPerfect()
	{
		
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (sum == number) {
			return (sum == number);
		}
		return (sum != number);
	}

	public String toString() {
		return number + " is" + ((isPerfect()) ? " " : " not ") + "perfect.";
	}

	
}
