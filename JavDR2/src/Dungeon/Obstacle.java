package Dungeon;

public class Obstacle extends Entity{
	public Obstacle(String entityType, int x, int y) {
		super(entityType, x, y);
	}
	@Override
	public String getType() {
		String ret = "Obstacle";
		return ret;
	}
}
