package unit7;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

  public void RockPaperScissors()
  {
  }
  
	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int)((Math.random())*(3-1) + 1);
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
		
	  if (playChoice.equals("R")) {
				if (compChoice.equals("P")) {
					return "Computer";
				}
				else if (compChoice.equals("S")) {
					return "Player";
				}
			}
	  
		if (playChoice.equals("P")) {
				if (compChoice.equals("R")) {
					return "Player";
				}
				else if (compChoice.equals("S")) {
					return "Computer";
				}
			}
		if (playChoice.equals("S")) {
				if (compChoice.equals("R")) {
					return "Computer";
				}
				else if (compChoice.equals("P")) {
					return "Player";
				}
	}
		return "here's your string you silly compiler";
}
	public String returnString()
	{
		return "Player had " + playChoice + "\n Computer had " + compChoice + "\n" + determineWinner() + " wins!!" ;
	}
}
