package advGuilds;

/**
 * Adventurer Card class, inherits Card class.
 * @author CergyTP
 *
 */
public class AdventurerCard extends Card {
	
	private int speed, power;
	private String specialAbility;

	/**
	 * Constructor to create Adventurer Card
	 * @param id ID, should be set globally and unique for every card
	 * @param price price of Adventurer Card
	 * @param name Name of Adventurer
	 * @param desc Description of Adventurer and his special ability
	 */
	AdventurerCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ADVENTURER);
	}
	
	/**
	 * Constructor to create Adventurer Card
	 * @param id ID, should be set globally and unique for every card
	 * @param price price of Adventurer Card
	 * @param name Name of Adventurer
	 * @param desc Description of Adventurer and his special ability
	 * @param speed Speed of Adventurer. Basic stat for determining order in which Adventurers take turn on Quests
	 * @param power Power of Adventurer. Used to determine success
	 * @param spAb Special Ability. Bonus to certain things.
	 */
	AdventurerCard(int id, int price, String name, String desc, int speed, int power, String spAb) {
		this(id, price, name, desc, speed, power);
		this.specialAbility = spAb;
	}
	
	/**
	 * Constructor to create Adventurer Card
	 * @param id ID, should be set globally and unique for every card
	 * @param price price of Adventurer Card
	 * @param name Name of Adventurer
	 * @param desc Description of Adventurer and his special ability
	 * @param speed Speed of Adventurer. Basic stat for determining order in which Adventurers take turn on Quests
	 * @param power Power of Adventurer. Used to determine success
	 */
	AdventurerCard(int id, int price, String name, String desc, int speed, int power) {
		this(id, price, name, desc);
		this.speed = speed;
		this.power = power;
	}
	
	public String getCardString() {
		
		if (specialAbility == null) {
			return super.getCardString() + ", " + speed + ", " + power;
			}
		
		else return super.getCardString() + ", " + speed + ", " + power + ", " + specialAbility;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getSpecialAbility() {
		return specialAbility;
	}

	public void setSpecialAbility(String specialAbility) {
		this.specialAbility = specialAbility;
	}
	
	

}
