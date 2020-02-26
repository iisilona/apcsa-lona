//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

package unit9;

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		List <Integer> nums = numArray;
		int dec = 0;
		int size = nums.size();
		
		for (int i = 0; i <= size - 2; i ++) {
			if (nums.get(i) < nums.get(i+1)) {
				dec ++;
			}
		}
		
		if (size >= 2){
			if (nums.get(size-1) < nums.get(size-2)) {
				dec ++;
			}
		}
		
		if (size < 2) {
			return false;
		}
		
		if (dec == 0) {
			return true;
		}
		return false;
	}	
}