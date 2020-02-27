//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package unit9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownRunner
{
	public static void main( String args[] )
	{		
	ArrayList<Integer> nums;
	nums = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,1234));
	System.out.println(ListDown.go(nums));
	
	ArrayList<Integer> numsA;
	numsA = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
	System.out.println(ListDown.go(numsA));
	
	ArrayList<Integer> numsB;
	numsB= new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
	System.out.println(ListDown.go(numsB));
	
	ArrayList<Integer> numsC;
	numsC= new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
	System.out.println(ListDown.go(numsC));
	
	ArrayList<Integer> numsD;
	numsD= new ArrayList<Integer>(Arrays.asList(32767));
	System.out.println(ListDown.go(numsD));
	
	ArrayList<Integer> numsE;
	numsE= new ArrayList<Integer>(Arrays.asList(255,255));
	System.out.println(ListDown.go(numsE));
	
	ArrayList<Integer> numsF;
	numsF= new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,1000));
	System.out.println(ListDown.go(numsF));
	
	ArrayList<Integer> numsG;
	numsG= new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
	System.out.println(ListDown.go(numsG));
	
	ArrayList<Integer> numsH;
	numsH= new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,30));
	System.out.println(ListDown.go(numsH));
	
	ArrayList<Integer> numsI;
	numsI= new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
	System.out.println(ListDown.go(numsI));
	}
}