package JDR;

public class Entity {
	public Instance instance;
	public Coordinate pos;
	
	public Entity(Instance instance, Coordinate pos) {
		this.instance = instance;
		this.pos = pos;
	}
	public String getType() {
		return "Entity";
	}
	public void where() {
		System.out.println("(" + this.pos.x + ";" + this.pos.y + ")");
	}
}