package Character;

import Items.Weapon;
import JDR.Coordinate;
import JDR.Instance;

public class Enemy extends Character{
	public Enemy(Instance instance, Coordinate pos, String name, Statistic stats) {
		super(instance, pos, name, stats);
	}
	public Enemy(Instance instance, Coordinate pos, String name, Statistic stats, Weapon weapon) {
		super(instance, pos, name, stats);
		this.inventory.weapons.add(weapon);
	}
	@Override
	public String getType() {
		return "Enemy";
	}
	@Override
	public void attack(Character target) {
		int dmg = this.stats.atk + this.inventory.weapons.get(currentWeapon).damage;
		target.beAttack(dmg);
		System.out.println(this.name + " : Deals " + dmg); 
	}
}
