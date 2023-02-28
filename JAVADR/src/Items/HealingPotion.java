package Items;

import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;
import Character.Character;

//Il s'agit seulement d'un exemple de comment j'avais prévu d'ajouter des utilités aux potions, armes et artéfacts
//J'aurais ajouté des sous classe qui comportent de nouvelles caractéristiques
//Ainsi qu'un @Override d'une fonction 'public void use()' qui aurait donc leur effet changeant selon leur classe

public class HealingPotion extends Potion{
	public int heal;
	
	public HealingPotion(Instance instance, Coordinate pos, String name, int heal) {
		super(instance, pos, name);
		this.heal = heal;
	}

	@Override
	public void use(Entity target) { //A healing potion simply heals the target
		((Character)target).stats.hp = ((Character)target).stats.hp + heal;
	}
}
