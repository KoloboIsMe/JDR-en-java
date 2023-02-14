package Dungeon;

public class Map {
	//The map contains the list of all the locations and entities.
	
	public static Entity[] entities;
	public static int xSize;
	public static int ySize;
	
	public Map (Entity[] entities, int xSize, int ySize) {
		this.entities = entities;
		this.xSize = xSize;
		this.ySize = ySize;
	}
	//Constructor Functions
	public void setEntities (Entity[] entities) {
		this.entities = entities;
	}
	public Entity[] entities() {
		return this.entities;
	}
	public void setXSize (int xSize) {
		this.xSize = xSize;
	}
	public int getXSize () {
		return this.xSize;
	}
	public void setYSize (int ySize) {
		this.ySize = ySize;
	}
	public int getYSize () {
		return this.ySize;
	}
}
