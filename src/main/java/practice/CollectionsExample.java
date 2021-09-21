package practice;

import java.util.Iterator;
import java.util.List;

public class CollectionsExample implements Iterable{

	String name;
	List<CollectionsExample> list;
	
//	public static void main(String[] args) {
//		
//
//	}

	@Override
	public Iterator iterator() {
		
		return list.iterator() ;
	}

}
