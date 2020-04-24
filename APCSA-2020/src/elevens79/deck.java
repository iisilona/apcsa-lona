import java.util.List;
import java.util.ArrayList;


public class Deck {

	//Arrays code 
	 /*
	 private Card[] cards;
	 private int size;
	 */
	
	//ArrayList code
	private ArrayList <Card> cards = new ArrayList<Card>();
	private int size;



	public Deck(String[] ranks, String[] suits, int[] values) {
		// Arrays code
		/*
		cards = new Card[ranks.length*suits.length];
		size = ranks.length*suits.length;
		int index=0;
		for (int rank = 0; rank<ranks.length; rank+=1) {
			for (int suit = 0; suit<suits.length; suit+=1) {
		 		cards[index] = new Card(ranks[rank], suits[suit], values[rank]);
				index+=1;
			}
		}
		*/
		
		//ArrayList code
		size = ranks.length*suits.length;
		for (int rank = 0; rank<ranks.length; rank+=1) { 
			for (String suit: suits) {
				cards.add(new Card(ranks[rank], suit, values[rank]));
			}
		}
	}



	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
	}


	public int size() {
		return size;
	}


	public void shuffle() {
		// Arrays code
		/*
		Card copyValue;
		int shuffleIndex;
		
		for (int i = cards.length-1; i>=0; i-=1) {
			shuffleIndex = (int)(Math.random()*(i+1));
			copyValue = cards[shuffleIndex];
			cards[shuffleIndex]=cards[i];
			cards[i]=copyValue;
		}
		
		size=cards.length;
		*/
		
		Card copyValue;
		int shuffleIndex;
		
		for (int i = cards.size()-1; i>=0; i-=1) {
			shuffleIndex = (int)(Math.random()*(i+1));
			copyValue = cards.get(shuffleIndex);
			cards.add(shuffleIndex, cards.get(i));
			cards.add(i, copyValue);
		}
		
		size=cards.size();
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* Arrays code
		if (size<=0) {
			return null;
		}
		size-=1;
		return cards[size];
		*/
		
		//ArrayList code
		if (size<=0) {
			return null;
		}
		size-=1;
		return cards.get(size);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
	/* Arrays code
		String rtn = "size = " + size + "\nUndealt cards: \n";
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\n";
		return rtn;
	*/
		
	//ArrayList code
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
	
	
}
