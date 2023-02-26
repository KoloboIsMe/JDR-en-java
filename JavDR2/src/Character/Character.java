package Character;

import Items.Artifact;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import Dungeon.Chest;
import Dungeon.Entity;
import Dungeon.Instance;


public class Character extends Entity{
	public String name;
	public int Exp;
	public int Atk;
	public int Def;
	public int HP;
	public int Speed;
	public int currentWeapon;
	public Inventory inventory;
	
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
		this.inventory = new Inventory();
		
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
	public void moveUp() {
		this.y = this.y-1;
		System.out.println(this.name + " : Moved up !");
	}
	public void moveDown() {
		this.y = this.y+1;
		System.out.println(this.name + " : Moved down !");
	}
	public void moveLeft() {
		this.x = this.x+1;
		System.out.println(this.name + " : Moved left !");
	}
	public void moveRight() {
		this.x = this.x-1;
		System.out.println(this.name + " : Moved right !");
	}
	public void attack (Character target) {
		System.out.println("I can't attack, I'm just a random character !");
	}
	public void beAttack (int damageTaken) {
		if (damageTaken - this.Def >= 0) {
			this.HP = this.HP - (damageTaken - this.Def);
			System.out.println(this.name + " reçoit " + (damageTaken - this.Def) + " dégats.");
		}
		System.out.println(this.name + " encaisse les dégats.");
	}
	public void openChest(Chest chest) {
		chest.opened();
		System.out.println(this.name + " : Oppened a chest.");
	}
	public void pickItem(Item item) {
		String type = item.getType();
		if (type == "Weapon") {
			if (this.inventory.weapons.size() < 2) {
				this.inventory.weapons.add((Weapon) item);
				System.out.println(this.name + " picked " + item.getName() + " from the ground.");
			}
			else {
				System.out.println(this.name + " : My pockets are full !");
			}
		}
		else if (type == "Artifact") {
			if (this.inventory.artifacts.size() < 2) {
				this.inventory.artifacts.add((Artifact) item);
				System.out.println(this.name + " picked " + item.getName() + " from the ground.");
			}
			else {
				System.out.println(this.name + " : My pockets are full !");
			}
		}
		else if (type == "Potion") {
			if (this.inventory.potions.size() < 2) {
				this.inventory.potions.add((Potion) item);
				System.out.println(this.name + " picked " + item.getName() + " from the ground.");
			}
			else {
				System.out.println(this.name + " : My pockets are full !");
			}
		}
		else {
			System.out.println("I can't pick that up !");
		}
	}
	public void checkInventory() {
		System.out.println( this.name + "'s inventory :");
		System.out.println("   Weapons[" + this.inventory.weapons.size() + "/2] :");
		for(int i = 0 ; i < this.inventory.weapons.size(); ++i) {
			System.out.println("      " + this.inventory.weapons.get(i).getName()) ; 
		}
		System.out.println("   Artifacts[" + this.inventory.artifacts.size() + "/3] :");
		for(int i = 0 ; i < this.inventory.artifacts.size(); ++i) {
			System.out.println("      " + this.inventory.artifacts.get(i).getName()) ; 
		}
		System.out.println("   Potions[" + this.inventory.potions.size() + "/5] :");
		for(int i = 0 ; i < this.inventory.potions.size(); ++i) {
			System.out.println("      " + this.inventory.potions.get(i).getName()) ; 
		}
	}
	public void watch(Instance instance) {
		System.out.println( this.name + "can see :");
		System.out.println( "    Up : " + instance.whatIsIn(this.x, this.y-1).entityType);
		System.out.println( "    Right : " + instance.whatIsIn(this.x+1, this.y).entityType);
		System.out.println( "    Left : " + instance.whatIsIn(this.x-1, this.y).entityType);
		System.out.println( "    Down : " + instance.whatIsIn(this.x, this.y+1).entityType);
	}
}
