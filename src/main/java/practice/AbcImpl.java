package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbcImpl {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter 2 numbers : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		Abc add = (int a,int b) -> {
//			int a = x + y;
			System.out.println(a + b);
		};
		
		Abc sub = (int a, int b) -> {
			System.out.println(a - b);
		};
		
		add.doAbc(x, y);
		sub.doAbc(x, y);
		
		

	}

}
