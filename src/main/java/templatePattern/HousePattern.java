package templatePattern;

public abstract class HousePattern {
	public final void buildHouse() {
		buildFoundation();
		buildPillers();
		buildWalls();
		buildWindows();
	}

	public abstract void buildWalls();

	public abstract void buildPillers();
	
	private void buildFoundation() {
		System.out.println("Building foundation");
	}
	
	private void buildWindows() {
		System.out.println("Building windows");
	}
	
}
