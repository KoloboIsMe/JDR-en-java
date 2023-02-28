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
		//Returns the entity present at the given coordinates
		if (coord.x == 0 || coord.y == 0 || coord.x == size.x || coord.y == size.y) { //if the coordinate points at an edge
			return new Obstacle(this.entities.get(0).instance, coord); 
		}
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)) {
				return this.entities.get(i);
			}
		}
		return new Entity(this, coord);
	}
	@Override
	public void whatToDo() {
		//prints what it is possible to do in the current situation
		//A FAIRE rajouter conditions, combiner avec hero.attack
		System.out.println("I to open inventory.");
		System.out.println("L to look around you.");
		System.out.println("W to switch weapon.");
		System.out.println("Z,Q,S,D to move in any direction.");
		System.out.println("O to open chest.");
		System.out.println("P to pick an object from the ground.");
	}
	
	public boolean isThere(String type, Coordinate coord) {
		//true if this type is present at the given coordinate
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)
					&& (this.entities.get(i).getType() == type)) {
				return true;
			}
		}
		return false;
	}
	
	public Entity notIn(String type, Coordinate coord) {
		//return an entity at the given coordinate wich is not of the given type
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).pos.x == coord.x) && (this.entities.get(i).pos.y == coord.y)
					&& (this.entities.get(i).getType() != "Hero")) {
				return this.entities.get(i);
			}
		}
		return new Entity(this, coord);
	}
}
