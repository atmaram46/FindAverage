package templatePattern;

public class GlassHouse extends HousePattern {

	public GlassHouse() {
		System.out.println("Building Glass house");
	}
	
	@Override
	public void buildWalls() {

		System.out.println("Build glass walls");

	}

	@Override
	public void buildPillers() {

		System.out.println("Build pillers with glass coating");

	}

}
