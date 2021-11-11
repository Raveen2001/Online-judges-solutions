package ProblemSolving;

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

class Result3 {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int aCount = 0, oCount = 0;
        for(int apple: apples){
            if(apple+a>=s && apple+a <=t){
                aCount++;
            }
        }
    
        for(int orange: oranges){
            if(s<=(orange+b) && (orange+b)<=t){
                oCount++;
            }
        }
        

        System.out.println(aCount + " " + oCount);
        
    }

}

public class ApplesAndOranges {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int s = Integer.parseInt(firstMultipleInput[0]);

        // int t = Integer.parseInt(firstMultipleInput[1]);

        // String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int a = Integer.parseInt(secondMultipleInput[0]);

        // int b = Integer.parseInt(secondMultipleInput[1]);

        // String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int m = Integer.parseInt(thirdMultipleInput[0]);

        // int n = Integer.parseInt(thirdMultipleInput[1]);

        // List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // Result3.countApplesAndOranges(s, t, a, b, apples, oranges);
        Result3.countApplesAndOranges(7, 11, 5, 15,  Arrays.asList(new Integer[]{-2, 2, 1}),  Arrays.asList(new Integer[]{5, -6}));


        // bufferedReader.close();
    }
}

