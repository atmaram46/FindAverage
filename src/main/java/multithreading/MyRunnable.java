package multithreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyRunnable implements Runnable {

	MyBlockingQueue bq;
	public void run() {
		// TODO Auto-generated method stub
		method1();
	}
	public MyRunnable(MyBlockingQueue bq2) {
		// TODO Auto-generated constructor stub
		this.bq = bq2;
	}
	private void method1() {
		// TODO Auto-generated method stub
		File file = new File("D:\\jammu\\tree.txt");
		try {
			String st;
			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				while((st = br.readLine()) != null) {
					String[] str = st.split(" ");
					putintoQ(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	private void putintoQ(String[] str) {
		
		int len = 0;
		while(len < str.length) {
			try {
				System.out.println("Write : " + str[len]);
				bq.putItem(Integer.parseInt(str[len]));
//				try {
////					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			}
			len++;
		}
	}

}
