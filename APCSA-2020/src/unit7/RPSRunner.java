//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
    while (response.equals("y"))
    {
      System.out.println("pick your weapon [R,P,S] :: ");
			String player = keyboard.toString();
      RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(player);
      game.returnString();
			System.out.println("Would you like to play again? [y/n] ::");
      response = keyboard.toString();
    }
	}
}

