package advGuilds;

/**
 * Quest card type.
 * @author CergyTP
 *
 */
public class QuestCard extends Card{
	
	private String prerequisities;
	private String reward;
	private int difficulty;

	QuestCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
	}
	
	/**
	 * Constructor
	 * @param id ID, should be handled globally.
	 * @param price Actually reward money for completing quest
	 * @param name Quest Name
	 * @param desc Quest Description
	 * @param prer Quest prerequisities, like certain item or another quest is completed
	 * @param reward Special reward besides gold
	 * @param diff Difficulty of quest.
	 */
	QuestCard(int id, int price, String name, String desc, String prer, String reward, int diff) {
		super(id, price, name, desc);
		this.prerequisities = prer;
		this.reward = reward;
		this.difficulty = diff;
	}
	
	public String getCardString() {
		return super.getCardString() + ", " + prerequisities + ", " + reward + ", " + difficulty;
	}

	public String getPrerequisities() {
		return prerequisities;
	}

	public void setPrerequisities(String prerequisities) {
		this.prerequisities = prerequisities;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	

}
