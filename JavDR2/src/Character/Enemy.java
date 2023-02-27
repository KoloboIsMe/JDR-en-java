package Character;

import JDR.Coordinate;
import JDR.Instance;

public class Enemy extends Character{
	public Enemy(Instance instance, Coordinate pos, String name, Statistic stats) {
		super(instance, pos, name, stats);
	}
	@Override
	public String getType() {
		String ret = "Enemy";
		return ret;
	}
	@Override
	public void attack(Character target) {
		int dmg = this.stats.atk + this.inventory.weapons.get(currentWeapon).damage;
		target.beAttack(dmg);
		System.out.println(this.name + " : Deals " + dmg); 
	}
}
