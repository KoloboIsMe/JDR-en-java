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
	public void use() {
		System.out.println("Can't use that.");
	}
}
