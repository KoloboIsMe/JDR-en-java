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
			dungeonEntities.add(new Enemy(dungeon, new Coordinate(2,2), "Goblin", new Statistic(10, 10, 10, 10, 10), new Weapon(dungeon, new Coordinate(0,0),"Bone Club", 8)));
				//the boss
			dungeonEntities.add(new Boss(dungeon, new Coordinate(3,3), "King Goblin", new Statistic(10, 10, 10, 10, 10), new Weapon(dungeon, new Coordinate(0,0),"Unholy Club", 25)));
			//Creation of the items
				//the weapons
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(0,0),"Rusty Sword", 2));
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(0,0),"Heavy Claymore", 10));
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(0,0),"Bone Club", 8));
			dungeonEntities.add(new Weapon(dungeon, new Coordinate(0,0),"Unholy Club", 25));
				//the artifacts	
			dungeonEntities.add(new Artifact(dungeon, new Coordinate(1,2), "Dark Talisman"));
				//the potions
			dungeonEntities.add(new HealingPotion(dungeon, new Coordinate(1,2), "Scarlet Potion", 10));
			//Creation of the other entities
				//the chests
			dungeonEntities.add(new Chest(dungeon, new Coordinate(1,2), dungeonEntities.get(1)));
				//the obstacles
			dungeonEntities.add(new Obstacle(dungeon, new Coordinate(4,3)));
				//finally, give some items to some enemies
		
		Instance activeInstance = dungeon;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Explore, open trasures, fight monsters, get experience and loot and become more powerfull to vanquish the boss !");
		activeInstance.whatToDo();
		
		//note : there must exist a boss and a hero for the game to run.
		while (activeInstance.getBoss().stats.hp > 0 && activeInstance.getHero().stats.hp > 0) { //The game ends when the boss is killed or the Hero is dead.
			activeInstance.getHero().doAction(scanner.nextLine());
			if(((Room) activeInstance).isThere("Enemy", activeInstance.getHero().pos) || ((Room) activeInstance).isThere("Boss", activeInstance.getHero().pos)) {
				Combat encounter = new Combat(activeInstance.getHero(), (Character) ((Room) activeInstance).notIn("Hero",activeInstance.getHero().pos));
				while (encounter.end() == false) {
					System.out.println("Round : " + encounter.turn);
					encounter.round();
				}
			}
		}
	}
}