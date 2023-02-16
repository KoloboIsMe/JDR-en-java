package Dungeon;

import java.util.ArrayList;

public class Map {
	//The map contains the list of all the locations and entities.
	
	public ArrayList<Entity> entities;
	public int xSize;
	public int ySize;
	
	public Map (ArrayList<Entity> entities, int xSize, int ySize) {
		this.entities = entities;
		this.xSize = xSize;
		this.ySize = ySize;
	}
	//Constructor Functions
	public void setEntities (ArrayList<Entity> entities) {
		this.entities = entities;
	}
	public ArrayList<Entity> entities() {
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
