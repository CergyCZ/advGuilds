package advGuilds;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
	
		
		Deck questDeck = new Deck();
		Deck itemDeck = new Deck();
		Deck actionDeck = new Deck();
		Deck adventurerDeck = new Deck();
		
		CardInitializer gameCards = new CardInitializer();

		questDeck = gameCards.getQuestDeck();
		itemDeck = gameCards.getItemDeck();
		actionDeck = gameCards.getActionDeck();
		adventurerDeck = gameCards.getAdventurerDeck();
		
		Player player1 = new Player();
		
		player1.addGold(10);
		System.out.println(player1.getCurrentGold());
		player1.buyCard(itemDeck.passCard(0));
		player1.buyCard(itemDeck.passCard(0));
		
		System.out.println(player1.getCurrentGold());
		player1.moveFromHandToMat(player1.getHand().topCard());
		
		
		player1.moveFromHandToMat(player1.getHand().topCard());
		player1.moveFromHandToMat(player1.getHand().topCard());
		
		for(Card c: player1.getHand().getDeck()) {
			System.out.println(c.getCardString());
		}
		
		
		
		
		

	}

}
