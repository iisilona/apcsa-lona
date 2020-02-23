//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

package unit7;

import static java.lang.System.*;


public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive tri = new TriangleFive();
	   tri.setAmount(4);
	   tri.setLetter('C');
	   System.out.println(tri);
	   
	   tri.setAmount(5);
	   tri.setLetter('A');
	   System.out.println(tri);
	   
	   tri.setAmount(7);
	   tri.setLetter('B');
	   System.out.println(tri);
	   
	   tri.setAmount(6);
	   tri.setLetter('X');
	   System.out.println(tri);
	   
	   tri.setAmount(8);
	   tri.setLetter('Z');
	   System.out.println(tri);
	}
}
