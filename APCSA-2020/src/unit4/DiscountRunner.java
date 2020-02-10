package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

import unit3.MilesPerHour;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		Discount test = new Discount();
        test.getDiscountedBill(amt);
        System.out.print("Bill after discount :: ");
        System.out.printf("%.3f\n",amt);
        
        out.print("Enter the original bill amount :: ");
		double amtA = keyboard.nextDouble();
		
		Discount testA = new Discount();
        testA.getDiscountedBill(amt);
        System.out.print("Bill after discount :: ");
        System.out.println(amt);

	}
}