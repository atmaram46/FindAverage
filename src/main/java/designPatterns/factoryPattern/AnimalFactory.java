package designPatterns.factoryPattern;

public class AnimalFactory {
	
	public Animals getAnimal(String animalName) {
		
		switch(animalName) {
		
		case AnimalNames.shark :
			return new SeaAnimal();
		case AnimalNames.lion : 
			return new LandAnimal();
			
		case AnimalNames.elephant:
			return new LandAnimal();
			
		case AnimalNames.whale:
			return new SeaAnimal();
		}
		
		return null;
	}

}
