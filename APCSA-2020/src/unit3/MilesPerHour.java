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
	mph=(distance/(hours+(minutes/60)));
	}
	
//runner calls print
	public void print()
	{
	out.printf("Ok! You travelled (miles), mph, distance, hours, minutes);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}