package advGuilds;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> deckArrayList;
	
	
	
	
	public Deck() {
		deckArrayList = new ArrayList<Card>();
	}

	public Deck(ArrayList<Card> deck) {
		this.deckArrayList = deck;
	}
	
	public boolean addCard(Card c) {
		return deckArrayList.add(c);
	}
	
	public Card passCard(Card c) {
		if (deckArrayList.contains(c)) {
			deckArrayList.remove(c);
			return c;
		}
		else return null;
	}
	
	public Card passCard(int listPosition) {
		
		if(deckArrayList.size() > listPosition) {
			Card c = deckArrayList.get(listPosition);
			if(this.removeCard(c)) return c;
			else return null;
		}
		else return null;
	}
	
	public boolean removeCard(Card c) {
		if (deckArrayList.contains(c)) {
			deckArrayList.remove(c);
			return true;
		}
		else return false;
	}
	
	public static boolean moveCard(Deck fromDeck, Deck toDeck, Card card) { //možná static?
		if(fromDeck.containsCard(card)) {
			toDeck.addCard(card);
			fromDeck.removeCard(card);
			return true;
		}
		else return false;
	}
	
	public boolean moveCard(Deck toDeck, Card card) {
		return moveCard(this, toDeck, card);
	}
	
	public boolean containsCard(int cardId) {
		for(Card c: deckArrayList) {
			if(c.getId() == cardId) return true;
		}
		return false;
	}
	
	public boolean containsCard(Card card) {
		return deckArrayList.contains(card);
	}
	
	public ArrayList<Card> getDeck() {
		return this.deckArrayList;
	}
	
	public void shuffleDeck() {
		Collections.shuffle(deckArrayList);
	}
	
	public Card topCard() {
		if(deckArrayList.size() > 0) return deckArrayList.get(0);
		else return null;
	}

}
