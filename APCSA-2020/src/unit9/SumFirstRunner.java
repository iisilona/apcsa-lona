//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package unit9;

import java.util.ArrayList;

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		List<Integer> numlist = new ArrayList<Integer>();
 		int [] vals = new int [] {-99,1,2,3,4,5,6,7,8,9,10,5};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {10,9,8,7,6,5,4,3,2,1,-99};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {10,20,30,40,50,-11818,40,30,20,10};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {32767};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {255,255};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {9,10,-88,100,-555,2};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals= new int [] {10,10,10,11,456};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {-111,1,2,3,9,11,20,1};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {9,8,7,6,5,4,3,2,0,-2,6};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {12,15,18,21,23,1000};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {250,19,17,15,13,11,10,9,6,3,2,1,0};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
		
		numlist = new ArrayList<Integer>();
		vals = new int [] {9,10,-8,10000,-5000,-3000};
		for (int s: vals) {
			numlist.add(s);
		}
		System.out.println(ListSumFirst.go(numlist));
	}
	}
}
