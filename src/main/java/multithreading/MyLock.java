package multithreading;

public class MyLock {

	private boolean isLocked = false;
	
	public synchronized void lock () throws InterruptedException {
		while(this.isLocked) {
			wait();
		}
		
		this.isLocked = true;
	}
	
	
	public synchronized void unlock() {
		
		this.isLocked = false;
		notifyAll();
	}
	
}
