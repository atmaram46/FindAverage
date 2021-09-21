package multithreading;



public class ReadQueue implements Runnable {
	MyBlockingQueue bq;
	
	public ReadQueue(MyBlockingQueue bq) {
		this.bq = bq;
	}

	public void run() {
		
		try {
			Thread.sleep(100);
			read();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void read() throws InterruptedException {
//		int odd = 0,even = 0;
		while(true){
			System.out.println("Read : " + this.bq.getItem());
		}
//		System.out.println("Even : " + even +"\nOdd : " + odd);
		
	}

}
