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
		String response = "y";
  while (response.equals("y"))
    {
	  Scanner keyboard = new Scanner(in);
	  RockPaperScissors game = new RockPaperScissors();	
	  
	  out.print("Pick your weapon [R,P,S] :: ");
	  		String player = keyboard.nextLine();
	  		game.setPlayers(player);
	  		System.out.println(game.returnString());
	  		
	  	System.out.println("Would you like to play again? [y/n] ::");
	  	response = keyboard.nextLine();
	  	System.out.println(" Farewell!");
    }
}
}