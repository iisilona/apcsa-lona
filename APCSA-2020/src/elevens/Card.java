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
	private String rankName = "";
	
	public Card(String suit, int face) {
		makeCard(suit,face);
		toString();
	}
//card constructor with only 2 parameters
	
	public Card(String suit, String rank, int face) {
		makeCustomCard(suit, rank, face);
	}
//card constructor with 3 parameters
	
	public void makeCustomCard(String suit, String rank, int face) {
		setFace(face);
		setSuit(suit);
		setRank(rank);
	}
//makes a card given three parameters
	
	public void makeCard(String suit, int face) {
		setFace(face);
		setSuit(suit);
		toString();
	}
//makes a card given two parameters
	
	public String setRank(String rank) {
		rankName = rank;
		return  rankName;
	}
// all the methods that set values
	public String setFace(int face) {
		faceNum = face;
		faceName =  FACES[faceNum];
		return  faceName;
	}
	
	public String setSuit(String suit) {
		suitName = suit;
		return suitName;
		}

//methods to call to get rank, suit, and face
	public String rank() {
		return rankName;
	}
	
	public String suit() {
		return suitName;
	}
	
	public int pointValue() {
		return faceNum;
	}
	
//tostring, obviously
	public String toString() {
		return (FACES[faceNum] + " of " + suitName + " , point value is " + faceNum );
	}
}
 