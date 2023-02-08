package Dungeon;

public class Map {
	//The map contains the list of all the locations and entities.
	
	public static Location[] grid;
	public static Entity[] entities;
	public static int xSize;
	public static int ySize;
	
	public Map (Location[] grid, Entity[] entities) {
		this.grid = grid;
		this.entities = entities;
	}
	//Constructor Functions
	public void setGrid (Location[] grid) {
		this.grid = grid;
	}
	public Location[] getGrid() {
		return this.grid;
	}
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
