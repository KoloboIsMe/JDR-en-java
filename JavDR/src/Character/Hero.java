package Character;
import Items.Weapon;
import Items.Artifact;
import Items.Potion;

public class Hero extends Character{
	
	public Hero(String name, int Exp, int Atk, int Def, int HP, int Speed, int x, int y, 
			int currentWeapon, Weapon[] weaponInventory, 
			Artifact[] artifactInventory, Potion[] potionInventory) {
		super(entityType, x, y, name, Exp, Atk, Def, HP, Speed);
	}
	//Constructor functions
	public void setCurrentWeapon (int currentWeapon) {
		this.currentWeapon = currentWeapon;
	}
	public int getCurrentWeapon () {
		return this.currentWeapon;
	}
	public void setWeaponInventory (Weapon[] weaponInventory) {
		this.weaponInventory = weaponInventory;
	}
	public Weapon[] getWeaponInventory () {
		return this.weaponInventory;
	}
	public void setArtifactInventory (Artifact[] artifactInventory) {
		this.artifactInventory = artifactInventory;
	}
	public Artifact[] getArtifactInventory () {
		return this.artifactInventory;
	}
	public void setPotionInventory (Potion[] potionInventory) {
		this.potionInventory = potionInventory;
	}
	public Potion[] getPotionInventory () {
		return this.potionInventory;
	}
	
	@Override
	public String attack() {
		return this.name + " : Deals " + Atk + weaponInventory[currentWeapon].damage; 
	}
}
