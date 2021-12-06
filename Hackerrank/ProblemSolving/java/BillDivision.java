package Hackerrank.ProblemSolving.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY bill
     * 2. INTEGER k
     * 3. INTEGER b
     */
    public static boolean DEBUG = false;

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int i;
        long sum = 0;
        for (i = 0; i < bill.size(); i++) {
            if (i != k)
                sum += (long) bill.get(i);
        }
        if (DEBUG) {
            System.out.println("Sum: " + sum);
        }
        int share = (int) sum / 2;
        if (share == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - share);
        }
    }

}

public class BillDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billTemp[i]);
            bill.add(billItem);
        }

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
