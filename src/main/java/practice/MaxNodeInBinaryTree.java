package practice;

import java.util.LinkedList;
import java.util.Queue;

class Nodes{
	int data;
	Nodes left,right;
	
	Nodes(int data){
		this.data = data;
		left = right = null;
	}
}

public class MaxNodeInBinaryTree {

	public static void main(String[] args) {
		Queue<Nodes> qNode = new LinkedList<Nodes>();
		Nodes root = null;
		root = createBinaryTree( root);
		int max = maxNodeValue(root);
		System.out.println("Maximum node = " + max);
		int height = heightOfTree(root);
		System.out.println("height =  " + height);
		levelOrder(root,qNode);
		int min  = findMin(root);
		System.out.println("Minimum node value : "+ min);
	}

	private static int findMin(Nodes root) {
		
		if(root == null) {
			return 0;
		}
		int min = root.data;
		int leftMin = findMin(root.left);
		int rightMin = findMin(root.right);
		
		if(min < leftMin) {
			return min;
			
		}else if(min < rightMin) {
			return rightMin;
		}else 
			return min;
		
	}

	private static int maxNodeValue(Nodes root) {
		
		if(root == null) {
			return 0;
		}
		int rootData = root.data;
		int left = maxNodeValue(root.left);
		int right = maxNodeValue(root.right);
		if(left > rootData) {
			return left;
		}else if(right > rootData) {
			return right;
		}else {
			return rootData;
		}
		
	}
	
	private static int heightOfTree(Nodes root) {
		if(root == null) {
			return 0;
		}else {
		
			int leftHeight = heightOfTree(root.left);
			int rightHeight = heightOfTree(root.right);
		
			return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
		}
	}

	private static void levelOrder(Nodes root, Queue<Nodes> qNode) {
		
		
		if(root == null)
			return;
		qNode.add(root);
		while(!qNode.isEmpty()) {
			Nodes current = qNode.remove();
			System.out.println(current.data );
			if(current.left != null) {
				qNode.add(current.left);
			}
			if(current.right != null) {
				qNode.add(current.right);
			}
		}
		
	}
	
	
	private static Nodes createBinaryTree(Nodes root) {

//		root = new Nodes(50);
//		root.left = new Nodes(30);
//		root.left.left = new Nodes(210);
//		root.left.right = new Nodes(40);
//		root.right = new Nodes(90);
//		root.right.left = new Nodes(70);
//		root.right.right = new Nodes(100);
//		root.right.left.right = new Nodes(150);
		
		root = new Nodes(50);
		root.left = new Nodes(10);
		root.right = new Nodes(30);
		root.left.left = new Nodes(7);
		return root;
	}

}
