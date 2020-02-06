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

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

//runner calls milesperhour
  public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(distance, hours, minutes);
	}
	
   public void setNums(int dist, int hrs, int mins)
			{
			distance=dist;
			hours=hrs;
			minutes=mins;
			}
			
//runner calls calcMPH
	public void calcMPH()
	{
	mph=(distance/((double)hours+(minutes/60)));
	}
	
//runner calls print
	public void print()
	{
	System.out.println(" Ok! You travelled " + distance + " miles in " + hours + " hours and " + minutes + " minutes.");
	System.out.println( "Your speed was " + mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}