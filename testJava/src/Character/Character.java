package Character;
import Items.Artifact;
import Items.Item;
import Items.Potion;
import Items.Weapon;
import Dungeon.Entity;

public class Character extends Entity{
	public static String name;
	public static int Exp;
	public static int Atk;
	public static int Def;
	public static int HP;
	public static int Speed;
	public static int currentWeapon;
	public static Weapon[] weaponInventory; 
	public static Artifact[] artifactInventory; 
	public static Potion[] potionInventory;
	
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
		this.weaponInventory = [2];
		this.artifactInventory = [3];
		this.potionInventory = [4];
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
	public void setX (int x) {
		this.x = x;
	}
	public int getX () {
		return this.x;
	}
	public void setY (int y) {
		this.y = y;
	}
	public int getY () {
		return this.y;
	}
	
	//Functions
	public String moveUp() {
		this.y = this.y-1;
		return this.name + " : Moved up !";
	}
	public String moveDown() {
		this.y = this.y+1;
		return this.name + " : Moved down !";
	}
	public String moveLeft() {
		this.x = this.x+1;
		return this.name + " : Moved left !";
	}
	public String moveRight() {
		this.x = this.x-1;
		return this.name + " : Moved right !";
	}
	public String beAttack (int damageTaken) {
		if (damageTaken - this.Def >= 0) {
			this.HP = this.HP - (damageTaken - this.Def);
		}
		return this.name + " : Ouch... !";
	}
	public String attack() {
		return this.name + " : I can't attack...";
	}
	public String openChest() {
		return this.name + " : Oppened a chest.";
	}
	public String pickItem(Item item) {
		return this.name + "Picked " + item.getName() + " from the ground.";
	}
	public String throwItem(Item item) {
		return this.name + "Throwed " + item.getName() + " on the ground.";
	}
	public String useItem(Item item) {
		return this.name + "Used " + item.getName() + " !";
	}
}
