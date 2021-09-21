package ds;

public class MyLinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	void deleteKey(int key) {

		Node temp = head, prev = null;
		while(temp != null || temp.data != key) {
			if(temp.data == key) {
				if(prev == null) {
					prev = temp.next;
					temp.next = null;
					head = prev;
					return;
				}
				prev.next = temp.next;
				temp.next = null;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		System.out.println("Key not found...");
	}

	void pushKey(int key) {
	
		Node newNode = new Node(key);
		newNode.next = head;
		head = newNode;
	}
	
	void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list = new MyLinkedList();
		
		list.pushKey(10);
		list.pushKey(15);
		list.pushKey(1);
		list.pushKey(19);
		
		list.printList();
		list.deleteKey(10);
		System.out.println("");
		list.printList();
	}

}

