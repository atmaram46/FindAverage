package practice;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;		
	}
}
public class FIFO {
	
	static Node head;

	public static void main(String[] args) throws IOException{


		System.out.println("Insert nodes of linked list(comma seperated) :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] strArr = str.split(",");
		for(int i = 0; i< strArr.length; i++) {
			
			insert(Integer.parseInt(strArr[i]));
		}
		
		printList();
		while(head != null) {
			System.out.println(pop());
		}
	}

	private static int pop() {
		
		Node temp = head;
		int data;
		if (temp == null) {
			return -1000;
		}else {
			head = head.next;
//			temp.next = null;
			data = temp.data;
			temp = null;
		}
		
		return data;
	}

	private static void printList() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	private static void insert(int data) {
		
		if(head == null) {
			head = new Node(data);
		}else {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}	
	}
	
	

}
