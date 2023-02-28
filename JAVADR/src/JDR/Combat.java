package JDR;

import Character.Character;

public class Combat {
	public Character char1;
	public Character char2;
	public int turn;
	
	public Combat (Character char1, Character char2) {
		this.char1 = char1;
		this.char2 = char2;
		turn = 0;
		System.out.println("A combat between " + char1.name + " and " + char2.name + "has started.");
	}
	
	public void round (){
		if (char1.stats.speed >= char2.stats.speed) {
			this.char1.attack(this.char2);
			this.char2.attack(this.char1);
		}
		else {
			this.char2.attack(this.char1);
			this.char1.attack(this.char2);
		}
		this.turn += 1;
	}
	
	public boolean end () {
		if (this.char1.stats.hp <= 0 &&this.char2.stats.hp <= 0) {
			System.out.println("Combat has ended.");
			return true;
		}
		return false;
	}
}
