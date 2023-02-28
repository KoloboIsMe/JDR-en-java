package Character;

import Items.Weapon;
import JDR.Coordinate;
import JDR.Instance;

public class Boss extends Enemy{
	public Boss (Instance instance, Coordinate pos, String name, Statistic stats) {
		super(instance, pos, name, stats);
	}
	public Boss(Instance instance, Coordinate pos, String name, Statistic stats, Weapon weapon) {
		super(instance, pos, name, stats, weapon);
	}
	
	@Override
	public String getType( ) {
		return "Boss";
	}
}
