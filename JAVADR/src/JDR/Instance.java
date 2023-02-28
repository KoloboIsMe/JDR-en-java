package JDR;

import java.util.List;

import Character.Boss;
import Character.Hero;

public class Instance {
	//An instance is a place wich contains entities.
	public List<Entity> entities;
	
	public Instance (List<Entity> entities) {
		this.entities = entities;
	}
	
	public void whatToDo() {
		//yet useless here
	}
	
	public Hero getHero() {
		//Return the Hero from the entities
		for (int i = 0 ; i < this.entities.size() ; ++i) {
			if (this.entities.get(i).getType() == "Hero") {
				return (Hero) this.entities.get(i);
			}
		}
		return null;
	}
	
	public Boss getBoss() {
		//Return the Boss from the entities
		for (int i = 0 ; i < this.entities.size() ; ++i) {
			if (this.entities.get(i).getType() == "Boss") {
				return (Boss) this.entities.get(i);
			}
		}
		return null;
	}
	public Entity whatIsIn(Coordinate coord) {
		//yet useless here
		return null;
	}
}
