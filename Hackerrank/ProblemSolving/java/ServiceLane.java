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
     * Complete the 'serviceLane' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. 2D_INTEGER_ARRAY cases
     */

    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        List<Integer> res = new ArrayList<>();
        int i, min = 4, j;
        int l = 0, r = 0;
        for (i = 0; i < cases.size(); i++) {
            l = cases.get(i).get(0);
            r = cases.get(i).get(1);
            for (j = l; j <= r; j++) {
                if (width.get(j) < min)
                    min = width.get(j);
            }
            res.add(min);
            min = 4;
        }
        return res;

    }

}

public class ServiceLane {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] widthTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> width = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int widthItem = Integer.parseInt(widthTemp[i]);
            width.add(widthItem);
        }

        List<List<Integer>> cases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String[] casesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> casesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int casesItem = Integer.parseInt(casesRowTempItems[j]);
                casesRowItems.add(casesItem);
            }

            cases.add(casesRowItems);
        }

        List<Integer> result = Result.serviceLane(n, width, cases);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
