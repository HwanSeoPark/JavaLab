package com.intheeast.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class StandardDeck implements Deck{

	private List<Card> entireDeck;
    
    // ...
    
    public void sort() {
        Collections.sort(entireDeck);
    }

	
	public List<Card> getCards() {
		return null;
	}

	
	public Deck deckFactory() {
		return this;
	}

	
	public int size() {
		return entireDeck.size();
	}


	public void addCard(Card card) {
		entireDeck.add(card);
	}

	
	public void addCards(List<Card> cards) {
		for(Card card : cards) {
			entireDeck.add(card);
		}
	}

	
	public void addDeck(Deck deck) {
		
	}

	
	public void shuffle() {
		
	}

	
	public void sort(Comparator<Card> c) {
		
	}

	
	public String deckToString() {
		return null;
	}

	
	public Map<Integer, Deck> deal(int players, int numberOfCards) throws IllegalArgumentException {
		return null;
	}
    
    // ...
}
