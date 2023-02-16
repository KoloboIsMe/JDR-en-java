package JDR;

import java.util.*;

import Character.Character;
import Character.Hero;
import Character.Enemy;

import Dungeon.Chest;
import Dungeon.Entity;
import Dungeon.Map;

import Items.Item;
import Items.Weapon;
import Items.Artifact;
import Items.Potion;

import JDR.Combat;
import JDR.Round;
import JDR.Input;
import JDR.Output;

// Items are at x=0 and y=0 when in inventory

public class Main {
	public static void main(String[] args){
		List<Entity> entities [];
		
		entities.add(new Chest("Chest", 1,1, new Weapon("Weapon_02", 0,0,"Sword of the tides", 10)));
		add(new Weapon("Weapon", 2,2,"Rusty Sword", 2));
		add(new Enemy("Enemy", 3,3, "Goblin", 7, 3, 0, 7, 7));
		add(new Hero("Hero", 1,2, "Léo", 0, 1, 2, 20, 5));
		
		Map dungeon = new Map(entities,10,10);
		System.out.println();
		
	}
}