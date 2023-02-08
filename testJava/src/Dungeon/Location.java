package Dungeon;

public class Location {
	public static int x;
	public static int y;
	public static boolean isFree;
	
	public Location (int x, int y, boolean isFree) {
		this.x = x;
		this.y = y;
		this.isFree = isFree;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	public int getX () {
		return this.x;
	}
	public void setY (int y) {
		this.y = y;
	}
	public int getY () {
		return this.y;
	}
	public void setIsFree (boolean isFree) {
		this.isFree = isFree;
	}
	public boolean getIsFree () {
		return this.isFree;
	}
}
