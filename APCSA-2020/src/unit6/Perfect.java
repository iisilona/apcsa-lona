package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
	setNumber(a);
	}
	
	public Perfect(int number) {
		setNumber(a);
	}
	
	public void setNumber(int number) {
		number = a;
	}

	public boolean isPerfect()
	{
		String[] toSearch = Divisors.getDivisors(number).split(" ");
		int[] ints = new int[toSearch.length];
		for (byte index = 0; index < ints.length; index++) {
			ints[index] = Integer.toSearchInt(toSearch[index]);
		}
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		return (sum == number);
	}

	public String toString() {
		return number + " is" + ((isPerfect()) ? " " : " not ") + "perfect.";
	}

	
}
