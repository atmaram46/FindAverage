package practice;


public class FILO {
	static Node front, rear; 
	public static void main(String[] args) {
		
		String str = "6,90,11,23,43,5,67";
		createList(str);
		System.out.println(deque());
//		printList();
	}
	private static void printList() {
		Node temp = front;
		while(temp != rear) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	private static void createList(String str) {

		String [] strArr = str.split(",");
		for(String s : strArr) {
			Node newNode = new Node(Integer.parseInt(s));
			if(front == null && rear == null) {
				front = rear = newNode;
			}else {
				rear.next = newNode;
				newNode = rear;
			}
		}
		printList();
	}
	
	private static int deque() {
		Node temp = front;
		front = front.next;
		int data = temp.data;
		temp = null;
		return data;
	}

}
