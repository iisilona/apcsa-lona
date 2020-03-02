//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package elevens;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {

	public static final int NUMCARDS = 52;
	public static String SUIT[] = {"CLUBS", "HEARTS", "DIAMONDS", "SPADES"};
	
	private List<Card> cards;
	private int top;
	
	public void makeDeck() {
		//loops through each card in deck
		for (int count = 1; count <= NUMCARDS; count++) {
			//loops through each suit
			for (int suit = 1; suit <= 4; suit++) {
				//loops through each face
				for (int face = 1; face <= 13; face ++) {
					Card printCard = new Card(SUIT[suit], face);
					printCard.makeCard(SUIT[suit], face);
					cards.add(printCard);
				}
			}
		}
	}

	 public void makeanyDeck(int[] vals, String[] suits, String[] ranks) {
		//loops through each card in deck
		for (int count = 0; count < vals.length; count++) {
			//loops through each suit
			for (int suit = 0; suit < suits.length; suit++) {
				//loops through each face
				for (int face = 0; face < ranks.length; face ++) {
					List<Card> customCards = new ArrayList<Card>();
					makecustomCard printCard = new makecustomCard()
					customCards.add(thisVal);
					customCards.add(thisSuit);
					customCards.add(thisRank);
				}
			}
		}
	}
}


   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
