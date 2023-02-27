package JDR;

import java.util.*;

import Character.Hero;
import Character.Statistic;
import Character.Boss;
import Character.Character;
import Character.Enemy;

import Dungeon.Chest;
import Dungeon.Obstacle;
import Dungeon.Room;
import Items.Weapon;
import Items.Artifact;
import Items.HealingPotion;

import JDR.Combat;

// Entities are at x=0 and y=0 when they don't appear in the instance

public class Main {
	public static void main(String[] args){
		List<Entity> dungeonEntities = new ArrayList<>(Arrays.asList());
		Room dungeon = new Room(dungeonEntities, new Coordinate(5,5));
			//Creation of the characters
				//the hero
			dungeonEntities.add(new Hero(dungeon, new Coordinate(1,1), "Léo", new Statistic(0, 100, 100, 100, 100)));
				//the enemies
			dungeonEntities.add(new Enemy(dungeon, new Coordinate(2,2), "Goblin", new Statistic(10, 10, 10, 10, 10)));
				//the boss
			dungeonEntities.add(new Boss(dungeon, new Coordinate(3,3), "King Goblin", new Statistic(10, 10, 10, 10, 10)));
			//Creation of the items
				//the weapons
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(1,2),"Rusty Sword", 2));
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(2,1),"Heavy Claymore", 10));
				//the artifacts	
			dungeonEntities.add(new Artifact(dungeon, new Coordinate(1,2), "Dark Talisman"));
				//the potions
			dungeonEntities.add(new HealingPotion(dungeon, new Coordinate(1,2), "Scarlet Potion", 10));
			//Creation of the other entities
				//the chests
			dungeonEntities.add(new Chest(dungeon, new Coordinate(1,2), dungeonEntities.get(1)));
				//the obstacles
			dungeonEntities.add(new Obstacle(dungeon, new Coordinate(4,3)));
		
		Instance activeInstance = dungeon;
		Scanner scanner = new Scanner(System.in);
		String action;
		System.out.println("Explore, open trasures, fight monsters, get experience and loot and become more powerfull to vanquish the boss !");
		while (activeInstance.getBoss().stats.hp > 0) {
			activeInstance.whatToDo();
			action = scanner.nextLine();
			activeInstance.getHero().doAction(action);
			if(((Room) activeInstance).isThere("Enemy", activeInstance.getHero().pos)) {
				Combat encounter = new Combat(activeInstance.getHero(), (Character) ((Room) activeInstance).notIn("Hero",activeInstance.getHero().pos));
				while (encounter.end() == false) {
					encounter.round();
				}
			}
		}
	}
}