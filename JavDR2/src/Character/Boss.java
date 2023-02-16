package Character;

public class Boss extends Character{
	public int extendsX;
	public int extendsY;
	
	public Boss(String entityType, int x, int y, 
			String name, int Exp, int Atk, int Def, int HP, int Speed, int extendsX, int extendsY) {
		super(entityType, x, y, name, Exp, Atk, Def, HP, Speed);
	}
	@Override
	public String getType() {
		String ret = "Boss";
		return ret;
	}
}
