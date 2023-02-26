package Dungeon;

import Character.Character;
import Items.Item;

public class Entity {
	public String entityType;
	public int x;
	public int y;
	
	public Entity(String entityType, int x, int y) {
		this.entityType = entityType;
		this.x = x;
		this.y = y;
	}

	public void setEntityType (String entityType) {
		this.entityType = entityType;
	}
	public String getEntityType () {
		return this.entityType;
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
	public String getType() {
		return "Entity";
	}
	
	public void where() {
		System.out.println("(" + this.x + ";" + this.y + ")");
	}
}