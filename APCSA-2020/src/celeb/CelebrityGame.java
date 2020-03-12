package celeb;
import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	
	private String gameCelebrity;
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	public CelebrityFrame gameWindow;
	/**
	 * The GUI frame for the Celebrity game.
	 */

	private ArrayList <Celebrity> celebGameList;

	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow = new CelebrityFrame(this);
	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 */
	public void prepareGame()
	{
		celebGameList = new ArrayList<Celebrity>();
		gameWindow.replaceScreen("START");
	}

	// Determines if the supplied guess is correct.
	public boolean processGuess(String guess)
	{
		String myGuess = guess.trim();
		if (myGuess.equalsIgnoreCase(gameCelebrity)) {
			return true;
		}
		else return false;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play()
	{
		if (celebGameList != null && celebGameList.size() > 0 )
		{
		this.gameCelebrity = celebGameList.get(0);
		gameWindow.replaceScreen("GAME");
		}
	}

	public void addCelebrity(String name, String guess, String type)
	{
		if (validateCelebrity(name) == true) {
			Celebrity c = new Celebrity(name, guess);
			celebGameList.add(c);
		}
	}

	public boolean validateCelebrity(String name)
	{
		if (name.length() <= 4) {
			return false;
		}
		return true;
	}

	public boolean validateClue(String clue, String type)
	{
		if (clue.length() <= 10) {
			return false;
		}
		else return true;
	}

	public int getCelebrityGameSize()
	{
		return celebGameList.size();
	}

	/**
	 * Accessor method for the games clue to maintain low coupling between
	 * classes
	 * 
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return gameCelebrity.getClue();
	}

	/**
	 * Accessor method for the games answer to maintain low coupling between
	 * classes
	 * 
	 * @return The String answer from the current celebrity.
	 */
	public String sendAnswer()
	{
		gameCelebrity.getAnswer();
	}
}
