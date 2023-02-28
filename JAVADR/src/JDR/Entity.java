package JDR;

public class Entity {
	//An entity is any kind of physical object that exists in an instance
	public Instance instance;
	public Coordinate pos;
	
	public Entity(Instance instance, Coordinate pos) {
		this.instance = instance;
		this.pos = pos;
	}
	public String getType() {
		return "Null";
	}
	public void where() {
		System.out.println("(" + this.pos.x + ";" + this.pos.y + ")");
	}
}