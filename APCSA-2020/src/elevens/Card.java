//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package elevens;
import java.util.Random;
import static java.lang.System.*;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private int faceNum = 0;
	private String suitName = "";
	private String faceName = "";
	
	public Card(String string, int i) {
		faceNum = i;
		suitName = string;
	}
	
	public String makeCard(String suit, int face) {
		setFace();
		setSuit();
		return(toString());
	}
	
	public String setFace() {
		faceName = FACES[faceNum];
		return FACES[faceNum];
	}
	
	public String setSuit() {
		return suitName;
		}

	public String toString() {
		return (faceName + " of " + suitName);
	}
}
 