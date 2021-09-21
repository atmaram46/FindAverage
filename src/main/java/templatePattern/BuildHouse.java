package templatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildHouse {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter house type:");
			System.out.println("1. Glass");
			System.out.println("2. Wood");
			String houseType = br.readLine();
			if(houseType.toUpperCase().equals(HouseType.glass)) {
				HousePattern house = new GlassHouse();
				house.buildHouse();
			}else if(houseType.toUpperCase().equals(HouseType.wood)) {
				HousePattern house = new WoodenHouse();
				house.buildHouse();
			}
			
		}catch(IOException io) {
			System.out.println(io.toString());
		}finally {
			br.close();
		}

	}

}
