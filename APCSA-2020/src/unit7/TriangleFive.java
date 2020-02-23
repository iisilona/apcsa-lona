//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

package unit7;

import static java.lang.System.*;

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output;
		char temp = letter;
		for (int i = 0; i < amount; i++){
			
      for (int b = 0; b < (amount - i); b++){
				if (b == 0)
					temp = letter;

				else if (temp == 'Z' && b > 0)
					temp = 'A';

				else
					temp++;

				for (int c = 0; c < (amount - b); c++)
					output += temp;
				output += " ";
			}
      
			output += "\n";
		}
		return output;
	}
