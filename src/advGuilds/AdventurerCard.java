package advGuilds;

public class AdventurerCard extends Card {
	
	private int speed, power;
	private String specialAbility;

	AdventurerCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ADVENTURER);
	}
	
	AdventurerCard(int id, int price, String name, String desc, int speed, int power, String spAb) {
		this(id, price, name, desc, speed, power);
		this.specialAbility = spAb;
	}
	
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
