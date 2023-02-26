package JDR;

import java.util.*;

import Character.Hero;
import Character.Enemy;

import Dungeon.Chest;
import Dungeon.Entity;
import Dungeon.Instance;
import Dungeon.Obstacle;
import Items.Weapon;
import Items.Artifact;
import Items.Potion;

import JDR.Combat;

// Entities are at x=0 and y=0 when they don't appear in the instance

public class Main {
	public static void main(String[] args){
		// Creation of the hero
		Hero hero = new Hero("Hero", 1,2, "Léo", 0, 1, 2, 20, 5);
		
		List<Entity> dungeonEntities = new ArrayList<>(Arrays.asList());
			//Creation of the characters
				//the enemies
			dungeonEntities.add(new Enemy("Enemy", 4,3, "Goblin", 0, 1, 2, 20, 5));
			//Creation of the items
				//the weapons
			dungeonEntities.add(new Weapon("Weapon", 2,2,"Rusty Sword", 2));
			dungeonEntities.add(new Weapon("Weapon", 0,0,"Heavy Claymore", 10));
				//the artifacts	
			dungeonEntities.add(new Artifact("Artifact", 2,2, "Dark Talisman"));
				//the potions
			dungeonEntities.add(new Potion("Potion", 2,2, "Scarlet Potion"));
			//Creation of the other entities
				//the chests
			dungeonEntities.add(new Chest("Chest", 1,1, dungeonEntities.get(1)));
				//the obstacles
			dungeonEntities.add(new Obstacle("Obstacle", 3,2));
		
		Instance dungeon = new Instance(dungeonEntities, 5, 5);
		
		dungeon.entities.add(hero);
		
		
	}
}