package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.Time;

public class Factorial {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter a number :");
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			long num = Long.parseLong(br.readLine());
			Time start = new Time(System.currentTimeMillis());
			BigInteger fact = fact(num);
			Time end = new Time(System.currentTimeMillis());
			System.out.println(fact + " in " );
			System.out.println (end.getTime() - start.getTime());
		}

	}

	private static BigInteger fact(long num) {
//		double n;
		if(num == 1) {
			return BigInteger.ONE;
		}
		return fact(num -1 ).multiply(BigInteger.valueOf(num));
		
	}

}
