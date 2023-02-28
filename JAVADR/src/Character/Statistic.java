package Character;

public class Statistic {
	//These are the basic statistics for any character.
	//The Hero get the exp that has the enemy when defeating it.
	public int exp;
	public int atk;
	public int def;
	public int hp;
	public int speed;
	
	public Statistic (int exp, int atk, int def, int hp, int speed) {
		this.exp = exp;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.speed = speed;
	}
}
