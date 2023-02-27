package Items;

import JDR.Coordinate;
import JDR.Instance;

public class Artifact extends Item{
	public Artifact(Instance instance, Coordinate pos, String name) {
		super(instance, pos, name);
	}
	@Override
	public String getType() {
		String ret = "Artifact";
		return ret;
	}
}
