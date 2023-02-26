package Dungeon;
import Items.Item;

public class Chest extends Entity{
	public Entity contains;
	
	public Chest(String entityType, int x, int y, Entity contains) {
		super(entityType, x, y);
		this.contains = contains;
	}
	public void setContainedItem (Entity containedItem) {
		this.contains = containedItem;
	}
	public Entity getContainedItem () {
		return this.contains;
	}
	@Override
	public String getType() {
		String ret = "Chest";
		return ret;
	}
	public void opened() {
		//The contained item appears on the floor
		this.contains.setX(this.getX());
		this.contains.setY(this.getY());
		//And the chest disappear
		setX(0);
		setY(0);
		System.out.println("The chest is open. It contains a" + this.getContainedItem().getEntityType() + " !");
	}
}
