package Dungeon;

import java.util.ArrayList;
import java.util.List;

public class Instance {
	//The map contains the list of all the locations and entities.
	
	public List<Entity> entities;
	public int xSize;
	public int ySize;
	
	public Instance (List<Entity> entities, int xSize, int ySize) {
		this.entities = entities;
		this.xSize = xSize;
		this.ySize = ySize;
	}
	//Constructor Functions
	public void setEntities (List<Entity> entities) {
		this.entities = entities;
	}
	public List<Entity> entities() {
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
	public Entity whatIsIn(int x, int y) {
		//Returns the entity at the given coordinates
		for(int i = 0; i < this.entities.size(); i++) {
			if ((this.entities.get(i).getX() == x) && (this.entities.get(i).getY() == y)) {
				return this.entities.get(i);
			}
		}
		return new Entity("None", x, y);
	}
}
