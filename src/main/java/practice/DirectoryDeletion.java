package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.RootPaneContainer;

class Dir{
	int id;
	List<Dir> dirList;
	
	public Dir(int id, ArrayList<Dir> list) {
		this.id = id;
		this.dirList = list;
	}
	
	public int getId() {
		return this.id;
	}
	
}

public class DirectoryDeletion {
	
	static Dir root = null;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfNode = Integer.parseInt(br.readLine());
		Node root = createTree(br.readLine().split(" "), null, 0);

	}

	private static Node createTree(String[] nodes, Node root, int i) {
		
		if(i < nodes.length) {
			
			
		}
		return root;

	}
}
