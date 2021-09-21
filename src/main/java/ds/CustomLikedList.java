package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomLikedList {

	
	public static void main(String [] args) {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			
//			String name = br.readLine();                // Reading input from STDIN
////			System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//			sumOfMatrix(name);
//		}
//		catch(IOException io) {
//			io.printStackTrace();
//		}
//		finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		int i =0x000F,j = 0x2222;
		boolean a = false;
		if(a = true) {
			System.out.println("a");
		}else {
			System.out.println("b");
		}
		System.out.println(i & j);

	}

	private static void sumOfMatrix(String name) throws IOException {
		
		int row,col;
		String[] str = name.split(" ");
		row = Integer.parseInt(str[0]);
		col = Integer.parseInt(str[1]);
		int matrix[][] = new int[row][col];
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < row; i++) {
			String str1 = br.readLine();
			fillMatrix(matrix,str1, i);
		}
		
		int queries = Integer.parseInt(br.readLine()); 
		for(int a = 0; a < queries; a++) {
			String[] strArr = br.readLine().split(" "); 
			int finalRow = Integer.parseInt(strArr[0]) - 1;
			int finalCol = Integer.parseInt(strArr[1]) - 1;
			int sum = findSum(matrix,finalRow,finalCol);
			System.out.println(sum);
		}
//		printMat(matrix,row,col);
	}

	private static int findSum(int[][] matrix, int finalRow, int finalCol) {
		return finalCol;
		
	}

	private static void printMat(int[][] matrix,int row, int col) {
		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < col; j++) {
//				System.out.println(matrix[i][j]);
//			}
//		}
		
	}

	private static void fillMatrix(int[][] matrix, String line, int row) {
		
		String[] str = line.split(" ");
		for(int i = 0; i < str.length; i++) {
			matrix[row][i] = Integer.parseInt(str[i]);
		}
		
	}
}
