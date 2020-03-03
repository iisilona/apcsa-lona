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
	private int deckSize;
	
	public Deck() {
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
		shuffle();
	}

	 public Deck(int[] vals, String[] suits, String[] ranks) {
		//loops through each card in deck
		for (int count = 0; count < vals.length; count++) {
			//loops through each suit
			for (int suit = 0; suit < suits.length; suit++) {
				//loops through each face
				for (int face = 0; face < ranks.length; face ++) {
					Card printCard = new Card(suits[suit], ranks[face], vals[count]);
					printCard.makeCustomCard(suits[suit], ranks[face], vals[count]);
					cards.add(printCard);
				}
			}
		}
		shuffle();
	}
	 
	 public boolean isEmpty() {
		 if (deckSize == 0) {
			 return true;
		 }
		 return false;
	 }
	
	public Card dealTopCard(int index) {
		return cards.get(index);
	}
	
	public int size() {
		deckSize = cards.size();
		return deckSize;
	}
	
	public Card deal() {
		if (isEmpty()) {
			return null;
		}
		for (int i = deckSize; i > 0; i--) {
			dealTopCard(i);
			deckSize = deckSize - 1;
			top = i+1;
		}
		return cards.get(0);
	}
   
	public void shuffle() {
		for (int k = 51; k <=1; k--) {
			int r = (int)Math.random()*(k);
			Collections.swap(cards,  r,  k);
		}
		deckSize = cards.size();
	}
}
