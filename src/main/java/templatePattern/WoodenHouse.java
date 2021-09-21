package templatePattern;

public class WoodenHouse extends HousePattern {
	
	public WoodenHouse() {
		System.out.println("Building Wooden House");
	}

	@Override
	public void buildWalls() {
		
		System.out.println("Build wooden walls");

	}

	@Override
	public void buildPillers() {
		System.out.println("Build pillers with wooden coating");

	}

}
