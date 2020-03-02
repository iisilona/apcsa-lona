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
	private String customsuitName = "";
	private String customfaceName = "";
	private int customRank = 0;
	
	public Card(String string, int i) {
		faceNum = i;
		suitName = string;
		toString();
	}
	
	public void makeCard(String suit, int face) {
		setFace();
		setSuit();
	}
	
	public void makecustomCard(String suit, String rank, int face) {
		setcustomFace(face);
		setSuit();
		setRank();
	}
	
	public int setRank(String rank) {
		return  
	}
	
	public String setcustomFace(int face) {
		face
	}
	public String setFace() {
		faceName = FACES[faceNum];
		return faceName;
	}
	
	public String setSuit() {
		return suitName;
		}

	public String toString() {
		return (FACES[faceNum] + " of " + suitName);
	}
}
 