//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

package unit11;
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//fixz this to point properly
		Dog bark[size];
		Dog *ptr = pups;
	}
	
	public void set(int spot, int age, String name)
	{
		Dog d = new Dog (age, name);
		if(spot >= 0 && spot < pups.length) {
			pups[spot] = d;
		}
	}

	public String getNameOfOldest()
	{
		String oldest = "";
		for(int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > pups[i + 1].getAge()) {
				oldest = pups[i].getName();
			}
			else oldest = pups[i+1].getName();
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		String youngest = "";
		for(int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < pups[i + 1].getAge()) {
				youngest = pups[i].getName();
			}
			else youngest = pups[i+1].getName();
		}
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}