package practice;
import multithreading.MyBlockingQueue;
import multithreading.MyRunnable;
import multithreading.ReadQueue;
import multithreading.WriteToFile;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBlockingQueue bq = new MyBlockingQueue(5);
		MyRunnable mr = new MyRunnable(bq);
		Thread writeToQueue = new Thread(mr);
		
		ReadQueue rq = new ReadQueue(bq);
		Thread readFromQueue = new Thread(rq);
		readFromQueue.setName("Reader Thread");
		
		
		WriteToFile wtf = new WriteToFile("D:\\jammu\\tree.txt");
		Thread writeToFile =  new Thread(wtf);
		writeToFile.setName("WriterThread");
//		writeToFile.start();

		
		writeToQueue.start();
		readFromQueue.start();


	}

}
