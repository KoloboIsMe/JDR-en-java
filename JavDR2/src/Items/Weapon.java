package Items;

import JDR.Coordinate;
import JDR.Instance;

public class Weapon extends Item{
	public int damage;
	
	public Weapon(Instance instance, Coordinate pos, String name, int damage) {
		super(instance, pos, name);
		this.damage = damage;
	}
	@Override
	public String getType() {
		String ret = "Weapon";
		return ret;
	}
}
