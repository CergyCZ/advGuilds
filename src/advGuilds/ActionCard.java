package advGuilds;

/**
 * Action Card
 * 
 * Card type, used for actions
 * @author CergyTP
 *
 */
public class ActionCard extends Card {
	
	private int bonus;
	private ActionType type;
	

	/**
	 * Constructor, calls Card superclass as well
	 * @param id should be globally generated for all cards
	 * @param price price of card to buy
	 * @param name name of the card
	 * @param desc description of the card
	 */
	ActionCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ACTION);
	}
	
	/**
	 * Constructor, calls Card superclass as well
	 * @param id should be globally generated for all cards
	 * @param price price of card to buy
	 * @param name name of the card
	 * @param desc description of the card
	 * @param type Action type. 
	 * @param bonus Bonus value for adding to chosen stat
	 */
	ActionCard(int id, int price, String name, String desc, ActionType type, int bonus) {
		this(id, price, name, desc);
		this.type = type;
		this.bonus = bonus;
	}
	
	public String getCardString() {
		return super.getCardString() + ", " + type + ", " + bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public ActionType getType() {
		return type;
	}
	
	

}
