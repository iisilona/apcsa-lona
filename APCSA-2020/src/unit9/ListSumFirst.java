//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package unit9;

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{pull 
		int val = ray.get(0);
		int sum = 0;
		for (int i = 0; i <= ray.size()-1; i++) {
			if (ray.get(i) > val) {
				sum += ray.get(i);
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
}
