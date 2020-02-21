//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int)(Math.random() * (3) + 1);
		switch (num) {
		case 1: compChoice = "R";
		break;
		case 2 : compChoice = "P";
		break;
		case 3: compChoice = "S";
		break;
		}
	}

	public String determineWinner()
	{
		if (playChoice.equals(compChoice))
		{
			return "Nobody";
		}
	
	}

	public String toString()
	{
		String output=("Player had" + playChoice + "\n Computer had" + compChoice + "\n" + determineWinner() + "wins!!" );
		return output;
	}
}