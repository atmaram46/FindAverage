package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Circle{
	int x;
	int y;
	int radius;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
}
public class Circles {
	
	

	public static void main(String[] args) throws IOException{
		/* given two circles,
		*
		*	C1 = (3,4)
		*	C2 = (14,18)
		*	R1 = 5
		*	R2 = 8
		*
		*/
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first circle(x1,y1, radius) : ");
		String s = br.readLine();
		
		String [] s1  = s.split(",");
		Circle c1 = new Circle(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
		System.out.println("Enter second circle(x1,y1, radius) : ");
		s = br.readLine();
		
		s1  = s.split(",");
		Circle c2 = new Circle(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
		
		calculateCircles(c1,c2);

	}

	private static void calculateCircles(Circle c1, Circle c2) {
		
		int distanceC1C2 = (((c1.x - c2.x)*(c1.x - c2.x)) + (c1.y - c2.y)*(c1.y - c2.y));
		int radsq = (c1.radius + c2.radius) * (c1.radius + c2.radius);
		if(distanceC1C2 == radsq) {
			System.out.println("Circles touch each other");
		}else if(distanceC1C2 > radsq) {
			System.out.println("Circle do not touch each other");
		}else {
			System.out.println("Circles Intersect");
		}
		
	}

}
