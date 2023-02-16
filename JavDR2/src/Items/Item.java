package Items;
import Dungeon.Entity;

public class Item extends Entity {
	public String name;
	
	public Item(String entityType, int x, int y, String name) {
		super(entityType, x, y);
		this.name = name;
	}
	
	public String getName (){
		return this.name;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	@Override
	public String getType() {
		String ret = "Item";
		return ret;
	}
}
