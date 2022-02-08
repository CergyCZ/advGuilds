/**
 * 
 */
package advGuilds;

/**
 * Card - generic card used in game. Should not be user. Use instead one of child classes.
 * @author Cergy
 *
 */
public class Card {
	private int id, price;
	private String name, description;
	private cardType cType;
	
	Card(int id, int price, String name, String desc){
		this.price = price;
		this.name = name;
		this.description = desc;
		this.id = id; // dodelat generator id
		System.out.println("Successfully created card " + id);
	}
	
	
	public String getCardString() {
		return new String (id + ", " + name + ", " + price + ", " + description);
	}
	
	public int getId() {
		return id;
	}


	public int getPrice() {
		return price;
	}


	public String getName() {
		return name;
	}


	public cardType getcType() {
		return cType;
	}


	public String getDescription() {
		return description;
	}


	protected void setcType(cardType cType) {
		this.cType = cType;
	}
	
	
}
