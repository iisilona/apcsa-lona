//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package unit9;

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for(int i = 0; i <= ray.size()-1; i++) {
			if (ray.get(i)%2 != 0) {
				for (int j = ray.size()-1; j >= 0; j--) {
					if (ray.get(j)%2 == 0) {
						return j-i;
					}
				}
				return -1;
			}
		}
		return -1;
	}
}
