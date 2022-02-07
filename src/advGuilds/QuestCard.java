package advGuilds;

public class QuestCard extends Card{
	
	private String prerequisities;
	private String reward;
	private int difficulty;

	QuestCard(int id, int price, String name, String desc) {
		super(id, price, name, desc);
	}
	
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
