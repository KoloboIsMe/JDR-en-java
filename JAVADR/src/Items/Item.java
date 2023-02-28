package Items;
import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;

public class Item extends Entity {
	public String name;
	
	public Item(Instance instance, Coordinate pos, String name) {
		super(instance, pos);
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
	public void use(Entity target) { //An item could be use on any type of entity. 
								//Why not on a chest ? An enemy ? An obstacle ? Another item ?
		//No use here
	}
}
