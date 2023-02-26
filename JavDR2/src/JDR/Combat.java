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
		System.out.println("Combat has started.");
	}
	
	public void round () {
		if (char1.getSpeed() >= char2.getSpeed()) {
			this.char1.attack(char2);
		}
		else {
			this.char1.attack(char2);
		}
		this.turn += 1;
	}
	
	public boolean end () {
		if (this.char1.getHP() <= 0 || this.char2.getHP() <= 0) {
			System.out.println("Combat has ended.");
			return true;
		}
		return false;
	}
}
