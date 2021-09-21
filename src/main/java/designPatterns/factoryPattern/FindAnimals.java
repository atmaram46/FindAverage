package designPatterns.factoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAnimals {

	public static void main(String[] args) {
		
		String animalName;
		AnimalFactory animalFactory = new AnimalFactory();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Animal Name :");
		
		try {
			animalName = br.readLine();
//			System.out.println(animalName);
			String[] strArr = animalName.split(",");
			for(String str : strArr) {
				animalFactory.getAnimal(str);
			}
//			animalFactory.getAnimal(animalName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
