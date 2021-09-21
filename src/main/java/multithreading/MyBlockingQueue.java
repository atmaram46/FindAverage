package multithreading;

import java.util.ArrayList;
import java.util.List;

public class MyBlockingQueue {

	private List<Integer> list;
	private int limit;
	public MyBlockingQueue(int limit) {
		this.list = new ArrayList<Integer>();
		this.limit = limit;
	}
	
	public synchronized void putItem(Object item) {
		while(this.list.size() >= this.limit) {
			try {
				System.out.println(Thread.currentThread().getName() + " waiting");
				wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
		if(this.list.size() == 0) {
			notifyAll();
		}
		
		this.list.add((Integer)item);
	}
	
	public synchronized int getItem() {
		int item;
		
		while(this.list.size() == 0) {
			try {
				System.out.println(Thread.currentThread().getName() + " Waiting");
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		if(this.list.size() == this.limit) {
			notifyAll();
		}
		
		item = this.list.remove(0);
		return item;
	}

	public int size() {
		return this.list.size();
	}
}
