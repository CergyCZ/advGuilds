package advGuilds;

import java.util.ArrayList;

public class Player {
	
	private int gold, fame;
	private Deck hand;
	private Deck mat;
		
	public Deck getHand() {
		return hand;
	}


	public Deck getMat() {
		return mat;
	}



	Player(){
		gold = 10;
		fame = 0;
		hand = new Deck();
		mat = new Deck();
	}
	
	public void giveCardToHand(Card c) {
		//da kartu hraci do ruky;
		hand.addCard(c);
	}
	
	public boolean removeCardFromHand(Card c) {
		// sebere hraci kartu z ruky
		if(hand.containsCard(c)) {
			return hand.removeCard(c);
		}
		else return false;
	}
	
	public void giveCardToMat(Card c) {
		//da kartu hraci na mat;
		mat.addCard(c);
	}
	
	public boolean removeCardFromMat(Card c) {
		// sebere hraci kartu z matu
		if(mat.containsCard(c)) {
			return mat.removeCard(c);

		}
		else return false;
	}
	
	public boolean moveFromHandToMat(Card c) {
		// sebere hraci kartu z ruky, da do matu
		
		return Deck.moveCard(hand, mat, c);
	}
	
	public boolean moveFromMatToHand(Card c) {
		return Deck.moveCard(mat, hand, c);
	}

	public int getCurrentGold() {
		return gold;
	}

	public int getCurrentFame() {
		return fame;
	}
	
	public void addGold(int x) {
		if (x>0) {
		gold += x;
		}
	}
	
	public boolean payGold(int x) {
		// Pokud ma hrac dost penez, zaplati castku a vrati true. Pokud ne, vrati false
		if (gold - x >= 0) {
			gold -= x;
			return true;
		}
		else return false;
	}
	
	public int removeGold(int x) {
		// slouzi ke kradeni zlata. Ukradne maximalne x, pokud ma hrac min, ukradne do 0
		if (gold - x >= 0) {
			gold -= x;
		}
		else {
			x = gold;
			gold = 0;
		}
		return x;
	}
	
	public void alterFame(int x) {
		// slouzi k uprave vehlasu
		if (fame + x >= 0) {
			fame += x;
		}
		else {
			fame = 0;
		}

	}
	
	public boolean buyCard(Card c){
		if (payGold(c.getPrice())) {
			giveCardToHand(c);
			return true;
		}
		else return false;
	}
	
	
	

}
