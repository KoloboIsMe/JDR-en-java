package Character;

import java.util.ArrayList; 

import Items.Artifact;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import Dungeon.Entity;

public class Character extends Entity{
	public String name;
	public int Exp;
	public int Atk;
	public int Def;
	public int HP;
	public int Speed;
	public int currentWeapon;
	public ArrayList<Weapon> weaponInventory; 
	public ArrayList<Artifact> artifactInventory; 
	public ArrayList<Potion> potionInventory;
	
	public Character (String entityType, int x, int y, 
			String name, int Exp, int Atk, int Def, int HP, int Speed) {
		super(entityType, x, y);
		this.name = name;
		this.Exp = Exp;
		this.Atk = Atk;
		this.Def = Def;
		this.HP = HP;
		this.Speed = Speed;
		this.currentWeapon = 0;
		this.weaponInventory = null;
		this.artifactInventory = null;
		this.potionInventory = null;
		
	}
	//Constructor Functions
	public void setName (String name) {
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public void setExp (int Exp) {
		this.Exp = Exp;
	}
	public int getExp () {
		return this.Exp;
	}
	public void setAtk (int Atk) {
		this.Atk = Atk;
	}
	public int getAtk () {
		return this.Atk;
	}
	public void setDef (int Def) {
		this.Def = Def;
	}
	public int getDef () {
		return this.Def;
	}
	public void setHP (int HP) {
		this.HP = HP;
	}
	public int getHP () {
		return this.HP;
	}
	public void setSpeed (int Speed) {
		this.Speed = Speed;
	}
	public int getSpeed () {
		return this.Speed;
	}
	@Override
	public String getType() {
		String ret = "Character";
		return ret;
	}
	
	//Functions
	@Override
	public String moveUp() {
		this.y = this.y-1;
		return this.name + " : Moved up !";
	}
	@Override
	public String moveDown() {
		this.y = this.y+1;
		return this.name + " : Moved down !";
	}
	@Override
	public String moveLeft() {
		this.x = this.x+1;
		return this.name + " : Moved left !";
	}
	@Override
	public String moveRight() {
		this.x = this.x-1;
		return this.name + " : Moved right !";
	}
	@Override
	public String beAttack (int damageTaken) {
		if (damageTaken - this.Def >= 0) {
			this.HP = this.HP - (damageTaken - this.Def);
			return this.name + " reçoit " + (damageTaken - this.Def) + " dégats.";
		}
		return this.name + " encaisse les dégats.";
	}
	@Override
	public String attack(Character target) {
		return this.name + " : I can't attack...";
	}
	@Override
	public String openChest() {
		return this.name + " : Oppened a chest.";
	}
	@Override
	public String pickItem(Item item) {
		String type = item.getType();
		if (type == "Weapon") {
			if (weaponInventory.size() < 2) {
				weaponInventory.add((Weapon) item);
				return this.name + "Picked " + item.getName() + " from the ground.";
			}
			return this.name + " : My pockets are full !";
		}
		else if (type == "Artifact") {
			if (artifactInventory.size() < 2) {
				artifactInventory.add((Artifact) item);
				return this.name + "Picked " + item.getName() + " from the ground.";
			}
			return this.name + " : My pockets are full !";
		}
		else if (type == "Potion") {
			if (potionInventory.size() < 2) {
				potionInventory.add((Potion) item);
				return this.name + "Picked " + item.getName() + " from the ground.";
			}
			return this.name + " : My pockets are full !";
		}
		return "I can't pick that up !";
	}
	@Override
	public String throwItem(Item item) {
		return this.name + "Throwed " + item.getName() + " on the ground.";
	}
	@Override
	public String useItem(Item item) {
		return this.name + "Used " + item.getName() + " !";
	}
}
