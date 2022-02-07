package advGuilds;

public class ActionCard extends Card {
	
	private int bonus;
	private ActionType typ;
	

	ActionCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
		this.setcType(cardType.ACTION);
	}
	
	ActionCard(int id, int price, String name, String desc, ActionType typ, int bonus) {
		this(id, price, name, desc);
		this.typ = typ;
		this.bonus = bonus;
	}
	
	public String getCardString() {
		return super.getCardString() + ", " + typ + ", " + bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public ActionType getTyp() {
		return typ;
	}
	
	

}
