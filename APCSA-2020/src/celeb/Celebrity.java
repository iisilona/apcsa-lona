/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
package celeb;
public class Celebrity
{
	private String celebName;
	private String celebClue;

	public Celebrity(String answer, String clue)
	{
		celebName = answer;
		celebClue = clue;
	}

//gives clue
	public String getClue()
	{
		return celebClue;
	}

//gives answer
	public String getAnswer()
	{
		return celebName;
	}

//updates clue
	public void setClue(String clue)
	{
		celebClue = clue;
	}

//Updates answer
	public void setAnswer(String answer)
	{
		celebName = answer;
	}
	
//string rep of the celeb name
	public String toString()
	{
		return ("Celebrity name is" + celebName);
	}
	
}
