package Dungeon;

import JDR.Coordinate;
import JDR.Entity;
import JDR.Instance;

public class Obstacle extends Entity{
	//Just in case you want to add obstacles inside of the room (the extremities are considered Obstacles)
	public Obstacle(Instance instance, Coordinate pos) {
		super(instance, pos);
	}
	@Override
	public String getType() {
		return "Obstacle";
	}
}
