package Character;

import JDR.Coordinate;
import JDR.Instance;

public class Hero extends Character{
	
	public Hero(Instance instance, Coordinate pos, String name, Statistic stats) {
		super(instance, pos, name, stats);
	}
	//Constructor functions
	public void setCurrentWeapon (int currentWeapon) {
		this.currentWeapon = currentWeapon;
	}
	public int getCurrentWeapon () {
		return this.currentWeapon;
	}
	@Override
	public String getType() {
		return "Hero";
	}
	@Override
	public void attack(Character target) {
		int dmg = this.stats.atk + this.inventory.weapons.get(currentWeapon).damage;
		target.beAttack(dmg);
		System.out.println(this.name + " : Deals " + dmg); 
	}
	public void doAction(String action) {
		switch (action) {
		case "I" :
			this.checkInventory();
			break;
		case "M" : 
			this.watch();
			break;
		case "W" :
			if(this.currentWeapon == 0) {
				this.currentWeapon = 1;
			}
			else {
				this.currentWeapon = 0;
			}
			System.out.println(this.inventory.weapons.get(currentWeapon).name + " equiped.");
			break;
		case "Z" : 
			this.moveUp();
			break;
		case "Q" :
			this.moveRight();
			break;
		case "S" : 
			this.moveLeft();
			break;
		case "D" :
			this.moveRight();
			break;
		case "A" : 
			
			break;
		case "E" :
			
			break;
		case "F" : 
			
			break;
		}
		
	}
}
