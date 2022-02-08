package advGuilds;

import java.util.ArrayList;

/**
 * Player Class used for players in game. Every player has his hand deck and a mat (also deck)
 * gold amount and fame.
 * @author CergyTP
 *
 */
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



	/**
	 * Constructor
	 */
	Player(){
		gold = 10;
		fame = 0;
		hand = new Deck();
		mat = new Deck();
	}
	
	/**
	 * Gives card to player's hand.
	 * @param c card to be given.
	 */
	public void giveCardToHand(Card c) {
		//da kartu hraci do ruky;
		hand.addCard(c);
	}
	
	/**
	 * removes card from player's hand.
	 * @param c card to be removed
	 * @return true if successful
	 */
	public boolean removeCardFromHand(Card c) {
		// sebere hraci kartu z ruky
		if(hand.containsCard(c)) {
			return hand.removeCard(c);
		}
		else return false;
	}
	
	/**
	 * gives a card to player's mat
	 * @param c card to be given to mat.
	 */
	public void giveCardToMat(Card c) {
		//da kartu hraci na mat;
		mat.addCard(c);
	}
	
	/**
	 * removes a card from player's mat
	 * @param c card
	 * @return true if successful.
	 */
	public boolean removeCardFromMat(Card c) {
		// sebere hraci kartu z matu
		if(mat.containsCard(c)) {
			return mat.removeCard(c);

		}
		else return false;
	}
	
	/**
	 * moves a card from hand to mas
	 * @param c card
	 * @return true if successful.
	 */
	public boolean moveFromHandToMat(Card c) {
		// sebere hraci kartu z ruky, da do matu
		
		return Deck.moveCard(hand, mat, c);
	}
	
	/**
	 * moves card from mat to hand
	 * @param c card
	 * @return true if successful
	 */
	public boolean moveFromMatToHand(Card c) {
		return Deck.moveCard(mat, hand, c);
	}

	public int getCurrentGold() {
		return gold;
	}

	public int getCurrentFame() {
		return fame;
	}
	
	/**
	 * adds gold to players stash. If added amount is smaller than 1, does nothing
	 * @param x amount of gold.
	 */
	public void addGold(int x) {
		if (x>0) {
		gold += x;
		}
	}
	
	
	/**
	 * Tries to pay gold from players stash. It player doesn't have enough gold, returns false.
	 * @param x amount of gold to be removed
	 * @return true if player has enough gold.
	 */
	public boolean payGold(int x) {
		// Pokud ma hrac dost penez, zaplati castku a vrati true. Pokud ne, vrati false
		if (gold - x >= 0) {
			gold -= x;
			return true;
		}
		else return false;
	}
	
	
	/**
	 * removes X gold from player. If he has less than X, returns all he has.
	 * @param x amount of gold to be taken.
	 * @return amount of gold actually taken.
	 */
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
	
	/**
	 * alters fame by X. Minimal fame is still zero.
	 * @param x amount of fame to be added / substracted.
	 */
	public void alterFame(int x) {
		// slouzi k uprave vehlasu
		if (fame + x >= 0) {
			fame += x;
		}
		else {
			fame = 0;
		}

	}
	/**
	 * Buy card and pay it's price. Card goes to player's hand
	 * @param c Card to be bought
	 * @return true if player has enough money to pay.
	 */
	public boolean buyCard(Card c){
		if (payGold(c.getPrice())) {
			giveCardToHand(c);
			return true;
		}
		else return false;
	}
	
	
	

}
