package Dungeon;

import java.util.List;

import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;

public class Room extends Instance{
	public Coordinate size;
	
	public Room (List<Entity> entities, Coordinate size) {
		super(entities);
		this.size = size;
	}
	@Override
	public Entity whatIsIn(Coordinate coord) {
		//Returns the entity at the given coordinates
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)) {
				return this.entities.get(i);
			}
		}
		return null;
	}
	@Override
	public void whatToDo() {
		System.out.println("I to open inventory.");
		System.out.println("M to watch around you.");
		System.out.println("W to switch weapon.");
		System.out.println("Z,Q,S,D to move in any direction.");
		System.out.println("A to use a potion, E to use an artifact, F to use a weapon.");
	}
	
	public boolean isThere(String type, Coordinate coord) {
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)
					&& (this.entities.get(i).getType() == type)) {
				return true;
			}
		}
		return false;
	}
	
	public Entity notIn(String type, Coordinate coord) {
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)
					&& (this.entities.get(i).getType() != "Hero")) {
				return this.entities.get(i);
			}
		}
		return null;
	}
}
