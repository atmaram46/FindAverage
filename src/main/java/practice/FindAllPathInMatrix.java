package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllPathInMatrix {

//	public static void main(String[] args) {
//		int m = 3; 
//        int n = 3; 
//        int mat[][] = { { 1, 2, 3 },  
//                        { 4, 5, 6 } ,
//                        { 7, 8, 9 }
//                       }; 
//        
//        List<Integer> path = new ArrayList<Integer>();
//        int startRow = 0, startCol = 0;
//        
//        int endCol = n, endRow = m;
//        
//        printAllPaths(mat, startRow, startCol, endRow, endCol, path);
//
//	}
//
//	private static void printAllPaths(int[][] mat, int startRow, int startCol, int endRow, int endCol, List<Integer> path) {
//		/*
//		 * 
//		 *  Only right and down moves are allowed.
//		 * 
//		 */
//		
//		if(startRow == endRow -1 && startCol == endCol - 1) {
//			path.add(mat[startRow][startCol]);
//			for(int a : path) {
//				System.out.print( a + " ");
//			}
//			System.out.println("");
//			return;
//		}
//		
//		if( startRow >= endCol || startCol >= endCol) {
//			return;
//		}
//		
//		path.add(mat[startRow][startCol]);
//		
//		printAllPaths(mat, startRow + 1, startCol, endRow, endCol, path);
//		printAllPaths(mat, startRow, startCol + 1, endRow, endCol, path);
//		
//		
//	}
	
	
	/*
	 * 
	 * [ 1 2 3 4 ]
	 * 
	 * [ 5 6 7 8 ]
	 * 
	 * [ 9 10 11 12 ]
	 */
	
	
	
	
	
	
	public static void print(int arr[][],int row, int col,int result[],int pos){
        if(row == arr.length-1 && col == arr[0].length-1){
            result[pos] = arr[row][col];
            System.out.println(Arrays.toString(result));
            return;
        }
        if(row >= arr.length || col >= arr[0].length){
            return;
        }
        
        result[pos] = arr[row][col];
        print(arr,row,col+1,result,pos+1);
        print(arr,row+1,col,result,pos+1);
    }
    
    public static void main(String args[]){
        
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int result[] = new int[arr.length + arr[0].length-1];
        print(arr, 0, 0, result,0);
    }

}
