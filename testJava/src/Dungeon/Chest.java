package Dungeon;
import Items.Item;

public class Chest extends Entity{
	public static Item containedItem;
	public static boolean isOpen;
	
	public Chest(String entityType, int x, int y, Item containedItem) {
		super(entityType, x, y);
		this.containedItem = containedItem;
		this.isOpen = false;
	}
}
