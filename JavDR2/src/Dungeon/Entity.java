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
	
	public String where() {
		return "(" + this.x + ";" + this.y + ")";
	}
	public String moveUp() {
		return this.entityType + " can't move.";
	}
	public String moveDown() {
		return this.entityType + " can't move.";
	}
	public String moveLeft() {
		return this.entityType + " can't move.";
	}
	public String moveRight() {
		return this.entityType + " can't move.";
	}
	public String beAttack (int damageTaken) {
		return this.entityType + " can't be damaged.";
	}
	public String attack(Character target) {
		return this.entityType + " can't attack anything.";
	}
	public String openChest() {
		return this.entityType + " can't open anything.";
	}
	public String pickItem(Item item) {
		return this.entityType + " can't pick up anything.";
	}
	public String throwItem(Item item) {
		return this.entityType + " can't  throw anything.";
	}
	public String useItem(Item item) {
		return this.entityType + " can't  use anything.";
	}
}
