package Items;

public class Weapon extends Item{
	public int damage;
	
	public Weapon(String entityType, int x, int y, String name, int damage) {
		super(entityType, x, y, name);
		this.damage = damage;
	}
	@Override
	public String getType() {
		String ret = "Weapon";
		return ret;
	}
}
