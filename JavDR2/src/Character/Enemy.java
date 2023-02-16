package Character;

public class Enemy extends Character{
	public Enemy(String entityType, int x, int y, 
			String name, int Exp, int Atk, int Def, int HP, int Speed) {
		super(entityType, x, y, name, Exp, Atk, Def, HP, Speed);
	}
	@Override
	public String getType() {
		String ret = "Enemy";
		return ret;
	}
}
