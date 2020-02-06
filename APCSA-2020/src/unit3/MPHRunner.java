package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.setNums(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		out.print("Enter the distance :: ");
		int distB = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrsB= keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minsB= keyboard.nextInt();

		MilesPerHour testB = new MilesPerHour(distB, hrsB, minsB);
		test.setNums(distB, hrsB, minsB);
		test.calcMPH();
		test.print();

		out.print("Last time, I promise. Enter the distance :: ");
		int distC = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrsC= keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int minsC= keyboard.nextInt();

		MilesPerHour testC = new MilesPerHour(distC, hrsC, minsC);
		test.setNums(distC, hrsC, minsC);
		test.calcMPH();
		test.print();
	}
}