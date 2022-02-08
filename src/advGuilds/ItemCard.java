package advGuilds;

/**
 * Item cards 
 * @author CergyTP
 *
 */
public class ItemCard extends Card {
	
	private itemType iType;

	ItemCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ITEM);
	}
	
	/**
	 * Constructor
	 * @param id Id of card, should be handled globally.
	 * @param price Price of item
	 * @param name name of item
	 * @param desc Description of item
	 * @param i type of item.
	 */
	ItemCard(int id, int price, String name, String desc, itemType i) {
		this(id, price, name, desc);
		this.iType = i;
	}
	
	public String getCardString() {
		return super.getCardString() + ", " + iType;
	}

	public itemType getiType() {
		return iType;
	}
	
	

}
