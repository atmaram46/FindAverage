package ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getUmbrellas' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY p
     */

    public static int getUmbrellas(int n, List<Integer> p) {
            int temp = n;
            int noOfUmbellas = 0;
            for(int i = 0; i < p.size(); i++) {
                if(p.get(i) > temp) {
                    
                }else if(p.get(i) == temp){
                    
                    return 1;
                }else {
                    noOfUmbellas++;
                    n = n-p.get(i);
                }
            }
            if(n > 0){
                return -1;
            }
            return noOfUmbellas;
            
        }

}

public class Abc {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int pCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> p = IntStream.range(0, pCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());

    	int n =4;
    	List<Integer> p = new ArrayList<Integer>();
    	p.add(2);
    	p.add(4);
        int result = Result.getUmbrellas(n, p);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}