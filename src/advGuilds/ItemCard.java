package advGuilds;

public class ItemCard extends Card {
	
	private itemType iType;

	ItemCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ITEM);
	}
	
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
