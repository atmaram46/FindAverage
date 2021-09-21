package multithreading;

public class CountDownThread implements Runnable {

	MyCountDownLatch myLatch;
	
	public CountDownThread(MyCountDownLatch latch) {
		
		this.myLatch = latch;
		
	}
	
	
	public void run() {
		
		try {
				doSomething(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

	}


	private void doSomething(long i) throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + " Doing something for " + i/1000 + " seconds.");
		Thread.sleep(i);
		System.out.println(Thread.currentThread().getName()  + " Work complete");
		myLatch.countDown();
	}

}
