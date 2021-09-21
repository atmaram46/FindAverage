package multithreading;

public class MyReEntrantLock {
	
	private boolean isLocked;
	private Thread lockingThread;
	private int lockCount;
	
	public MyReEntrantLock() {
		this.isLocked = false;
		this.lockCount = 0;
		this.lockingThread = null;
	}
	
	public synchronized void lock() throws InterruptedException {
		while(this.isLocked && Thread.currentThread() != this.lockingThread) {
			wait();
		}
		
		this.isLocked = true;
		this.lockingThread = Thread.currentThread();
		lockCount++;
	}
	
	public synchronized void unlock() {
		
		if(Thread.currentThread() == this.lockingThread && this.lockCount == 0) {
			this.isLocked = false;
			this.lockingThread = null;
			notifyAll();
		}
		if(Thread.currentThread() == this.lockingThread){
			this.lockCount--;
		}
	}

}
