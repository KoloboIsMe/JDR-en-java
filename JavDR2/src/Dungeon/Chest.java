package Dungeon;
import Items.Item;

public class Chest extends Entity{
	public Item containedItem;
	public boolean isOpen;
	
	public Chest(String entityType, int x, int y, Item containedItem) {
		super(entityType, x, y);
		this.containedItem = containedItem;
		this.isOpen = false;
	}
	public void setContainedItem (Item containedItem) {
		this.containedItem = containedItem;
	}
	public Item getContainedItem () {
		return this.containedItem;
	}
	public void setIsOpen (boolean isOpen) {
		this.isOpen = isOpen;
	}
	public boolean getIsOpen () {
		return this.isOpen;
	}
	@Override
	public String getType() {
		String ret = "Chest";
		return ret;
	}
}
