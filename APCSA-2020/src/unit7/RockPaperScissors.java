import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

  public void RockPaperScissors()
  {
    setPlayers;
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
	  if (player.equals("R")) {
				if (comp.equals("P")) {
					return "Computer";
				}
				else if (comp.equals("S")) {
					Return "Player";
				}
			}
		if (player.equals("P")) {
				if (comp.equals("R")) {
					return "Player";
				}
				else if (comp.equals("S")) {
					return "Computer";
				}
			}
		if (player.equals("S")) {
				if (comp.equals("R")) {
					return "Computer";
				}
				else if (comp.equals("P")) {
					return "Player";
	}

	public String returnString()
	{
		return "Player had" + playChoice + "\n Computer had" + compChoice + "\n" + determineWinner() + "wins!!" ;
	}
