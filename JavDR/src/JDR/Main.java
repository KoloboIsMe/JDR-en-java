package JDR;

import Character.Character;
import Character.Hero;
import Character.Enemy;

import Dungeon.Chest;
import Dungeon.Entity;
import Dungeon.Map;

import Items.Item;
import Items.Weapon;
import Items.Artifact;
import Items.Weapon;

import JDR.Combat;
import JDR.Round;
import JDR.Input;
import JDR.Output;

public class Main {
	public Main() {
		Entity[] entities = {
				new Chest("Chest", 1,1, new Weapon("Weapon", 0,0,"Sword of the tides", 10))
		};
		Map dungeon = new Map(entities,10,10);
	}
	
}