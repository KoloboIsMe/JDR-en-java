package Dungeon;

import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;

public class Obstacle extends Entity{
	public Obstacle(Instance instance, Coordinate pos) {
		super(instance, pos);
	}
	@Override
	public String getType() {
		return "Obstacle";
	}
}
