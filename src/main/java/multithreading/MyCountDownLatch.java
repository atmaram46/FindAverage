package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyCountDownLatch {
	
	private int count;
	
	/**
     * CountDownLatch is initialized with given count.
     * count specifies the number of events that must occur
     * before latch is released.
     */
	
	public MyCountDownLatch(int count) {
		
		this.count = count;
	}

	/**
    * Causes the current thread to wait until  one of the following things happens-
                 - latch count has down to reached 0, or
                 - unless the thread is interrupted.
    */
	
	public synchronized void await() throws InterruptedException {
		
		if(this.count > 0) {
			this.wait();
		}
	}
	
	/**
     *  Reduces latch count by 1.
     *  If count reaches 0, all waiting threads are released.
     */
	
//	CyclicBarrier cb;
	public synchronized void countDown() {
		
		count--;
		
		/**
		 *  if count reaches 0, notify the threads waiting.
		 * 
		 */
		
		if(this.count == 0) {
			this.notify();
		}
		
		 
	}

	public int getCount() {
		
		return this.count;
	}
}
