package Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Items.Artifact;
import Items.Potion;
import Items.Weapon;

public class Inventory {
	//This are the basic inventory for any character.
	//A monster loots the entirety of its inventory on the ground when he dies.
	public List<Weapon> weapons; 
	public List<Artifact> artifacts; 
	public List<Potion> potions;
	
	public Inventory() {
		this.weapons = new ArrayList<>(Arrays.asList()) ;
		this.artifacts = new ArrayList<>(Arrays.asList());
		this.potions = new ArrayList<>(Arrays.asList());
	}
}
