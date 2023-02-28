package Dungeon;
import Items.Item;
import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;

public class Chest extends Entity{
	public Entity contains;
	
	public Chest(Instance instance, Coordinate pos, Entity contains) {
		super(instance, pos);
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
		return "Chest";
	}
	public void opened() {
		//The contained item appears on the floor
		this.contains.pos = this.pos;
		//And the chest disappear
		this.pos = new Coordinate(0,0);
		System.out.println("The chest is open. It contains a" + this.getContainedItem().getType() + " !");
	}
}
