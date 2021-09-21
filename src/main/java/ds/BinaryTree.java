package ds;

public class BinaryTree {

	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = this.right = null;
		}
		
		public boolean isLeafNode(Node node) {
			
			if(node.left == null && node.right == null) {
				return true;
			}
			return false;
		}
	}
	
	public BinaryTree() {
		this.root = null;
	}
	
	void createTree() {
		root = new Node(20);
		root.left = new Node(30);
		root.right = new Node(12);
		root.left.left = new Node(17);
		root.left.right = new Node(18);
		root.right.left = new Node(50);
		root.right.right = new Node(80);
		root.right.right.right = new Node(100);
		root.right.right.left = new Node(-1);
	}

	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.createTree();
		binaryTree.inoder(binaryTree.root);
//		System.out.println( ""+ binaryTree.height(binaryTree.root));
//		System.out.println("" + binaryTree.maxValue(binaryTree.root));
		System.out.println("");
		binaryTree.mirrorTree(binaryTree.root);
		binaryTree.inoder(binaryTree.root);
		System.out.println(5.0%2);
	}

	private int height(Node node) {
		
		if(node == null) {
			return 0;
		}
		else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			
			return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
		}
		
	}

	private int maxValue(Node node) {
		if(node.isLeafNode(node)) {
			return node.data;
		}
		int leftMax = maxValue(node.left);
		int maxRight = maxValue(node.right);
		
		return leftMax > maxRight? leftMax : maxRight;
	}
	private void inoder(Node node) {
		
		if(node == null) {
			return;
		}
		inoder(node.left);
		System.out.print(node.data + " ");
		inoder(node.right);
		
		
	}

	private void mirrorTree(Node node) {
		if(node == null) {
			return;
		}
		mirrorTree(node.left);
		swap(node);
		mirrorTree(node.right);
	}

	private void swap(Node node) {
		
		Node temp = null;
		temp = node.left;
		node.left = node.right;
		node.right = temp;
	}

}
