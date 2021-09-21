package multithreading;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class WriteToFile implements Runnable {

		String file;
	public void run() {
//		String file = "D:\\\\jammu\\\\tree.txt";
		writeToFile(file);
	}

	public WriteToFile(String str) {
		this.file = str;
	}
	private void writeToFile(String fileName) {
		
		
		
		try {
			FileWriter file = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(file);
			int count = 0;
			while(count++ < 300) {
				int random = ThreadLocalRandom.current().nextInt(-150,500);
				System.out.println("Writing : " +random);
				bw.write(random + " ");
			}
			bw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
}
