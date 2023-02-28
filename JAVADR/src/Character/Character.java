package Character;

import Items.Artifact;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;
import Dungeon.Chest;
import Dungeon.Room;


public class Character extends Entity{
	public String name;
	public Statistic stats;
	public int currentWeapon;
	public Inventory inventory;
	
	public Character (Instance instance, Coordinate pos, 
			String name, Statistic stats) {
		super(instance, pos);
		this.name = name;
		this.stats = stats;
		this.currentWeapon = 0;
		this.inventory = new Inventory();
		
	}
	@Override
	public String getType() {
		return "Character";
	}
	
	//Functions
	public void moveUp() {
		if(this.instance.whatIsIn(new Coordinate(this.pos.x, this.pos.y-1)).getType() == "Obstacle") {
			System.out.println(this.name + " : can't move up.");
		}
		else {
			this.pos.y = this.pos.y-1;
			System.out.println(this.name + " : Moved up !");
		}
	}
	public void moveDown() {
		if(this.instance.whatIsIn(new Coordinate(this.pos.x, this.pos.y+1)).getType() == "Obstacle") {
			System.out.println(this.name + " : can't move down.");
		}
		else {
			this.pos.y = this.pos.y+1;
			System.out.println(this.name + " : Moved down !");
		}
	}
	public void moveLeft() {
		if(this.instance.whatIsIn(new Coordinate(this.pos.x-1, this.pos.y)).getType() == "Obstacle") {
			System.out.println(this.name + " : can't move left.");
		}
		else {
			this.pos.x = this.pos.x-1;
			System.out.println(this.name + " : Moved left !");
		}
	}
	public void moveRight() {
		if(this.instance.whatIsIn(new Coordinate(this.pos.x+1, this.pos.y)).getType() == "Obstacle") {
			System.out.println(this.name + " : can't move right.");
		}
		else {
			this.pos.x = this.pos.x+1;
			System.out.println(this.name + " : Moved right !");
		}
	}
	public void attack (Character target) {
		System.out.println("I can't attack, I'm just a random character !");
	}
	public void beAttack (int damageTaken) {
		if (damageTaken - this.stats.def >= 0) {
			this.stats.hp = this.stats.hp - (damageTaken - this.stats.def);
			System.out.println(this.name + " take " + (damageTaken - this.stats.def) + " damages.");
		}
		System.out.println(this.name + "'s armor absorbs the damages.");
	}
	public void openChest(Chest chest) {
		chest.opened();
		System.out.println(this.name + " : Oppened a chest.");
	}
	public void pickItem(Entity entity) {
		String type = entity.getType();
		if (type == "Weapon") {
			if (this.inventory.weapons.size() < 2) {
				this.inventory.weapons.add((Weapon) entity);
				System.out.println(this.name + " picked " + ((Item) entity).getName() + " from the ground.");
			}
			else {
				System.out.println(this.name + " : My pockets are full !");
			}
		}
		else if (type == "Artifact") {
			if (this.inventory.artifacts.size() < 2) {
				this.inventory.artifacts.add((Artifact) entity);
				System.out.println(this.name + " picked " + ((Item) entity).getName() + " from the ground.");
			}
			else {
				System.out.println(this.name + " : My pockets are full !");
			}
		}
		else if (type == "Potion") {
			if (this.inventory.potions.size() < 2) {
				this.inventory.potions.add((Potion) entity);
				System.out.println(this.name + " picked " + ((Item) entity).getName() + " from the ground.");
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
	public void watch() {
		Room room = (Room) this.instance;
		System.out.println( this.name + " can see :");
		System.out.println( "    Up : " + room.whatIsIn(new Coordinate(this.pos.x, this.pos.y-1)).getType());
		System.out.println( "    Right : " + room.whatIsIn(new Coordinate(this.pos.x+1, this.pos.y)).getType());
		System.out.println( "    Left : " + room.whatIsIn(new Coordinate(this.pos.x-1, this.pos.y)).getType());
		System.out.println( "    Down : " + room.whatIsIn(new Coordinate(this.pos.x, this.pos.y+1)).getType());
		System.out.println( "    Below : " + room.notIn("Hero", new Coordinate(this.pos.x, this.pos.y)).getType());
	}
}
