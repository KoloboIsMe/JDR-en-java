package Character;
import Items.Artifact;
import Items.Potion;
import Items.Weapon;

public class Enemy extends Character{
	public Enemy(String entityType, int x, int y, 
			String name, int Exp, int Atk, int Def, int HP, int Speed,
			int currentWeapon, Weapon[] weaponInventory, Artifact[] artifactInventory, Potion[] potionInventory) {
		super(entityType, x, y, name, Exp, Atk, Def, HP, Speed);
	}
}
