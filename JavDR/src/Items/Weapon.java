package Items;
import Dungeon.Entity;

public class Weapon extends Item{
	public int damage;
	
	public Weapon(String entityType, int x, int y, String name, int damage) {
		super(entityType, x, y, name);
		this.damage = damage;
	}
}
