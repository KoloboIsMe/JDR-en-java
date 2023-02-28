package JDR;

public class Entity {
	//An entity is any kind of physical object that exists in an instance with a position
	public Instance instance;
	public Coordinate pos;
	
	public Entity(Instance instance, Coordinate pos) {
		this.instance = instance;
		this.pos = pos;
	}
	public String getType() {
		//This has no specific type
		return "Null";
	}
	public void where() {
		//used mainly for debug
		System.out.println("(" + this.pos.x + ";" + this.pos.y + ")");
	}
}