package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StringProb1 {

	public static void main(String[] args) throws IOException {


			BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
			String str;
			try {
				str = br.readLine();
				System.out.println(neutrlizeString(str));
			}catch(IOException io) {
				System.out.println(io.getMessage());
			}finally {
				br.close();
			}

	}

	private static String neutrlizeString(String str) {
		String finalString = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i <= str.length() - 1; i++) {
			if(stack.isEmpty()) {
//				stack.add(str.charAt(i));
				stack.push(str.charAt(i));
			}else {
				if(stack.peek() != str.charAt(i)) {
					stack.push(str.charAt(i));
				}
			}
		}
		for(int i = stack.size() -1; i  >= 0; i--) {
			finalString = finalString + stack.remove(i);
		}
		
//		for(Character c : stack) {
//			finalString = finalString + c;
//		}
		return finalString;
		
	}

}
