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

public class Distance
{
	  int xOne,yOne,xTwo,yTwo;
	 double distance;

	public void doDistance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

		public void setCoordinates(int x1, int y1, int x2, int y2)
		{
			xOne = x1;
			xTwo = x2;
			yOne = y1;
			yTwo = y2;
		}

    public void calcDistance()
	{
	distance = (Math.sqrt (Math.pow ((double)(xTwo-xOne) , 2.0) + Math.pow (  ((double)(yTwo-yOne)), 2.0 )));
	}
	
	public void print()
	{
		System.out.println(" Distance ==" + distance);
	}
	}
