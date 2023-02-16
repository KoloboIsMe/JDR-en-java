package Character;

public class Hero extends Character{
	
	public Hero(String entityType, int x, int y, 
			String name, int Exp, int Atk, int Def, int HP, int Speed) {
		super(entityType, x, y, name, Exp, Atk, Def, HP, Speed);
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
	public String attack(Character target) {
		int dmg = this.Atk + this.weaponInventory.get(currentWeapon).damage;
		target.beAttack(dmg);
		return this.name + " : Deals " + dmg; 
	}
}
