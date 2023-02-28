package Character;

import java.util.Scanner;

import Dungeon.Room;
import Items.Weapon;
import JDR.Coordinate;
import JDR.Instance;

public class Hero extends Character{
	
	public Hero(Instance instance, Coordinate pos, String name, Statistic stats) {
		super(instance, pos, name, stats);
	}
	public Hero(Instance instance, Coordinate pos, String name, Statistic stats, Weapon weapon) {
		super(instance, pos, name, stats);
		this.inventory.weapons.add(weapon);
	}
	@Override
	public String getType() {
		return "Hero";
	}
	@Override
	public void attack(Character target) {
		Scanner scanner = new Scanner(System.in);
		this.whatAttack();
		this.doAttack(target, scanner.nextLine());
	}
	public void whatAttack() {
		System.out.println("Z to attack");
		System.out.println("W to switch weapon");
		System.out.println("F to use a weapon");
		
	}
	public void doAttack(Character target, String action) {
		switch(action) {
		case "Z" :
			this.normalAttack(target);
			break;
		case "W" :
			this.switchWeapon();
			break;
		default :
			System.out.println("I don't understand... Let's just attack.");
			this.normalAttack(target);
		}
	}
	public void normalAttack(Character target) {
		int dmg = this.stats.atk + this.inventory.weapons.get(this.currentWeapon).damage;
		target.beAttack(dmg);
		System.out.println(this.name + " : Deals " + dmg); 
	}
	public void switchWeapon() {
		if (this.inventory.weapons.size() == 0) {
			System.out.println("I don't have any weapon.");
		}
		else if (this.inventory.weapons.size() == 1) {
			System.out.println("I don't another weapon.");
		}
		else {
			if(this.currentWeapon == 0) {
				this.currentWeapon = 1;
			}
			else {
				this.currentWeapon = 0;
			}
			System.out.println(this.inventory.weapons.get(this.currentWeapon).name + " equiped.");
		}
	}
	public void doAction(String action) {
		switch (action) {
		case "I" :
			this.checkInventory();
			break;
		case "L" : 
			this.watch();
			break;
		case "W" :
			this.switchWeapon();
			break;
		case "Z" : 
			this.moveUp();
			break;
		case "Q" :
			this.moveLeft();
			break;
		case "S" : 
			this.moveDown();
			break;
		case "D" :
			this.moveRight();
			break;
		case "P" : 
			this.pickItem(((Room) this.instance).notIn("Hero", this.pos));
			break;
		default :
			System.out.println("I don't understand.");
			this.instance.whatToDo();
		}
		
	}
}
