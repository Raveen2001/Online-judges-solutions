package Hackerrank.ProblemSolving.java;

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
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER k
     * 3. INTEGER_ARRAY arr
     */

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int i, count = 0;
        int page = 1, problemS = 0, problemE = 0;
        for (i = 0; i < n; i++) {
            System.out.println("Chapter : " + i);
            int temp = arr.get(i);
            problemS = 0;
            problemE = 0;
            while (temp >= problemS) {
                if (arr.get(i) - k > 0) {
                    problemE += k;
                    arr.set(i, arr.get(i) - k);
                } else {
                    problemE += arr.get(i);
                }
                System.out.println("Page: " + page + " Start: " + problemS + " End: " + problemE);
                if (problemS <= page && problemE >= page)
                    count++;
                page++;
                problemS = problemE + 1;
            }
            System.out.println("Next Chapter...");
        }
        return count;

    }

}

public class LisaWorkbook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
