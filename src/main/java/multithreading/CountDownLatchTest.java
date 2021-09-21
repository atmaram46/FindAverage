package multithreading;

public class CountDownLatchTest {

	public static void main(String[] args) {
		
		
		System.out.println( "******** CountDown Latch demo ************");
		MyCountDownLatch myLatch = new MyCountDownLatch(3);
		System.out.println(" Current count :" + myLatch.getCount());
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(new CountDownThread(myLatch));
		t.setName("Thread A");
		
		Thread t1 = new Thread(new CountDownThread(myLatch));
		t1.setName("Thread B");
		
		Thread t2 = new Thread(new CountDownThread(myLatch));
		t2.setName("Thread C" );
		t.start();
		t1.start();
		t2.start();
		try {
			myLatch.await();
		}catch(InterruptedException ie) {
			System.out.println(ie.toString());
		}
		System.out.println("Waking up after all threads have completed work");
		System.out.println(Thread.currentThread().getName() + " : Vijay Jamdagni");
		

	}

}
