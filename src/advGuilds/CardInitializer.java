package advGuilds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Class for reading Card files and initializing all Cards.
 * @author CergyTP
 *
 */
public class CardInitializer {
	
	

	
	
	Deck itemDeck;
	Deck questDeck;
	Deck adventurerDeck;
	Deck actionDeck;
	
	Scanner lineScanner;
	int id;
	String itemFileName = "itemCardsData";
	String questFileName = "questCardsData";
	String actionFileName = "actionCardsData";
	String adventurerFileName = "adventurerCardsData";
	String path = new String("src/advGuilds/cardsData/");
	
	
	/**
	 * Constructor, calls loadCards method.
	 */
	public CardInitializer() {

		itemDeck = new Deck();
		adventurerDeck = new Deck();
		questDeck = new Deck();
		actionDeck = new Deck();
		id = 1000;
		
		loadCards();
		
	}
	
	/**
	 * reads all cards file and loads cards into decks. Decks are then shuffled.
	 */
	private void loadCards(){
		
		readCardsFile(itemFileName);
		readCardsFile(questFileName);
		readCardsFile(adventurerFileName);
		readCardsFile(actionFileName);
		itemDeck.shuffleDeck();
		questDeck.shuffleDeck();
		adventurerDeck.shuffleDeck();
		actionDeck.shuffleDeck();
		
		
		
	}
	

	
	public Deck getQuestDeck(){
		return this.questDeck;
	}
	public Deck getActionDeck(){
		return this.actionDeck;
	}
	public Deck getAdventurerDeck(){
		return this.adventurerDeck;
	}
	public Deck getItemDeck(){
		return this.itemDeck;
	}
	
	
	/**
	 * Shuffles deck of cards
	 * @param deck Deck to be shuffled
	 */
	public void shuffleDeck(ArrayList<Card> deck) {
		Collections.shuffle(deck);
	}
	
	
	/**
	 * Reads Files for cards.
	 * @param fileName name of the card file.
	 */
	private void readCardsFile(String fileName) {

		File cardFile = new File(path + fileName);
		try (Scanner lineScanner = new Scanner(cardFile)) { //tohle prej nemusi mit close()
			
			while(lineScanner.hasNextLine()) {
				
				if(fileName == itemFileName) {readItemLine(lineScanner.nextLine());}
				else if(fileName == questFileName) {readQuestLine(lineScanner.nextLine());}
				else if(fileName == adventurerFileName) {readAdventurerLine(lineScanner.nextLine());}
				else if(fileName == actionFileName) {readActionLine(lineScanner.nextLine());}
				else {System.out.println("Invalid File name.");}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error opening item cards file. File not found.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Error while reading item card price.");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("Error while reading item cards file.");
			e.printStackTrace();
		}
	}
	
	/**
	 * reads Item Card File's line and creates Card (or multiple cards of one type) from it
	 * @param line line from file with all needed parameters.
	 */
	private void readItemLine(String line) {
		String[] tmp = line.split(";");
		
		int price = Integer.parseInt(tmp[0]);
		String name = tmp[1];
		String desc = tmp[2];
		itemType iType = itemType.valueOf(tmp[3]);
		int repeat = Integer.parseInt(tmp[4]);
		
	    for(int i = 0; i < repeat; i++) { itemDeck.addCard(new ItemCard(getNewId(), price, name, desc, iType));}
		}
	
	/**
	 * reads Quest Card File's line and creates Card (or multiple cards of one type) from it
	 * @param line line from file with all needed parameters.
	 */
	private void readQuestLine(String line) {
		String[] tmp = line.split(";");
		int rewardGold = Integer.parseInt(tmp[0]);
		String name = tmp[1];
		String desc = tmp[2];
		String prereq = tmp[3];
		String reward = tmp[4];
		int repeat = Integer.parseInt(tmp[5]);
		
		for(int i = 0; i < repeat; i++) { questDeck.addCard(new QuestCard(getNewId(), 0, name, desc, prereq, reward, rewardGold));}
	}
	
	/**
	 * reads Adventurer Card File's line and creates Card (or multiple cards of one type) from it
	 * @param line line from file with all needed parameters.
	 */
	private void readAdventurerLine(String line) {
		String[] tmp = line.split(";");
		
		int price = Integer.parseInt(tmp[0]);
		String name = tmp[1];
		String desc = tmp[2];
		int speed = Integer.parseInt(tmp[3]);
		int power = Integer.parseInt(tmp[4]);
		String spPower = tmp[5];
		int repeat = Integer.parseInt(tmp[6]);
		
		for(int i = 0; i < repeat; i++) { 
			adventurerDeck.addCard(new AdventurerCard(getNewId(), price, name, desc, speed, power, spPower));
		}
	}
	
	/**
	 * reads Action Card File's line and creates Card (or multiple cards of one type) from it
	 * @param line line from file with all needed parameters.
	 */
	private void readActionLine(String line) {
		String[] tmp = line.split(";");
		
		int price = Integer.parseInt(tmp[0]);
		String name = tmp[1];
		String desc = tmp[2];
		ActionType aType = ActionType.valueOf(tmp[3]);
		int bonus = Integer.parseInt(tmp[4]);
		int repeat = Integer.parseInt(tmp[5]);
		
	    for(int i = 0; i < repeat; i++) { actionDeck.addCard(new ActionCard(getNewId(), price, name, desc, aType, bonus));}
	}
	
	
	/**
	 * Handles ID generation
	 * @return new ID number upon every call of method.
	 */
	private int getNewId() {
		return ++id;
	}

	

}
