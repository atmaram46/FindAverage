package practice;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
	
	
	public String removeDuplicatesUsingMap(String str) {
		String finalStr = "";
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i = 0; i< str.length(); i++) {
			if(charMap.containsKey(str.charAt(i))){
				charMap.put(str.charAt(i),charMap.get(str.charAt(i)) + 1);
			}else {
				charMap.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character,Integer> e : charMap.entrySet()) {
			if(e.getValue() == 1)
			finalStr += e.getKey();
		}
		return finalStr;
	}
	
	public String removeDuplicateUsingArray(String str) {
		String finalStr = "";
		str= str.toLowerCase();
		int []charArr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			charArr[str.charAt(i) - 97] = charArr[str.charAt(i) - 97] + 1;
		}
		
		for(int i =0; i< charArr.length; i++) {
			char c;
			if(charArr[i] == 1) {
				c= (char) ((char)i + 97);
				finalStr += c;
			}
		}
		return finalStr;
	}

	public static void main(String[] args) {
		RemoveDuplicate rd = new RemoveDuplicate();
		System.out.println("After removing duplicated from aaaabbcdefghiikljoofert : " + 
		rd.removeDuplicatesUsingMap("aaaabbcdefghiikljoofert"));
		
		System.out.println("After removing duplicated from aaaabbcdefghiikljoofertdddaaaaaaaaa : " + 
				rd.removeDuplicateUsingArray("aaaabbcdefghiikljoofert"));
		
	}

}
