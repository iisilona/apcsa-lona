//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

package unit7;

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble();
		run.setDoubles(4.5, 6.7, 7.8, 9.0);
		run.printArray();
		System.out.println("\n biggest = " + run.getBiggest() + "\n");

		 run.setDoubles(14.51, 6.17, 71.8, 1.0);
		 run.printArray();
		System.out.println("\n biggest = " + run.getBiggest() + "\n");
		
		 run.setDoubles(41.15, 816.7, 17.8, 19.0);
		 run.printArray();
		System.out.println("\n biggest = " + run.getBiggest() + "\n");
		
			
		  run.setDoubles(41.15, 816.7, 17.8, 19.0);
		  run.printArray();
		   System.out.println("\n biggest = " + run.getBiggest() + "\n");

		   run.setDoubles(884.5, 16.7, 7.8, 9.0);
		   run.printArray();
			System.out.println("\n biggest = " + run.getBiggest() + "\n");
			
			run.setDoubles(4.5, -456.7, 677.8, 9.0);
			run.printArray();
			System.out.println("\n biggest = " + run.getBiggest() + "\n");
			
			run.setDoubles(4.5, 16.7, -7.8, -9.0);
			run.printArray();
			System.out.println("\n biggest = " + run.getBiggest() + "\n");
				
	}
}