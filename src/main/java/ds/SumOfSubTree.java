package ds;

class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
public class SumOfSubTree {
	
	    int countSubtreesWithSumX(Node root, int x)
	    {
	    	int count = 0;
	    	count = countNoOfSubTrees(root,x);
			return x;
		
	    }

		private int countNoOfSubTrees(Node root, int x) {
			if(root == null) {
				return 0;
			}
			
			return 0;
		}
	
}
