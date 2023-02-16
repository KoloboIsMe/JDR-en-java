package Items;

public class Potion extends Item{
	public Potion(String entityType, int x, int y, String name) {
		super(entityType, x, y, name);
	}
	@Override
	public String getType() {
		String ret = "Potion";
		return ret;
	}
}
