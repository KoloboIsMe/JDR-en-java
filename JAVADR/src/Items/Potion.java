package Items;

import JDR.Coordinate;
import JDR.Instance;

public class Potion extends Item{
	public Potion(Instance instance, Coordinate pos, String name) {
		super(instance, pos, name);
	}
	@Override
	public String getType() {
		return "Potion";
	}
}
