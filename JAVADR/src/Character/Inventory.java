package Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Items.Artifact;
import Items.Potion;
import Items.Weapon;

public class Inventory {
	public List<Weapon> weapons; 
	public List<Artifact> artifacts; 
	public List<Potion> potions;
	
	public Inventory() {
		this.weapons = new ArrayList<>(Arrays.asList()) ;
		this.artifacts = new ArrayList<>(Arrays.asList());
		this.potions = new ArrayList<>(Arrays.asList());
	}
}
