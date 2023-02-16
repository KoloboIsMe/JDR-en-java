package Items;

public class Artifact extends Item{
	public Artifact(String entityType, int x, int y, String name) {
		super(entityType, x, y, name);
	}
	@Override
	public String getType() {
		String ret = "Artifact";
		return ret;
	}
}
