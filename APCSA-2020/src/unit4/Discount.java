package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	
	public static double getDiscountedBill(double amt)
	{
		if (amt <= 2000) {
			return amt;
		    }
			if (amt > 2000) {
			 return (amt-(0.15*amt));
			}
			return 0.0;
	}
	
	
}