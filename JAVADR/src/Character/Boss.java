package Character;

import Items.Weapon;
import JDR.Coordinate;
import JDR.Instance;

public class Boss extends Enemy{
	//A boss is a unique enemy, the Hero has to beat it in order to win
	public Boss (Instance instance, Coordinate pos, String name, Statistic stats) {
		//constructor with no given weapon
		super(instance, pos, name, stats);
	}
	public Boss(Instance instance, Coordinate pos, String name, Statistic stats, Weapon weapon) {
		//constructor with a starting weapon
		super(instance, pos, name, stats, weapon);
	}
	
	@Override
	public String getType( ) {
		return "Boss";
	}
}
