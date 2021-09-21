package practice;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.HashMap;


public class MyCustomCache{
	

	static Deque<Integer> queue;
	
	static HashSet<Integer> map;
	
	static int cacheSize;
	
	public MyCustomCache(int size) {
		this.queue = new LinkedList<Integer>();
		this.map = new HashSet<Integer>();
		this.cacheSize = size;
	}
	
	public void refer(int searchFor) {
		
		if(!map.contains(searchFor)) {
			if(queue.size() == cacheSize) {
				// Queue is full, Removing last element from map and queue.
				
				int lastElement = queue.removeFirst();
				map.remove(lastElement);
			}
		}
		else {
			
			// Insert into map and queue

			queue.remove(searchFor);
		}
		
		queue.add(searchFor);
		map.add(searchFor);
	}
	
	public void display() 
    { 
        Iterator<Integer> itr = queue.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        MyCustomCache ca = new MyCustomCache(4); 
        ca.refer(1); 
        ca.refer(2); 
        ca.refer(3); 
        ca.refer(1); 
        ca.refer(4); 
        ca.refer(3);
        ca.refer(5); 
        ca.display(); 
    } 
}