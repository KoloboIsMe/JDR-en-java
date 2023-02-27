package Items;

import JDR.Coordinate;
import JDR.Instance;

public class HealingPotion extends Potion{
	public int heal;
	
	public HealingPotion(Instance instance, Coordinate pos, String name, int heal) {
		super(instance, pos, name);
		this.heal = heal;
	}

}
