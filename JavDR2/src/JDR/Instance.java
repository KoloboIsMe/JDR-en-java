package JDR;

import java.util.List;

import Character.Boss;
import Character.Hero;

public class Instance {
	public List<Entity> entities;
	
	public Instance (List<Entity> entities) {
		this.entities = entities;
	}
	
	public void whatToDo() {
		System.out.println("There is nothing much to do here.");
	}
	
	public Hero getHero() {
		for (int i = 0 ; i < this.entities.size() ; ++i) {
			if (this.entities.get(i).getType() == "Hero") {
				return (Hero) this.entities.get(i);
			}
		}
		return null;
	}
	
	public Boss getBoss() {
		for (int i = 0 ; i < this.entities.size() ; ++i) {
			if (this.entities.get(i).getType() == "Boss") {
				return (Boss) this.entities.get(i);
			}
		}
		return null;
	}
	public Entity whatIsIn(Coordinate coord) {
		return null;
	}
}
